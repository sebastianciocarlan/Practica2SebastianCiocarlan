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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUser.setBounds(12, 12, 116, 35);
		contentPane.add(lblUser);
		
		textField = new JTextField();
		textField.setBounds(12, 43, 175, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(12, 97, 175, 19);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 76, 66, 15);
		contentPane.add(lblPassword);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Usuario"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(253, 40, 175, 24);
		contentPane.add(comboBox);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setBounds(12, 124, 126, 23);
		contentPane.add(chckbxRememberMe);
		
		JButton btnSend = new JButton("Login");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSend.setBounds(314, 94, 114, 25);
		contentPane.add(btnSend);
		
		JSlider slider = new JSlider();
		slider.setBounds(12, 244, 200, 16);
		contentPane.add(slider);
		
		JLabel lblWindowOpacity = new JLabel("Window opacity");
		lblWindowOpacity.setBounds(12, 217, 200, 15);
		contentPane.add(lblWindowOpacity);
	}
}
