package guiFramework;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class RezervacijaForma {

	private JFrame frmRezervacijaforma;
	private JTextField tfPretragaRezervacija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RezervacijaForma window = new RezervacijaForma();
					window.frmRezervacijaforma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RezervacijaForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRezervacijaforma = new JFrame();
		frmRezervacijaforma.setIconImage(Toolkit.getDefaultToolkit().getImage(RezervacijaForma.class.getResource("/guiFramework/book-stack.png")));
		frmRezervacijaforma.setResizable(false);
		frmRezervacijaforma.setTitle("Pretraga rezervacija");
		frmRezervacijaforma.setBounds(100, 100, 424, 399);
		frmRezervacijaforma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRezervacijaforma.getContentPane().setLayout(null);

		JButton btnOdaberi = new JButton("Odaberi");
		btnOdaberi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOdaberi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdaberi.setBounds(152, 321, 105, 21);
		frmRezervacijaforma.getContentPane().add(btnOdaberi);

		JButton btnPretrazi = new JButton("Pretrazi");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(303, 10, 95, 24);
		frmRezervacijaforma.getContentPane().add(btnPretrazi);

		tfPretragaRezervacija = new JTextField();
		tfPretragaRezervacija.setBounds(164, 10, 129, 24);
		frmRezervacijaforma.getContentPane().add(tfPretragaRezervacija);
		tfPretragaRezervacija.setColumns(10);

		JList<String> lstRezervacije = new JList<String>();
		lstRezervacije.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lstRezervacije.setBackground(Color.WHITE);
		lstRezervacije.setBorder(UIManager.getBorder("MenuBar.border"));
		lstRezervacije.setBounds(10, 44, 388, 267);
		frmRezervacijaforma.getContentPane().add(lstRezervacije);

		JLabel lb = new JLabel("Pretrazi rezervacije:");
		lb.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lb.setBounds(10, 10, 157, 21);
		frmRezervacijaforma.getContentPane().add(lb);
	}
}
