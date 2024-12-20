package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(31, 32, 123, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Laertes Angelo");
		lblNewLabel_1.setBounds(31, 67, 144, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Portifólio:");
		lblNewLabel_2.setBounds(31, 102, 54, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebServices = new JLabel("https://laertes-angelo.vercel.app");
		lblWebServices.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://laertes-angelo.vercel.app");
			}
		});
		lblWebServices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebServices.setForeground(SystemColor.textHighlight);
		lblWebServices.setBounds(87, 102, 183, 14);
		getContentPane().add(lblWebServices);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.setToolTipText("GitHub");
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBorder(null);
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Laertes1");
			}
		});
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setBackground(SystemColor.control);
		btnGitHub.setBounds(31, 145, 54, 54);
		getContentPane().add(btnGitHub);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.setToolTipText("Likedin");
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setBorder(null);
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/laertes-angelo-b5b618235/");
			}
		});
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin1.png")));
		btnLinkedin.setBounds(104, 149, 50, 50);
		getContentPane().add(btnLinkedin);

	}//fim do construtor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri =  new URI(site);
			desktop.browse(uri);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
