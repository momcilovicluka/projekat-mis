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

public class NoviZanrForma {

	private JFrame frmNoviAutor;
	private JTextField tfNaziv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoviZanrForma window = new NoviZanrForma();
					window.frmNoviAutor.setVisible(true);
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
		frmNoviAutor = new JFrame();
		frmNoviAutor.setResizable(false);
		frmNoviAutor.setIconImage(
				Toolkit.getDefaultToolkit().getImage(NoviZanrForma.class.getResource("/guiFramework/book-stack.png")));
		frmNoviAutor.setTitle("Novi žanr");
		frmNoviAutor.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frmNoviAutor.setBounds(100, 100, 242, 117);
		frmNoviAutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoviAutor.getContentPane().setLayout(null);

		JLabel lblNaziv = new JLabel("Naziv:");
		lblNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNaziv.setBounds(14, 11, 56, 19);
		frmNoviAutor.getContentPane().add(lblNaziv);

		tfNaziv = new JTextField();
		tfNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfNaziv.setBounds(80, 11, 130, 19);
		frmNoviAutor.getContentPane().add(tfNaziv);
		tfNaziv.setColumns(10);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(62, 47, 103, 21);
		frmNoviAutor.getContentPane().add(btnSacuvaj);
	}
}
