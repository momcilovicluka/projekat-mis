package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Bibliotekar;
import kontrolKlase.BibliotekarKontroler;

public class DodavanjeBibliotekaraForma {

	private JFrame frmNoviBibliotekar;
	private JTextField tfIme;
	private JTextField tfPrezime;
	private JTextField tfUsername;
	private JTextField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodavanjeBibliotekaraForma window = new DodavanjeBibliotekaraForma();
					window.frmNoviBibliotekar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmNoviBibliotekar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DodavanjeBibliotekaraForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frmNoviBibliotekar = new JFrame();
		frmNoviBibliotekar.setForeground(UIManager.getColor("Button.background"));
		frmNoviBibliotekar.setResizable(false);
		frmNoviBibliotekar.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DodavanjeBibliotekaraForma.class.getResource("/guiFramework/book-stack.png")));
		frmNoviBibliotekar.setTitle("Novi bibliotekar");
		frmNoviBibliotekar.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frmNoviBibliotekar.setBounds(100, 100, 271, 199);
		frmNoviBibliotekar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoviBibliotekar.getContentPane().setLayout(null);

		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIme.setBounds(75, 11, 45, 19);
		frmNoviBibliotekar.getContentPane().add(lblIme);

		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPrezime.setBounds(46, 41, 74, 19);
		frmNoviBibliotekar.getContentPane().add(lblPrezime);

		tfIme = new JTextField();
		tfIme.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfIme.setBounds(122, 11, 96, 19);
		frmNoviBibliotekar.getContentPane().add(tfIme);
		tfIme.setColumns(10);

		tfPrezime = new JTextField();
		tfPrezime.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfPrezime.setColumns(10);
		tfPrezime.setBounds(122, 41, 96, 19);
		frmNoviBibliotekar.getContentPane().add(tfPrezime);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblUsername.setBounds(31, 70, 89, 19);
		frmNoviBibliotekar.getContentPane().add(lblUsername);

		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfUsername.setColumns(10);
		tfUsername.setBounds(122, 74, 96, 19);
		frmNoviBibliotekar.getContentPane().add(tfUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPassword.setBounds(34, 100, 86, 19);
		frmNoviBibliotekar.getContentPane().add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfPassword.setColumns(10);
		tfPassword.setBounds(122, 104, 96, 19);
		frmNoviBibliotekar.getContentPane().add(tfPassword);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ime = tfIme.getText();
					String prezime = tfPrezime.getText();
					String username = tfUsername.getText();
					String password = tfPassword.getText();

					Bibliotekar b = new Bibliotekar(ime, prezime, username, password);
					boolean dodat = BibliotekarKontroler.sacuvajBibliotekara(b);
					if (dodat)
						JOptionPane.showMessageDialog(frmNoviBibliotekar, "Bibliotekar je uspešno dodat", "Uspeh",
								JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(frmNoviBibliotekar, "Bibliotekar nije dodat", "Greška",
								JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(frmNoviBibliotekar, ex.getMessage(), "Greska",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(79, 130, 96, 23);
		frmNoviBibliotekar.getContentPane().add(btnSacuvaj);
	}
}
