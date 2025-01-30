package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import code.GeneralClass;

public class ModificarRegistro extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JTextField txtName;
	private JTextField txtAdd;
	private JLabel lblDni;
	private JTextField txtDni;
	private JLabel lblFechaNacimiento;
	private JLabel lblSexo;
	private JComboBox cboSexo;
	private JTextArea txtS;
	private JLabel lblDatosDelRegistro;
	private JSeparator separator;
	private JButton btnVerificar;
	private JButton btnCrear;
	private JLabel lblSeccin;
	private JComboBox cboSeccion;
	private JComboBox cboDia;
	private JComboBox cboMes;
	private JComboBox cboAge;
	private JLabel lblTelefono;
	private JTextField txtTelefono;
	private JLabel lblRegistro;

	/**
	 * Create the panel.
	 */
	public ModificarRegistro() {
		setLayout(null);

		lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(92, 33, 60, 17);
		add(lblNombre);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(92, 62, 60, 17);
		add(lblApellidos);

		txtName = new JTextField();
		txtName.setBounds(189, 31, 114, 21);
		add(txtName);
		txtName.setColumns(10);

		txtAdd = new JTextField();
		txtAdd.setBounds(189, 60, 114, 21);
		add(txtAdd);
		txtAdd.setColumns(10);

		lblDni = new JLabel("DNI:");
		lblDni.setBounds(92, 95, 60, 17);
		add(lblDni);

		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(189, 93, 114, 21);
		add(txtDni);

		lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(338, 33, 120, 17);
		add(lblFechaNacimiento);

		lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(338, 62, 40, 17);
		add(lblSexo);

		cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
		cboSexo.setBounds(381, 57, 89, 26);
		add(cboSexo);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setBounds(92, 165, 518, 195);
		add(txtS);

		lblDatosDelRegistro = new JLabel("DATOS DEL REGISTRO");
		lblDatosDelRegistro.setBounds(92, 136, 137, 17);
		add(lblDatosDelRegistro);

		separator = new JSeparator();
		separator.setBounds(92, 159, 518, 17);
		add(separator);

		btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(this);
		btnVerificar.setBounds(381, 126, 105, 27);
		add(btnVerificar);

		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(this);
		btnCrear.setBounds(498, 126, 105, 27);
		add(btnCrear);

		lblSeccin = new JLabel("Sección:");
		lblSeccin.setBounds(488, 62, 60, 17);
		add(lblSeccin);

		cboSeccion = new JComboBox();
		cboSeccion.setModel(new DefaultComboBoxModel(new String[] { "A", "B", "C" }));
		cboSeccion.setBounds(553, 57, 89, 26);
		add(cboSeccion);

		cboDia = new JComboBox();
		cboDia.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		cboDia.setBounds(460, 28, 48, 26);
		add(cboDia);

		cboMes = new JComboBox();
		cboMes.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		cboMes.setBounds(514, 28, 48, 26);
		add(cboMes);

		cboAge = new JComboBox();
		cboAge.setModel(new DefaultComboBoxModel(new String[] { "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018" }));
		cboAge.setBounds(576, 28, 66, 26);
		add(cboAge);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(338, 95, 60, 17);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(404, 93, 114, 21);
		add(txtTelefono);

		lblRegistro = new JLabel("Registro: ");
		lblRegistro.setBounds(12, 343, 78, 17);
		add(lblRegistro);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrear) {
			actionPerformedBtnCrear(e);
		}
		if (e.getSource() == btnVerificar) {
			actionPerformedBtnNewButton(e);
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		GeneralClass.contador++;
		txtS.setText("=========================== REGISTRO DE ALUMNO ===========================" + "\n");
		Registro();
	}

	protected void actionPerformedBtnCrear(ActionEvent e) {

	}

	void print(String s) {
		txtS.append(" " + s + "\n");
	}

	void Registro() {
		String alumno = txtName.getText() + " " + txtAdd.getText();
		alumno = alumno.toUpperCase();
		String dni = txtDni.getText();
		int indexSexo = cboSexo.getSelectedIndex();
		int indexSecc = cboSeccion.getSelectedIndex();
		int indexAge = cboAge.getSelectedIndex();
		int Age = 7 + indexAge;
		String telefono = txtTelefono.getText();
		String codigo = genCode(alumno, dni, Age);

		print("ALUMNO: " + alumno);
		print("DNI: " + dni);
//		sexo
		switch (indexSexo) {
		case 0: {
			print("SEXO: " + "MASCULINO");
			break;
		}
		default:
			print("SEXO: " + "FEMENINO");
		}
//		sección
		switch (indexSecc) {
		case 0: {
			print("SECCIÓN: " + "A");
			break;
		}
		case 1: {
			print("SECCIÓN: " + "B");
			break;
		}
		default:
			print("SECCIÓN: " + "C");
		}
		print("EDAD: " + Age);
		print("TELEFONO: " + telefono);
		lblRegistro.setText("Registro: " + GeneralClass.contador);
		print("Codigo: " + codigo);
	}

	String genCode(String a, String d, int age) {
		String code = "" + a.charAt(0) + d.charAt(d.length() - 1) + age + "2025";
		return code;
	}
}
