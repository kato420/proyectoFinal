package login;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ingresar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblId;
	private JLabel lblContrasea;
	private JPasswordField passwordField;
	private JTextField txtId;
	private JLabel label;
	private JLabel lblIngreseSusDatos;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public Ingresar() {
		setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setIcon(new ImageIcon(Ingresar.class.getResource("/imagenes/usuario-verificado.png")));
		lblId.setBounds(100, 122, 80, 42);
		add(lblId);
		
		lblContrasea = new JLabel("Password");
		lblContrasea.setIcon(new ImageIcon(Ingresar.class.getResource("/imagenes/seguro.png")));
		lblContrasea.setBounds(100, 176, 99, 32);
		add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 177, 114, 32);
		add(passwordField);
		
		txtId = new JTextField();
		txtId.setBounds(225, 128, 114, 32);
		add(txtId);
		txtId.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Ingresar.class.getResource("/imagenes/iniciar-sesion.png")));
		label.setBounds(119, 35, 80, 72);
		add(label);
		
		lblIngreseSusDatos = new JLabel("Ingrese sus datos");
		lblIngreseSusDatos.setBounds(207, 59, 114, 32);
		add(lblIngreseSusDatos);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Ingresar.class.getResource("/imagenes/sesion.png")));
		btnNewButton.setBounds(273, 231, 66, 42);
		add(btnNewButton);

	}
}
