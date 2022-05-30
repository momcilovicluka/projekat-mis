package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

public class NoviAutorForma {

	private JFrame frmNoviAutor;
	private JTextField tfIme;
	private JTextField tfPrezime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoviAutorForma window = new NoviAutorForma();
					window.frmNoviAutor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmNoviAutor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NoviAutorForma() {
		initialize();
	}

	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frmNoviAutor = new JFrame();
		frmNoviAutor.setResizable(false);
		frmNoviAutor.setIconImage(
				Toolkit.getDefaultToolkit().getImage(NoviAutorForma.class.getResource("/guiFramework/book-stack.png")));
		frmNoviAutor.setTitle("Novi autor");
		frmNoviAutor.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frmNoviAutor.setBounds(100, 100, 268, 171);
		frmNoviAutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoviAutor.getContentPane().setLayout(null);

		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIme.setBounds(10, 11, 45, 19);
		frmNoviAutor.getContentPane().add(lblIme);

		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPrezime.setBounds(10, 41, 74, 19);
		frmNoviAutor.getContentPane().add(lblPrezime);

		JLabel lblDatum = new JLabel("Datum rođenja:");
		lblDatum.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatum.setBounds(10, 71, 126, 19);
		frmNoviAutor.getContentPane().add(lblDatum);

		tfIme = new JTextField();
		tfIme.setBounds(52, 11, 96, 19);
		frmNoviAutor.getContentPane().add(tfIme);
		tfIme.setColumns(10);

		tfPrezime = new JTextField();
		tfPrezime.setColumns(10);
		tfPrezime.setBounds(88, 41, 96, 19);
		frmNoviAutor.getContentPane().add(tfPrezime);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(75, 101, 103, 21);
		frmNoviAutor.getContentPane().add(btnSacuvaj);

		JDateChooser dcDatumRodjenja = new JDateChooser();
		dcDatumRodjenja.setBounds(146, 71, 96, 19);
		frmNoviAutor.getContentPane().add(dcDatumRodjenja);
	}
}
