package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelRegistrar extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblFNacimiento;
	private JLabel lblGenero;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JComboBox cboGenero;
	private JComboBox cboDia;
	private JComboBox cboMes;
	private JComboBox cboAge;
	private JLabel lblDireccin;
	private JTextField txtDireccion;
	private JLabel lblTelfono;
	private JTextField txtTelefono;
	private JLabel lblCorreo;
	private JTextField txtCorreo;
	private JLabel lblNivelEducativo;
	private JComboBox cboNivel;
	private JLabel lblGrado;
	private JComboBox cboGrado;
	private JLabel lblSeccin;
	private JComboBox cboSeccion;
	private JButton btnRegistrar;
	private JButton btnRegresar;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public PanelRegistrar() {
		setLayout(null);

		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(12, 51, 60, 17);
		add(lblNombres);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(12, 81, 60, 17);
		add(lblApellidos);

		lblDni = new JLabel("DNI:");
		lblDni.setBounds(12, 112, 60, 17);
		add(lblDni);

		lblFNacimiento = new JLabel("F. Nacimiento:");
		lblFNacimiento.setBounds(12, 286, 86, 17);
		add(lblFNacimiento);

		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(12, 146, 60, 17);
		add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setBounds(111, 49, 114, 21);
		add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(111, 79, 114, 21);
		add(txtApellido);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(111, 110, 114, 21);
		add(txtDNI);

		cboGenero = new JComboBox();
		cboGenero.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
		cboGenero.setBounds(111, 141, 113, 26);
		add(cboGenero);

		cboDia = new JComboBox();
		cboDia.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		cboDia.setBounds(117, 281, 41, 26);
		add(cboDia);

		cboMes = new JComboBox();
		cboMes.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		cboMes.setBounds(170, 281, 41, 26);
		add(cboMes);

		cboAge = new JComboBox();
		cboAge.setModel(new DefaultComboBoxModel(new String[] { "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018" }));
		cboAge.setBounds(223, 281, 56, 26);
		add(cboAge);

		lblDireccin = new JLabel("Dirección:");
		lblDireccin.setBounds(12, 181, 60, 17);
		add(lblDireccin);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(111, 179, 114, 21);
		add(txtDireccion);

		lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(12, 214, 60, 17);
		add(lblTelfono);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(111, 212, 114, 21);
		add(txtTelefono);

		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(12, 247, 60, 17);
		add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(111, 245, 114, 21);
		add(txtCorreo);

		lblNivelEducativo = new JLabel("Nivel Educativo:");
		lblNivelEducativo.setBounds(384, 46, 97, 17);
		add(lblNivelEducativo);

		cboNivel = new JComboBox();
		cboNivel.setModel(new DefaultComboBoxModel(new String[] { "Primaria", "Secundaria" }));
		cboNivel.setBounds(511, 41, 97, 26);
		add(cboNivel);

		lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(384, 97, 46, 17);
		add(lblGrado);

		cboGrado = new JComboBox();
		cboGrado.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
		cboGrado.setBounds(435, 92, 46, 26);
		add(cboGrado);

		lblSeccin = new JLabel("Sección:");
		lblSeccin.setBounds(496, 97, 60, 17);
		add(lblSeccin);

		cboSeccion = new JComboBox();
		cboSeccion.setModel(new DefaultComboBoxModel(new String[] { "A", "B", "C" }));
		cboSeccion.setBounds(562, 92, 46, 26);
		add(cboSeccion);

		btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setIcon(new ImageIcon(PanelRegistrar.class.getResource("/icons/anadir.png")));
		btnRegistrar.setBounds(376, 280, 105, 27);
		add(btnRegistrar);

		btnRegresar = new JButton("");
		btnRegresar.addActionListener(this);
		btnRegresar.setIcon(new ImageIcon(PanelRegistrar.class.getResource("/icons/flecha-izquierda.png")));
		btnRegresar.setBounds(503, 280, 105, 27);
		add(btnRegresar);

		textArea = new JTextArea();
		textArea.setBounds(375, 126, 233, 138);
		add(textArea);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRegresar) {
			actionPerformedBtnRegresar(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
	}

	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {

	}

	protected void actionPerformedBtnRegresar(ActionEvent arg0) {
		// CREANDO EL PANEL CENTRAL POR DEFECTO
		PanelDefecto defecto = new PanelDefecto();
		PanelInterfaz.panel.removeAll();
		PanelInterfaz.panel.add(defecto);
		PanelInterfaz.panel.revalidate();
		PanelInterfaz.panel.repaint();
	}
}
