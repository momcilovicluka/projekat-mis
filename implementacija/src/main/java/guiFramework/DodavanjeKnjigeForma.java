package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Autor;
import klaseSaAtributima.Knjiga;
import klaseSaAtributima.Zanr;
import kontrolKlase.DodavanjeKnjigeKontroler;

public class DodavanjeKnjigeForma {
	private JFrame frmDodavanjeKnjige;
	private JTextField tfNaziv;
	private JTextField tfIzdavac;
	static Autor autor;
	static Zanr zanr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodavanjeKnjigeForma window = new DodavanjeKnjigeForma();
					window.frmDodavanjeKnjige.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmDodavanjeKnjige.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DodavanjeKnjigeForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frmDodavanjeKnjige = new JFrame();
		frmDodavanjeKnjige.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DodavanjeKnjigeForma.class.getResource("/guiFramework/book-stack.png")));
		frmDodavanjeKnjige.setTitle("Dodavanje knjige");
		frmDodavanjeKnjige.setResizable(false);
		frmDodavanjeKnjige.setBounds(100, 100, 298, 351);
		frmDodavanjeKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDodavanjeKnjige.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Naziv:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(8, 10, 49, 25);
		frmDodavanjeKnjige.getContentPane().add(lblNewLabel);

		JLabel lblBrstrana = new JLabel("Broj strana:");
		lblBrstrana.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrstrana.setBounds(8, 45, 91, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrstrana);

		JLabel lblIzdava = new JLabel("Izdavač:");
		lblIzdava.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIzdava.setBounds(8, 80, 65, 25);
		frmDodavanjeKnjige.getContentPane().add(lblIzdava);

		JLabel lblBrojKnjigaU = new JLabel("Broj knjiga u biblioteci:");
		lblBrojKnjigaU.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrojKnjigaU.setBounds(8, 115, 187, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrojKnjigaU);

		JLabel lblBrojKnjigaUkupno = new JLabel("Ukupan broj knjiga:");
		lblBrojKnjigaUkupno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrojKnjigaUkupno.setBounds(8, 150, 159, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrojKnjigaUkupno);

		tfNaziv = new JTextField();
		tfNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfNaziv.setBounds(69, 10, 205, 25);
		frmDodavanjeKnjige.getContentPane().add(tfNaziv);
		tfNaziv.setColumns(10);

		tfIzdavac = new JTextField();
		tfIzdavac.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfIzdavac.setColumns(10);
		tfIzdavac.setBounds(85, 80, 179, 25);
		frmDodavanjeKnjige.getContentPane().add(tfIzdavac);

		JSpinner spinBrStrana = new JSpinner();
		spinBrStrana.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinBrStrana.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrStrana.setBounds(111, 45, 85, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrStrana);

		JSpinner spinBrKnjigaBibl = new JSpinner();
		spinBrKnjigaBibl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrKnjigaBibl.setBounds(203, 115, 72, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrKnjigaBibl);

		JSpinner spinBrUkupno = new JSpinner();
		spinBrUkupno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrUkupno.setBounds(174, 150, 72, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrUkupno);

		JButton btnOdabirAutor = new JButton("Odaberi autora");
		btnOdabirAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AutorForma();
				AutorForma.main(null);
			}
		});

		btnOdabirAutor.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdabirAutor.setBounds(62, 185, 159, 33);
		frmDodavanjeKnjige.getContentPane().add(btnOdabirAutor);

		JButton btnOdabirZanr = new JButton("Odaberi žanr");
		btnOdabirZanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ZanrForma();
				ZanrForma.main(null);
			}
		});

		btnOdabirZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdabirZanr.setBounds(62, 228, 159, 33);
		frmDodavanjeKnjige.getContentPane().add(btnOdabirZanr);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String naziv = tfNaziv.getText();
					String izdavac = tfIzdavac.getText();
					int brojStrana = (int) spinBrStrana.getValue();
					int brojNaStanju = (int) spinBrKnjigaBibl.getValue();
					int ukupanBroj = (int) spinBrUkupno.getValue();

					Knjiga k = new Knjiga(naziv, autor, zanr, izdavac, brojStrana, brojNaStanju, ukupanBroj);
					DodavanjeKnjigeKontroler.sacuvajKnjigu(k);

					JOptionPane.showMessageDialog(frmDodavanjeKnjige, "Uspešno dodata knjiga", "Uspeh",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(frmDodavanjeKnjige, ex.getMessage(), "Greška",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(88, 271, 107, 33);
		frmDodavanjeKnjige.getContentPane().add(btnSacuvaj);
	}
}
