package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Izdavanje;
import klaseSaAtributima.Rezervacija;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzdavanjeRezervacijeForma {
	private JFrame frmIzdavanjeRezervisaneKnjige;
	public static Rezervacija rezervacija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzdavanjeRezervacijeForma window = new IzdavanjeRezervacijeForma();
					window.frmIzdavanjeRezervisaneKnjige.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IzdavanjeRezervacijeForma() {
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
		frmIzdavanjeRezervisaneKnjige = new JFrame();
		frmIzdavanjeRezervisaneKnjige.setTitle("Izdavanje rezervisane knjige");
		frmIzdavanjeRezervisaneKnjige.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(IzdavanjeRezervacijeForma.class.getResource("/guiFramework/book-stack.png")));
		frmIzdavanjeRezervisaneKnjige.setResizable(false);
		frmIzdavanjeRezervisaneKnjige.setBounds(100, 100, 329, 233);
		frmIzdavanjeRezervisaneKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIzdavanjeRezervisaneKnjige.getContentPane().setLayout(null);

		JLabel lblRokZaVracanje = new JLabel("Rok za vraćanje: ");
		lblRokZaVracanje.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokZaVracanje.setBounds(11, 119, 134, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblRokZaVracanje);

		JLabel lblDatumIzdavanja = new JLabel("Datum izdavanja:");
		lblDatumIzdavanja.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanja.setBounds(11, 83, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblDatumIzdavanja);

		JLabel lblKnjiga = new JLabel("Knjiga:");
		lblKnjiga.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjiga.setBounds(11, 11, 59, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblKnjiga);

		JLabel lblClan = new JLabel("Član:");
		lblClan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClan.setBounds(11, 47, 46, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblClan);

		Date rokZaVracanje = Date.valueOf(LocalDate.now().plusDays(30));
		JLabel lblRokZaVracanjeInfo = new JLabel(new SimpleDateFormat("yyyy-MM-dd").format(rokZaVracanje));
		lblRokZaVracanjeInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokZaVracanjeInfo.setBounds(158, 119, 102, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblRokZaVracanjeInfo);

		String datumIzdavanja = new SimpleDateFormat("yyyy-MM-dd").format(Date.valueOf(LocalDate.now()));
		JLabel lblDatumIzdavanjaInfo = new JLabel(datumIzdavanja);
		lblDatumIzdavanjaInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanjaInfo.setBounds(171, 83, 102, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblDatumIzdavanjaInfo);

		JLabel lblClanInfo = new JLabel(rezervacija.getClan().toString());
		lblClanInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClanInfo.setBounds(70, 47, 232, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblClanInfo);

		JLabel lblKnjigaInfo = new JLabel(rezervacija.getKnjiga().toString());
		lblKnjigaInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjigaInfo.setBounds(81, 11, 222, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblKnjigaInfo);

		JButton btnIzdaj = new JButton("Izdaj");
		btnIzdaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Izdavanje novoIzdavanje = new Izdavanje(rezervacija.getKnjiga(), rezervacija.getClan(),
						Date.valueOf(LocalDate.now()), rokZaVracanje);
				System.out.println(novoIzdavanje);
				// IzdavanjeRezervacijeKontroler.
			}
		});

		btnIzdaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdaj.setBounds(112, 155, 89, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(btnIzdaj);
	}
}
