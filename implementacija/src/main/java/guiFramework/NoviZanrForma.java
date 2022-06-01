package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Zanr;
import kontrolKlase.ZanrKontroler;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoviZanrForma {

	private JFrame frmNoviZanr;
	private JTextField tfNaziv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoviZanrForma window = new NoviZanrForma();
					window.frmNoviZanr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmNoviZanr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NoviZanrForma() {
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
		frmNoviZanr = new JFrame();
		frmNoviZanr.setResizable(false);
		frmNoviZanr.setIconImage(
				Toolkit.getDefaultToolkit().getImage(NoviZanrForma.class.getResource("/guiFramework/book-stack.png")));
		frmNoviZanr.setTitle("Novi žanr");
		frmNoviZanr.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frmNoviZanr.setBounds(100, 100, 242, 117);
		frmNoviZanr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoviZanr.getContentPane().setLayout(null);

		JLabel lblNaziv = new JLabel("Naziv:");
		lblNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNaziv.setBounds(14, 11, 56, 19);
		frmNoviZanr.getContentPane().add(lblNaziv);

		tfNaziv = new JTextField();
		tfNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfNaziv.setBounds(80, 11, 130, 19);
		frmNoviZanr.getContentPane().add(tfNaziv);
		tfNaziv.setColumns(10);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String naziv = tfNaziv.getText();

					Zanr z = new Zanr(naziv);
					boolean dodat = ZanrKontroler.sacuvajZanr(z);
					if (dodat)
						JOptionPane.showMessageDialog(frmNoviZanr, "Žanr je uspešno dodat", "Uspeh",
								JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(frmNoviZanr, "Žanr nije dodat", "Greška",
								JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(frmNoviZanr, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(62, 47, 103, 21);
		frmNoviZanr.getContentPane().add(btnSacuvaj);
	}
}
