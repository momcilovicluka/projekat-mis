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

public class ZanrForma {

	private JFrame frmZanr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZanrForma window = new ZanrForma();
					window.frmZanr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZanrForma() {
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
		frmZanr = new JFrame();
		frmZanr.setResizable(false);
		frmZanr.setIconImage(
				Toolkit.getDefaultToolkit().getImage(ZanrForma.class.getResource("/guiFramework/book-stack.png")));
		frmZanr.setTitle("Pretraga žanra");
		frmZanr.setBounds(100, 100, 403, 300);
		frmZanr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZanr.getContentPane().setLayout(null);

		JLabel lblPretrazi = new JLabel("Pretraži:");
		lblPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPretrazi.setBounds(7, 12, 75, 18);
		frmZanr.getContentPane().add(lblPretrazi);

		JTextArea taUnos = new JTextArea();
		taUnos.setBounds(78, 13, 190, 22);
		frmZanr.getContentPane().add(taUnos);

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(275, 13, 104, 23);
		frmZanr.getContentPane().add(btnPretrazi);

		JList<?> listZanr = new JList<Object>();
		listZanr.setBounds(7, 40, 372, 187);
		frmZanr.getContentPane().add(listZanr);

		JButton lblDodajZanr = new JButton("Dodaj žanr");
		lblDodajZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDodajZanr.setBounds(7, 231, 137, 23);
		frmZanr.getContentPane().add(lblDodajZanr);

		JButton btnIzaberiZanr = new JButton("Izaberi žanr");
		btnIzaberiZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzaberiZanr.setBounds(242, 231, 137, 23);
		frmZanr.getContentPane().add(btnIzaberiZanr);
	}

}
