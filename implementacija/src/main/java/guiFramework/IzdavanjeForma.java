package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Clan;
import klaseSaAtributima.Izdavanje;
import klaseSaAtributima.Knjiga;
import kontrolKlase.IzdavanjeKontroler;

public class IzdavanjeForma {

	private JFrame frmIzdavanjeKnjige;
	public static Knjiga knjiga;
	public static Clan clan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzdavanjeForma window = new IzdavanjeForma();
					window.frmIzdavanjeKnjige.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmIzdavanjeKnjige.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IzdavanjeForma() {
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

		frmIzdavanjeKnjige = new JFrame();
		frmIzdavanjeKnjige.setIconImage(
				Toolkit.getDefaultToolkit().getImage(IzdavanjeForma.class.getResource("/guiFramework/book-stack.png")));
		frmIzdavanjeKnjige.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frmIzdavanjeKnjige.setTitle("Izdavanje knjige");
		frmIzdavanjeKnjige.setBounds(100, 100, 405, 180);
		frmIzdavanjeKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIzdavanjeKnjige.getContentPane().setLayout(null);

		JLabel lblNaziv = new JLabel("Naziv knjige:");
		lblNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNaziv.setBounds(10, 10, 103, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblNaziv);

		JLabel lblDatumIzdavanja = new JLabel("Datum izdavanja:");
		lblDatumIzdavanja.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanja.setBounds(10, 41, 141, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblDatumIzdavanja);

		JLabel lblRokZaVracanje = new JLabel("Rok za vraćanje:");
		lblRokZaVracanje.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokZaVracanje.setBounds(10, 72, 135, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblRokZaVracanje);

		JButton btnIzdaj = new JButton("Kreiraj izdavanje");
		btnIzdaj.setEnabled(false);
		btnIzdaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Izdavanje izdavanje = new Izdavanje(knjiga, clan, Date.valueOf(LocalDate.now()),
						Date.valueOf(LocalDate.now().plusDays(30)));
				IzdavanjeKontroler.sacuvajIzdavanje(izdavanje);
			}
		});
		btnIzdaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdaj.setBounds(200, 103, 178, 28);
		frmIzdavanjeKnjige.getContentPane().add(btnIzdaj);

		JButton btnClan = new JButton("Odaberi člana");
		btnClan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PretragaClanaForma();
				PretragaClanaForma.main(null);
				btnIzdaj.setEnabled(true);
			}
		});
		btnClan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnClan.setBounds(11, 103, 178, 28);
		frmIzdavanjeKnjige.getContentPane().add(btnClan);

		JLabel lblNazivField = new JLabel("");
		lblNazivField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNazivField.setBounds(115, 10, 263, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblNazivField);

		JLabel lblDatumIzdavanjaField = new JLabel("");
		lblDatumIzdavanjaField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanjaField.setBounds(153, 41, 225, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblDatumIzdavanjaField);

		JLabel lblRokField = new JLabel("");
		lblRokField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokField.setBounds(141, 73, 237, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblRokField);
	}
}
