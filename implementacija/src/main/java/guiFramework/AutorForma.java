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
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import klaseSaAtributima.Autor;
import kontrolKlase.AutorKontroler;

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
					window.frmAutor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		frmAutor.setResizable(false);
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

		JTextArea tfUnos = new JTextArea();
		tfUnos.setBounds(76, 11, 192, 23);
		frmAutor.getContentPane().add(tfUnos);

		JButton btnIzaberiAutora = new JButton("Izaberi autora");

		JList<Autor> listAutor;
		DefaultListModel<Autor> listModel = new DefaultListModel<Autor>();
		try {
			listModel.addAll(AutorKontroler.pronadjiAutora("").values());
		} catch (IllegalArgumentException | ParseException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		listAutor = new JList<Autor>(listModel);
		listAutor.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listAutor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listAutor.setVisibleRowCount(-1);
		listAutor.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listAutor.getSelectedIndex() != -1)
					btnIzaberiAutora.setEnabled(true);
			}
		});
		listAutor.setBounds(8, 40, 372, 187);
		frmAutor.getContentPane().add(listAutor);

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(275, 11, 104, 23);
		btnPretrazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pretraga = tfUnos.getText().trim();
				listModel.clear();
				try {
					listModel.addAll(AutorKontroler.pronadjiAutora(pretraga).values());
				} catch (IllegalArgumentException | ParseException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmAutor.getContentPane().add(btnPretrazi);

		JButton lblDodajAutora = new JButton("Dodaj autora");
		lblDodajAutora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NoviAutorForma();
				NoviAutorForma.main(null);
			}
		});

		lblDodajAutora.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDodajAutora.setBounds(7, 237, 148, 23);
		frmAutor.getContentPane().add(lblDodajAutora);

		btnIzaberiAutora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodavanjeKnjigeForma.autor = (Autor) listAutor.getSelectedValue();
				frmAutor.dispose();
			}
		});
		btnIzaberiAutora.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzaberiAutora.setBounds(231, 237, 148, 23);
		frmAutor.getContentPane().add(btnIzaberiAutora);
	}

}
