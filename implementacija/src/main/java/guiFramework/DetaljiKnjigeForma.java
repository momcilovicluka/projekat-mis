package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import klaseSaAtributima.Knjiga;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetaljiKnjigeForma {

	private JFrame frmDetaljiKnjige;
	public static Knjiga knjiga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaljiKnjigeForma window = new DetaljiKnjigeForma();
					window.frmDetaljiKnjige.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DetaljiKnjigeForma() {
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
		frmDetaljiKnjige = new JFrame();
		frmDetaljiKnjige.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DetaljiKnjigeForma.class.getResource("/guiFramework/book-stack.png")));
		frmDetaljiKnjige.setTitle("Detalji knjige");
		frmDetaljiKnjige.setResizable(false);
		frmDetaljiKnjige.setBounds(100, 100, 372, 324);
		frmDetaljiKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbNaziv = new JLabel("Naziv:");
		lbNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbAutor = new JLabel("Autor:");
		lbAutor.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbIzdavac = new JLabel("Izdavac:");
		lbIzdavac.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbbrojStrana = new JLabel("Broj strana:");
		lbbrojStrana.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbBrojKNjigaUBiblioteci = new JLabel("Broj knjiga u biblioteci:");
		lbBrojKNjigaUBiblioteci.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblBrojKnjigaUkupno = new JLabel("Broj knjiga ukupno:");
		lblBrojKnjigaUkupno.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblZanr = new JLabel("Žanr:");
		lblZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbNaziv_1 = new JLabel(knjiga.getNaziv());
		lbNaziv_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbAutor_1 = new JLabel(knjiga.getAutor().toString());
		lbAutor_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbIzdavac_1 = new JLabel(knjiga.getIzdavac());
		lbIzdavac_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbbrojStrana_1 = new JLabel(Integer.toString(knjiga.getBrojStrana()));
		lbbrojStrana_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lbBrojKNjigaUBiblioteci_1 = new JLabel(Integer.toString(knjiga.getBrojNaStanju()));
		lbBrojKNjigaUBiblioteci_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblBrojKnjigaUkupno_1 = new JLabel(Integer.toString(knjiga.getUkupanBroj()));
		lblBrojKnjigaUkupno_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JLabel lblZanr_1 = new JLabel(knjiga.getZanr().toString());
		lblZanr_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		JButton btnIzdaj = new JButton("Izdaj");
		btnIzdaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzdaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(frmDetaljiKnjige.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap(10, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addComponent(lbBrojKNjigaUBiblioteci)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(
										lbBrojKNjigaUBiblioteci_1, GroupLayout.PREFERRED_SIZE, 148,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup().addComponent(lbNaziv)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbNaziv_1)
										.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup().addComponent(lbAutor)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbAutor_1,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addComponent(lblZanr)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblZanr_1,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addComponent(lbIzdavac)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbIzdavac_1,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addComponent(lbbrojStrana)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbbrojStrana_1,
												GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addComponent(lblBrojKnjigaUkupno)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblBrojKnjigaUkupno_1,
										GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))))
				.addGroup(Alignment.LEADING,
						groupLayout.createSequentialGroup().addGap(135)
								.addComponent(btnIzdaj, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(208, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbNaziv)
						.addComponent(lbNaziv_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbAutor)
						.addComponent(lbAutor_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblZanr)
						.addComponent(lblZanr_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbIzdavac)
						.addComponent(lbIzdavac_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbbrojStrana)
						.addComponent(lbbrojStrana_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lbBrojKNjigaUBiblioteci)
						.addComponent(lbBrojKNjigaUBiblioteci_1, GroupLayout.PREFERRED_SIZE, 25,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblBrojKnjigaUkupno)
						.addComponent(lblBrojKnjigaUkupno_1, GroupLayout.PREFERRED_SIZE, 25,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
				.addComponent(btnIzdaj, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(12)));
		frmDetaljiKnjige.getContentPane().setLayout(groupLayout);
	}

}
