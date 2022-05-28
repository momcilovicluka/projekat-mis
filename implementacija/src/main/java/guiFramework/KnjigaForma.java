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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KnjigaForma {

	private JFrame frmPretragaKnjiga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KnjigaForma window = new KnjigaForma();
					window.frmPretragaKnjiga.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KnjigaForma() {
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
		frmPretragaKnjiga = new JFrame();
		frmPretragaKnjiga.setTitle("Pretraga knjiga");
		frmPretragaKnjiga.setIconImage(Toolkit.getDefaultToolkit().getImage(KnjigaForma.class.getResource("/guiFramework/book-stack.png")));
		frmPretragaKnjiga.setBounds(100, 100, 433, 300);
		frmPretragaKnjiga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPretragaKnjiga.getContentPane().setLayout(null);
		
		JLabel lbKnjige = new JLabel("Pretrazi knjige:");
		lbKnjige.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lbKnjige.setBounds(8, 8, 114, 25);
		frmPretragaKnjiga.getContentPane().add(lbKnjige);
		
		JTextArea taPretragaKnjige = new JTextArea();
		taPretragaKnjige.setBounds(130, 11, 166, 22);
		frmPretragaKnjiga.getContentPane().add(taPretragaKnjige);
		
		JButton btnPretrazi = new JButton("Pretrazi");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(304, 10, 103, 23);
		frmPretragaKnjiga.getContentPane().add(btnPretrazi);
		
		JList<String> listKnjige = new JList<String>();
		listKnjige.setBounds(8, 47, 401, 178);
		frmPretragaKnjiga.getContentPane().add(listKnjige);
		
		JButton btnOdaberi = new JButton("Odaberi");
		btnOdaberi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPretragaKnjiga.setVisible(false);
				new DetaljiKnjigeForma();
				DetaljiKnjigeForma.main(null);
			}
		});
		btnOdaberi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdaberi.setBounds(157, 230, 103, 23);
		frmPretragaKnjiga.getContentPane().add(btnOdaberi);
	}
}
