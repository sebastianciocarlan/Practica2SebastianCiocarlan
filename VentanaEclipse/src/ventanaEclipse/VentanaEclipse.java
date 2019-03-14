package ventanaEclipse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import java.awt.Canvas;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class VentanaEclipse extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUser = new JLabel("User");
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEclipse frame = new VentanaEclipse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaEclipse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 432);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenu mnNuevo = new JMenu("Nuevo");
		mnArchivo.add(mnNuevo);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnNuevo.add(mntmLogin);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mnEditar.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mnEditar.add(mntmPaste);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnEditar.add(mntmDelete);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutUs = new JMenuItem("About us");
		mnHelp.add(mntmAboutUs);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUser.setBounds(221, 165, 116, 35);
		contentPane.add(lblUser);
		
		textField = new JTextField();
		textField.setBounds(221, 196, 175, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(12, 196, 175, 19);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 175, 66, 15);
		contentPane.add(lblPassword);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Usuario"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(221, 246, 175, 24);
		contentPane.add(comboBox);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setBounds(12, 247, 126, 23);
		contentPane.add(chckbxRememberMe);
		
		JButton btnSend = new JButton("Login");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSend.setBounds(238, 309, 114, 25);
		contentPane.add(btnSend);
		
		JSlider slider = new JSlider();
		slider.setValue(100);
		slider.setBounds(12, 318, 200, 16);
		contentPane.add(slider);
		
		JLabel lblWindowOpacity = new JLabel("Window opacity");
		lblWindowOpacity.setBounds(20, 285, 200, 15);
		contentPane.add(lblWindowOpacity);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(408, 0, 17, 371);
		contentPane.add(scrollBar);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setBounds(22, 342, 74, 20);
		contentPane.add(spinner);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/sebastian/Escritorio/Practica2SebastianCiocarlan/VentanaEclipse/proxy.duckduckgo.com.png"));
		label.setBounds(12, 4, 382, 159);
		contentPane.add(label);
	}
}
