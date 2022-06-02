package guiFramework;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Admin;
import klaseSaAtributima.Bibliotekar;
import klaseSaAtributima.Korisnik;
import kontrolKlase.LogovanjeKontroler;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmBiblioteka;
	private JTextField tfUsername;
	private JPasswordField pfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBiblioteka.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
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
			e.printStackTrace();
		}

		frmBiblioteka = new JFrame();
		frmBiblioteka.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/guiFramework/book-stack.png")));
		frmBiblioteka.setResizable(false);
		frmBiblioteka.setTitle("Biblioteka - Login");
		frmBiblioteka.setBounds(100, 100, 389, 260);
		frmBiblioteka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbUsername = new JLabel("Username:");
		lbUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		tfUsername = new JTextField();
		tfUsername.setColumns(10);

		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblNewLabel = new JLabel("BIBLIOTEKA");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));

		JButton btnLogin = new JButton("Login");

		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));

		pfPassword = new JPasswordField();
		GroupLayout groupLayout = new GroupLayout(frmBiblioteka.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(76).addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(63).addComponent(btnLogin,
										GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lbUsername, GroupLayout.PREFERRED_SIZE, 86,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout
														.createSequentialGroup().addGap(2).addComponent(lbPassword)))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(pfPassword).addComponent(tfUsername,
														GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup().addGap(102).addComponent(lblNewLabel)))
				.addContainerGap(76, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(32)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbUsername))
						.addGap(10)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbPassword)
								.addComponent(pfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(32, Short.MAX_VALUE)));
		frmBiblioteka.getContentPane().setLayout(groupLayout);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Dobar");
				String username = tfUsername.getText().trim();
				String password = String.valueOf(pfPassword.getPassword()).trim();

				Korisnik korisnik;
				try {
					korisnik = LogovanjeKontroler.prijava(username, password);

					if (korisnik == null)
						throw new IllegalArgumentException("Taj korisnik ne postoji!");

					if (korisnik instanceof Admin) {
						frmBiblioteka.setVisible(false);

						new AdminForma();
						AdminForma.main(null);
					} else if (korisnik instanceof Bibliotekar) {
						frmBiblioteka.setVisible(false);

						new BibliotekarForma();
						BibliotekarForma.main(null);
					}

					frmBiblioteka.dispose();
				} catch (IllegalArgumentException e1) {
					JOptionPane.showMessageDialog(frmBiblioteka, e1.getMessage(), "Pogrešan unos",
							JOptionPane.WARNING_MESSAGE);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(frmBiblioteka, "Došlo je do greške!", "Greška",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}
