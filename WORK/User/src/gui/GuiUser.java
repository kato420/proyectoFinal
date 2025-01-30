package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import code.User;

public class GuiUser extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JButton btnJoin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiUser frame = new GuiUser();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblUsuario = new JLabel("USER");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 20));
		lblUsuario.setBounds(127, 96, 83, 26);
		contentPane.add(lblUsuario);

		lblContrasea = new JLabel("PASSW");
		lblContrasea.setFont(new Font("Dialog", Font.BOLD, 20));
		lblContrasea.setBounds(127, 163, 71, 26);
		contentPane.add(lblContrasea);

		txtUser = new JTextField();
		txtUser.setBounds(247, 96, 134, 33);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setColumns(10);
		txtPass.setBounds(247, 163, 134, 33);
		contentPane.add(txtPass);

		btnJoin = new JButton("JOIN");
		btnJoin.addActionListener(this);
		btnJoin.setBounds(211, 248, 105, 27);
		contentPane.add(btnJoin);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnJoin) {
			actionPerformedBtnJoin(arg0);
		}
	}

	protected void actionPerformedBtnJoin(ActionEvent arg0) {
		User usuario = new User("kato", "12341");
		String u = txtUser.getText();
		String p = new String(txtPass.getPassword());
		if (u.equals(usuario.getUser()) && p.equals(usuario.getPass())) {
			// Mostrar mensaje de sesión iniciada
			JOptionPane.showMessageDialog(null, "Sesión iniciada", "Login", JOptionPane.INFORMATION_MESSAGE);
		} else {
			// Mostrar mensaje de error
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
