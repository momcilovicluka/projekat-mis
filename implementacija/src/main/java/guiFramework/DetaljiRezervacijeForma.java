package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Rezervacija;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetaljiRezervacijeForma {

	private JFrame frmIzdavanjeRezervacije;
	public static Rezervacija rezervacija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaljiRezervacijeForma window = new DetaljiRezervacijeForma();
					window.frmIzdavanjeRezervacije.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DetaljiRezervacijeForma() {
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
		frmIzdavanjeRezervacije = new JFrame();
		frmIzdavanjeRezervacije.setResizable(false);
		frmIzdavanjeRezervacije.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DetaljiRezervacijeForma.class.getResource("/guiFramework/book-stack.png")));
		frmIzdavanjeRezervacije.setTitle("Detalji rezervacije");
		frmIzdavanjeRezervacije.setBounds(100, 100, 370, 200);
		frmIzdavanjeRezervacije.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIzdavanjeRezervacije.getContentPane().setLayout(null);

		JLabel lblClan = new JLabel("Član:");
		lblClan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClan.setBounds(10, 11, 44, 21);
		frmIzdavanjeRezervacije.getContentPane().add(lblClan);

		JLabel lblKnjiga = new JLabel("Knjiga:");
		lblKnjiga.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjiga.setBounds(10, 45, 58, 25);
		frmIzdavanjeRezervacije.getContentPane().add(lblKnjiga);

		JLabel lblDatum = new JLabel("Datum rezervisanja:");
		lblDatum.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatum.setBounds(10, 87, 165, 21);
		frmIzdavanjeRezervacije.getContentPane().add(lblDatum);

		JLabel lblClanInfo = new JLabel("__________");
		lblClanInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblClanInfo.setBounds(64, 11, 159, 21);
		frmIzdavanjeRezervacije.getContentPane().add(lblClanInfo);

		JLabel lblKnjiga_1 = new JLabel("__________");
		lblKnjiga_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblKnjiga_1.setBounds(78, 45, 159, 25);
		frmIzdavanjeRezervacije.getContentPane().add(lblKnjiga_1);

		JLabel lblDatum_1 = new JLabel("__________");
		lblDatum_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatum_1.setBounds(185, 87, 159, 21);
		frmIzdavanjeRezervacije.getContentPane().add(lblDatum_1);

		JButton btnIzdaj = new JButton("Izdaj");
		btnIzdaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIzdavanjeRezervacije.setVisible(false);
				new IzdavanjeRezervacijeForma();
				IzdavanjeRezervacijeForma.main(null);
			}
		});
		btnIzdaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzdaj.setBounds(132, 127, 89, 23);
		frmIzdavanjeRezervacije.getContentPane().add(btnIzdaj);
	}

}
