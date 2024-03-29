package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import klaseSaAtributima.Autor;
import kontrolKlase.AutorKontroler;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

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
		lblDatum.setBounds(10, 71, 126, 21);
		frmNoviAutor.getContentPane().add(lblDatum);

		tfIme = new JTextField();
		tfIme.setBounds(52, 11, 96, 19);
		frmNoviAutor.getContentPane().add(tfIme);
		tfIme.setColumns(10);

		tfPrezime = new JTextField();
		tfPrezime.setColumns(10);
		tfPrezime.setBounds(88, 41, 96, 19);
		frmNoviAutor.getContentPane().add(tfPrezime);

		JDateChooser dcDatumRodjenja = new JDateChooser();
		dcDatumRodjenja.setBounds(146, 73, 96, 19);
		frmNoviAutor.getContentPane().add(dcDatumRodjenja);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ime = tfIme.getText();
					String prezime = tfPrezime.getText();
					Date datumRodjenja = dcDatumRodjenja.getDate();

					Autor a = new Autor(ime, prezime, datumRodjenja);
					boolean dodat = AutorKontroler.sacuvajAutora(a);
					if (dodat)
						JOptionPane.showMessageDialog(frmNoviAutor, "Autor je uspešno dodat", "Uspeh",
								JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(frmNoviAutor, "Autor nije dodat", "Greška",
								JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(frmNoviAutor, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(75, 101, 103, 21);
		frmNoviAutor.getContentPane().add(btnSacuvaj);

	}
}
