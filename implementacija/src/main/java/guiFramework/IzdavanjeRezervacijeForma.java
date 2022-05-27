package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IzdavanjeRezervacijeForma {

	private JFrame frmIzdavanjeRezervisaneKnjige;

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
		frmIzdavanjeRezervisaneKnjige = new JFrame();
		frmIzdavanjeRezervisaneKnjige.setTitle("Izdavanje rezervisane knjige");
		frmIzdavanjeRezervisaneKnjige.setIconImage(Toolkit.getDefaultToolkit().getImage(IzdavanjeRezervacijeForma.class.getResource("/guiFramework/book-stack.png")));
		frmIzdavanjeRezervisaneKnjige.setResizable(false);
		frmIzdavanjeRezervisaneKnjige.setBounds(100, 100, 329, 233);
		frmIzdavanjeRezervisaneKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIzdavanjeRezervisaneKnjige.getContentPane().setLayout(null);
		
		JLabel lblRokZaVracanje = new JLabel("Rok za vraćanje:");
		lblRokZaVracanje.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokZaVracanje.setBounds(10, 119, 131, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblRokZaVracanje);
		
		JLabel lblDatumIzdavanja = new JLabel("Datum izdavanja:");
		lblDatumIzdavanja.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanja.setBounds(10, 83, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblDatumIzdavanja);
		
		JLabel lblKnjiga = new JLabel("Knjiga:");
		lblKnjiga.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjiga.setBounds(10, 11, 59, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblKnjiga);
		
		JLabel lblClan = new JLabel("Član:");
		lblClan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClan.setBounds(10, 47, 46, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblClan);
		
		JLabel lblRokZaVracanjeInfo = new JLabel("__________");
		lblRokZaVracanjeInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRokZaVracanjeInfo.setBounds(151, 119, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblRokZaVracanjeInfo);
		
		JLabel lblDatumIzdavanjaInfo = new JLabel("__________");
		lblDatumIzdavanjaInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatumIzdavanjaInfo.setBounds(164, 83, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblDatumIzdavanjaInfo);
		
		JLabel lblClanInfo = new JLabel("__________");
		lblClanInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClanInfo.setBounds(66, 47, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblClanInfo);
		
		JLabel lblKnjigaInfo = new JLabel("__________");
		lblKnjigaInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjigaInfo.setBounds(79, 11, 144, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(lblKnjigaInfo);
		
		JButton btnIzdaj = new JButton("Izdaj");
		btnIzdaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdaj.setBounds(112, 158, 89, 25);
		frmIzdavanjeRezervisaneKnjige.getContentPane().add(btnIzdaj);
	}
}
