package login;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblIngreseSusDatos;
	private JLabel lblRegistreSusDatos;
	private JLabel lblNombre;
	private JLabel lblId;
	private JLabel lblPassword;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public Crear() {
		setLayout(null);
		
		lblIngreseSusDatos = new JLabel("");
		lblIngreseSusDatos.setIcon(new ImageIcon(Crear.class.getResource("/imagenes/ideas.png")));
		lblIngreseSusDatos.setBounds(30, 22, 79, 64);
		add(lblIngreseSusDatos);
		
		lblRegistreSusDatos = new JLabel("Registre sus datos");
		lblRegistreSusDatos.setBounds(121, 49, 114, 17);
		add(lblRegistreSusDatos);
		
		lblNombre = new JLabel("Name");
		lblNombre.setIcon(new ImageIcon(Crear.class.getResource("/imagenes/lapiz.png")));
		lblNombre.setBounds(49, 118, 79, 32);
		add(lblNombre);
		
		lblId = new JLabel("ID");
		lblId.setIcon(new ImageIcon(Crear.class.getResource("/imagenes/usuario-verificado.png")));
		lblId.setBounds(49, 168, 60, 31);
		add(lblId);
		
		lblPassword = new JLabel("Password");
		lblPassword.setIcon(new ImageIcon(Crear.class.getResource("/imagenes/seguro.png")));
		lblPassword.setBounds(49, 211, 101, 32);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(154, 124, 114, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 166, 114, 21);
		add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 217, 114, 21);
		add(passwordField);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(this);
		btnNewButton.setIcon(new ImageIcon(Crear.class.getResource("/imagenes/privacidad.png")));
		btnNewButton.setBounds(280, 217, 98, 68);
		add(btnNewButton);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		PanelLogin.mensaje("Registro exitoso");
	}
}
