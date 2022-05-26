package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;

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
		frmRezervacijaforma.setResizable(false);
		frmRezervacijaforma.setTitle("RezervacijaForma");
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

		JList lstRezervacije = new JList();
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
