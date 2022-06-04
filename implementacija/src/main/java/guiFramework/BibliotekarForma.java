package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frmBibliotekaBibliotekar.setBounds(100, 100, 291, 347);
		frmBibliotekaBibliotekar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBibliotekaBibliotekar.getContentPane().setLayout(null);

		JButton btnDodajKnjigu = new JButton("Dodavanje knjige");
		btnDodajKnjigu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DodavanjeKnjigeForma();
				DodavanjeKnjigeForma.main(null);
			}
		});

		btnDodajKnjigu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnDodajKnjigu.setBounds(22, 16, 233, 82);
		frmBibliotekaBibliotekar.getContentPane().add(btnDodajKnjigu);

		JButton btnIzdavanjeKnjige = new JButton("Izdavanje knjige");
		btnIzdavanjeKnjige.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new KnjigaForma();
				KnjigaForma.main(null);
			}
		});

		btnIzdavanjeKnjige.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdavanjeKnjige.setBounds(22, 114, 233, 82);
		frmBibliotekaBibliotekar.getContentPane().add(btnIzdavanjeKnjige);

		JButton btnRezervacija = new JButton("Izdavanje rezervacije");
		btnRezervacija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RezervacijaForma();
				RezervacijaForma.main(null);
			}
		});

		btnRezervacija.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRezervacija.setBounds(22, 212, 233, 82);
		frmBibliotekaBibliotekar.getContentPane().add(btnRezervacija);
	}

}
