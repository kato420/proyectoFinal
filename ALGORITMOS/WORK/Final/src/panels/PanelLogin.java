package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import code.Login;
import code.Menu;
import gui.GuiMenu;

public class PanelLogin extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JButton btnEntrar;

	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setLayout(null);

		label = new JLabel("");
		label.setIcon(new ImageIcon(PanelLogin.class.getResource("/icons/user.png")));
		label.setBounds(178, 111, 128, 128);
		add(label);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(377, 127, 60, 17);
		add(lblUsuario);

		lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(377, 189, 76, 17);
		add(lblContrasea);

		txtUser = new JTextField();
		txtUser.setBounds(375, 156, 114, 21);
		add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JPasswordField();
		txtPass.setBounds(377, 218, 114, 21);
		add(txtPass);

		btnEntrar = new JButton("Ingresar");
		btnEntrar.addActionListener(this);
		btnEntrar.setBounds(293, 316, 107, 42);
		add(btnEntrar);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEntrar) {
			actionPerformedBtnEntrar(arg0);
		}
	}

	protected void actionPerformedBtnEntrar(ActionEvent arg0) {
		opt();
	}

	void opt() {
		String u = txtUser.getText();
		String p = new String(txtPass.getPassword());
		if (u.equals(Login.getUsuario()) && p.equals(Login.getContraseña())) {
			// Mostrar mensaje de sesión iniciada
			JOptionPane.showMessageDialog(null, "Sesión iniciada", "Login", JOptionPane.INFORMATION_MESSAGE);
			// Llamando al nuevo panel
			PanelInterfaz interfaz = new PanelInterfaz();
			GuiMenu.contentPane.removeAll();
			GuiMenu.contentPane.add(interfaz);
			GuiMenu.contentPane.revalidate();
			GuiMenu.contentPane.repaint();
			Menu.setTituloVentana(1);
		}
	}
}