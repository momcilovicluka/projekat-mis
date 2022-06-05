package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import klaseSaAtributima.Rezervacija;
import kontrolKlase.RezervacijaKontroler;

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
					window.frmRezervacijaforma.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frmRezervacijaforma = new JFrame();
		frmRezervacijaforma.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(RezervacijaForma.class.getResource("/guiFramework/book-stack.png")));
		frmRezervacijaforma.setResizable(false);
		frmRezervacijaforma.setTitle("Pretraga rezervacija");
		frmRezervacijaforma.setBounds(100, 100, 436, 388);
		frmRezervacijaforma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRezervacijaforma.getContentPane().setLayout(null);

		JButton btnOdaberi = new JButton("Odaberi");
		btnOdaberi.setEnabled(false);

		btnOdaberi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdaberi.setBounds(158, 318, 105, 21);
		frmRezervacijaforma.getContentPane().add(btnOdaberi);

		tfPretragaRezervacija = new JTextField();
		tfPretragaRezervacija.setBounds(171, 10, 129, 21);
		frmRezervacijaforma.getContentPane().add(tfPretragaRezervacija);
		tfPretragaRezervacija.setColumns(10);

		JList<Rezervacija> lstRezervacije;
		DefaultListModel<Rezervacija> listModel = new DefaultListModel<Rezervacija>();

		try {
			listModel.addAll(RezervacijaKontroler.pretraziRezervaciju(""));
		} catch (IllegalArgumentException | ParseException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		lstRezervacije = new JList<Rezervacija>(listModel);
		lstRezervacije.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lstRezervacije.setBorder(UIManager.getBorder("MenuBar.border"));
		lstRezervacije.setBounds(10, 41, 402, 267);
		frmRezervacijaforma.getContentPane().add(lstRezervacije);

		lstRezervacije.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (lstRezervacije.getSelectedIndex() != -1)
					btnOdaberi.setEnabled(true);
			}
		});

		btnOdaberi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IzdavanjeRezervacijeForma.rezervacija = lstRezervacije.getSelectedValue();
				new IzdavanjeRezervacijeForma();
				IzdavanjeRezervacijeForma.main(null);
			}
		});

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pretraga = tfPretragaRezervacija.getText().trim();
				btnOdaberi.setEnabled(false);

				try {
					listModel.clear();
					listModel.addAll(RezervacijaKontroler.pretraziRezervaciju(pretraga));
				} catch (IllegalArgumentException | IOException | ParseException e1) {
					JOptionPane.showMessageDialog(frmRezervacijaforma, "Došlo je do greške!", "Greška",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(307, 10, 105, 21);
		frmRezervacijaforma.getContentPane().add(btnPretrazi);

		JLabel lb = new JLabel("Pretraži rezervacije:");
		lb.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lb.setBounds(7, 10, 157, 21);
		frmRezervacijaforma.getContentPane().add(lb);
	}
}
