package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DodavanjeBibliotekaraForma {

	private JFrame frmNoviBibliotekar;
	private JTextField tfIme;
	private JTextField tfPrezime;
	private JTextField textField;
	private JTextField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodavanjeBibliotekaraForma window = new DodavanjeBibliotekaraForma();
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

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.setBorderPainted(false);
		btnSacuvaj.setBackground(new Color(246, 245, 245));
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(77, 133, 103, 21);
		frmNoviBibliotekar.getContentPane().add(btnSacuvaj);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblUsername.setBounds(31, 70, 89, 19);
		frmNoviBibliotekar.getContentPane().add(lblUsername);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(122, 74, 96, 19);
		frmNoviBibliotekar.getContentPane().add(textField);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPassword.setBounds(34, 100, 86, 19);
		frmNoviBibliotekar.getContentPane().add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfPassword.setColumns(10);
		tfPassword.setBounds(122, 104, 96, 19);
		frmNoviBibliotekar.getContentPane().add(tfPassword);
	}
}
