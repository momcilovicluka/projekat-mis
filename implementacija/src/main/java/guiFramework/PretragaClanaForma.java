package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Toolkit;

public class PretragaClanaForma {

	private JFrame frmPretragaClanova;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PretragaClanaForma window = new PretragaClanaForma();
					window.frmPretragaClanova.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PretragaClanaForma() {
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
		frmPretragaClanova = new JFrame();
		frmPretragaClanova.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(PretragaClanaForma.class.getResource("/guiFramework/book-stack.png")));
		frmPretragaClanova.setResizable(false);
		frmPretragaClanova.setTitle("Pretraga članova");
		frmPretragaClanova.setBounds(100, 100, 441, 300);
		frmPretragaClanova.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPretragaClanova.getContentPane().setLayout(null);

		JLabel lblPretraga = new JLabel("Pretraži:");
		lblPretraga.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPretraga.setBounds(8, 11, 68, 17);
		frmPretragaClanova.getContentPane().add(lblPretraga);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textArea.setBounds(84, 8, 229, 22);
		frmPretragaClanova.getContentPane().add(textArea);

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(322, 8, 97, 23);
		frmPretragaClanova.getContentPane().add(btnPretrazi);

		JButton btnOdaberi = new JButton("Odaberi člana");
		btnOdaberi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdaberi.setBounds(140, 232, 147, 23);
		frmPretragaClanova.getContentPane().add(btnOdaberi);

		JList<?> listClanova = new JList<Object>();
		listClanova.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		listClanova.setBounds(8, 39, 411, 187);
		frmPretragaClanova.getContentPane().add(listClanova);
	}

}
