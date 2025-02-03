package login;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelLogin extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton btnIngresar;
	private JButton btnCrear;
	private JLabel lblInstitucinEducativaN;
	private JPanel panelUsuarios;
	private JLabel lblDatos;
	private JLabel lblInstitucinEducativan;
	private JSeparator separator;
	private JScrollPane scrollPane;
	public static JTextArea txtS;

	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setLayout(null);

		label = new JLabel("");
		label.setIcon(new ImageIcon(PanelLogin.class.getResource("/imagenes/colegio.png")));
		label.setBounds(53, 185, 128, 128);
		add(label);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(589, 464, 105, 27);
		add(btnIngresar);

		btnCrear = new JButton("CREAR");
		btnCrear.addActionListener(this);
		btnCrear.setBounds(749, 464, 105, 27);
		add(btnCrear);

		lblInstitucinEducativaN = new JLabel("SISTEMA DE MATRICULA 2025");
		lblInstitucinEducativaN.setFont(new Font("Dialog", Font.BOLD, 30));
		lblInstitucinEducativaN.setBounds(256, 27, 438, 42);
		add(lblInstitucinEducativaN);

		panelUsuarios = new JPanel();
		panelUsuarios.setForeground(UIManager.getColor("CheckBox.foreground"));
		panelUsuarios.setBorder(new TitledBorder(new LineBorder(new Color(51, 51, 51)), "SESION", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelUsuarios.setBounds(501, 119, 397, 329);
		add(panelUsuarios);
		panelUsuarios.setLayout(new CardLayout(0, 0));

		// VALOR POR DEFECTO
		Ingresar ingresar = new Ingresar();
		panelUsuarios.removeAll();
		panelUsuarios.add(ingresar);
		panelUsuarios.revalidate();
		panelUsuarios.repaint();

		// OBTENER DATOS DEL DIA
		LocalDateTime now = LocalDateTime.now();
		// Formatear la fecha y hora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = now.format(formatter);

		lblDatos = new JLabel("");
		lblDatos.setBounds(788, 536, 110, 27);
		add(lblDatos);
		lblDatos.setText(formattedDateTime);

		lblInstitucinEducativan = new JLabel("Institución educativa I.E. N° 116");
		lblInstitucinEducativan.setFont(new Font("Dialog", Font.BOLD, 20));
		lblInstitucinEducativan.setBounds(101, 111, 336, 27);
		add(lblInstitucinEducativan);

		separator = new JSeparator();
		separator.setForeground(UIManager.getColor("Button.foreground"));
		separator.setBounds(53, 81, 847, 36);
		add(separator);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(199, 185, 292, 181);
		add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		bienvenida();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrear) {
			actionPerformedBtnCrear(e);
		}
		if (e.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(e);
		}
	}

	protected void actionPerformedBtnIngresar(ActionEvent e) {
		Ingresar ingresar = new Ingresar();
		panelUsuarios.removeAll();
		panelUsuarios.add(ingresar);
		panelUsuarios.revalidate();
		panelUsuarios.repaint();
		bienvenida();
		imprimir("Ingrese los datos registrados al momento de crear");
		imprimir("su usuario.");

	}

	protected void actionPerformedBtnCrear(ActionEvent e) {
		Crear crear = new Crear();
		panelUsuarios.removeAll();
		panelUsuarios.add(crear);
		panelUsuarios.revalidate();
		panelUsuarios.repaint();
		bienvenida();
		imprimir("Registre sus datos para poder acceder");
		imprimir("al sistema de matricula.");
	}

	///AGREGANDO ALGUNOS METODOS
	///INGRESANDO EL METODO PARA IMPRIMIR
	public void imprimir(String s) {
		txtS.append(s + "\n");
	}

	///INGRESANDO MENSAJE DE BIENVENIDA
	public void bienvenida() {
		txtS.setText("== BIENVENIDO AL SISTEMA DE REGISTRO 2025 ==" + "\n");
		imprimir(" ");
	}
	public static void mensaje(String s) {
		txtS.setText(s +"\n");
	}
}
