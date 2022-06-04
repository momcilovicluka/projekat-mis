package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class IzdavanjeForma {

	private JFrame frmIzdavanjeKnjige;

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

		JLabel lblNewLabel = new JLabel("Naziv knjige:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 103, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Datum izdavanja:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 41, 141, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Rok za vraćanje:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 72, 135, 21);
		frmIzdavanjeKnjige.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Kreiraj izdavanje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton.setBounds(200, 103, 178, 28);
		frmIzdavanjeKnjige.getContentPane().add(btnNewButton);

		JButton btnClan = new JButton("Odaberi člana");
		btnClan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnClan.setBounds(11, 103, 178, 28);
		frmIzdavanjeKnjige.getContentPane().add(btnClan);
	}
}
