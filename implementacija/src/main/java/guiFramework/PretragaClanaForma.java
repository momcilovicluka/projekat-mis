package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
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
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import klaseSaAtributima.Clan;
import kontrolKlase.ClanKontroler;

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

		JTextArea tfPretraga = new JTextArea();
		tfPretraga.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfPretraga.setBounds(84, 8, 229, 22);
		frmPretragaClanova.getContentPane().add(tfPretraga);

		JButton btnOdaberi = new JButton("Odaberi člana");

		JList<Clan> listClanova;
		DefaultListModel<Clan> listModel = new DefaultListModel<Clan>();
		try {
			listModel.addAll(ClanKontroler.pretraziClana("").values());
		} catch (IllegalArgumentException | ParseException | IOException e1) {
			e1.printStackTrace();
		}
		listClanova = new JList<Clan>(listModel);
		listClanova.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listClanova.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listClanova.setVisibleRowCount(-1);
		listClanova.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listClanova.getSelectedIndex() != -1)
					btnOdaberi.setEnabled(true);
			}
		});
		listClanova.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		listClanova.setBounds(8, 39, 411, 187);
		frmPretragaClanova.getContentPane().add(listClanova);

		btnOdaberi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IzdavanjeForma.clan = (Clan) listClanova.getSelectedValue();
				frmPretragaClanova.setVisible(false);
			}
		});
		btnOdaberi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdaberi.setBounds(140, 232, 147, 23);
		frmPretragaClanova.getContentPane().add(btnOdaberi);
		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pretraga = tfPretraga.getText().trim();
				try {
					listModel.clear();
					listModel.addAll(ClanKontroler.pretraziClana(pretraga).values());
				} catch (IllegalArgumentException | IOException | ParseException e1) {
					JOptionPane.showMessageDialog(frmPretragaClanova, "Došlo je do greške!", "Greška",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(322, 8, 97, 23);
		frmPretragaClanova.getContentPane().add(btnPretrazi);
	}

}
