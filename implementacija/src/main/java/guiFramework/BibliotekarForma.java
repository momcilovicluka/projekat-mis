package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

public class BibliotekarForma {

	private JFrame frmBibliotekaBibliotekar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BibliotekarForma window = new BibliotekarForma();
					window.frmBibliotekaBibliotekar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BibliotekarForma() {
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

		frmBibliotekaBibliotekar = new JFrame();
		frmBibliotekaBibliotekar.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(BibliotekarForma.class.getResource("/guiFramework/book-stack.png")));
		frmBibliotekaBibliotekar.setTitle("Biblioteka - Bibliotekar");
		frmBibliotekaBibliotekar.setBounds(100, 100, 312, 248);
		frmBibliotekaBibliotekar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBibliotekaBibliotekar.getContentPane().setLayout(null);

		JButton btnDodajKnjigu = new JButton("Dodavanje knjige");
		btnDodajKnjigu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnDodajKnjigu.setBounds(32, 15, 233, 82);
		frmBibliotekaBibliotekar.getContentPane().add(btnDodajKnjigu);

		JButton btnIzdavanjeKnjige = new JButton("Izdavanje knjige");
		btnIzdavanjeKnjige.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdavanjeKnjige.setBounds(32, 112, 233, 82);
		frmBibliotekaBibliotekar.getContentPane().add(btnIzdavanjeKnjige);
	}

}
