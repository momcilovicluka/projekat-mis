package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Toolkit;

public class AutorForma {

	private JFrame frmAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutorForma window = new AutorForma();
					window.frmAutor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AutorForma() {
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
		frmAutor = new JFrame();
		frmAutor.setIconImage(
				Toolkit.getDefaultToolkit().getImage(AutorForma.class.getResource("/guiFramework/book-stack.png")));
		frmAutor.setTitle("Pretraga autora");
		frmAutor.setBounds(100, 100, 403, 307);
		frmAutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutor.getContentPane().setLayout(null);

		JLabel lblPretrazi = new JLabel("Pretraži:");
		lblPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPretrazi.setBounds(8, 11, 71, 23);
		frmAutor.getContentPane().add(lblPretrazi);

		JTextArea taUnos = new JTextArea();
		taUnos.setBounds(76, 11, 192, 23);
		frmAutor.getContentPane().add(taUnos);

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(275, 11, 104, 23);
		frmAutor.getContentPane().add(btnPretrazi);

		JList<?> listAutor = new JList<Object>();
		listAutor.setBounds(8, 40, 372, 187);
		frmAutor.getContentPane().add(listAutor);

		JButton lblDodajAutora = new JButton("Dodaj autora");
		lblDodajAutora.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDodajAutora.setBounds(7, 237, 148, 23);
		frmAutor.getContentPane().add(lblDodajAutora);

		JButton lblIzaberiAutora = new JButton("Izaberi autora");
		lblIzaberiAutora.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIzaberiAutora.setBounds(231, 237, 148, 23);
		frmAutor.getContentPane().add(lblIzaberiAutora);
	}

}
