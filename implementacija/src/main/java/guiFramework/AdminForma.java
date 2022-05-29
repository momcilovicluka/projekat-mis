package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

public class AdminForma {

	private JFrame frmBibliotekaAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminForma window = new AdminForma();
					window.frmBibliotekaAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminForma() {
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
		frmBibliotekaAdmin = new JFrame();
		frmBibliotekaAdmin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(AdminForma.class.getResource("/guiFramework/book-stack.png")));
		frmBibliotekaAdmin.setTitle("Biblioteka - Admin");
		frmBibliotekaAdmin.setBounds(100, 100, 280, 330);
		frmBibliotekaAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBibliotekaAdmin.getContentPane().setLayout(null);

		JButton btnDodavanje = new JButton("Dodavanje bibliotekara");
		btnDodavanje.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnDodavanje.setBounds(16, 11, 233, 82);
		frmBibliotekaAdmin.getContentPane().add(btnDodavanje);

		JButton btnIzdavanjeKnjige = new JButton("Izdavanje knjige");
		btnIzdavanjeKnjige.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdavanjeKnjige.setBounds(16, 104, 233, 82);
		frmBibliotekaAdmin.getContentPane().add(btnIzdavanjeKnjige);

		JButton btnDodavanjeClana = new JButton("Dodavanje člana");
		btnDodavanjeClana.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnDodavanjeClana.setBounds(16, 197, 233, 82);
		frmBibliotekaAdmin.getContentPane().add(btnDodavanjeClana);
	}
}
