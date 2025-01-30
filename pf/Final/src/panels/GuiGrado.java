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

public class GuiGrado extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnRegistrar;
	private JButton btnRegresar;

	/**
	 * Create the panel.
	 */
	public GuiGrado() {
		setLayout(null);

		lblNombres = new JLabel("CODIGO");
		lblNombres.setBounds(197, 53, 60, 17);
		add(lblNombres);

		lblApellidos = new JLabel("NOMBRE");
		lblApellidos.setBounds(197, 81, 60, 17);
		add(lblApellidos);

		txtNombre = new JTextField();
		txtNombre.setBounds(322, 49, 114, 21);
		add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(322, 79, 114, 21);
		add(txtApellido);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setIcon(new ImageIcon(GuiGrado.class.getResource("/icons/anadir.png")));
		btnRegistrar.setBounds(210, 250, 117, 27);
		add(btnRegistrar);

		btnRegresar = new JButton("MODIFICAR");
		btnRegresar.addActionListener(this);
		btnRegresar.setIcon(new ImageIcon(GuiGrado.class.getResource("/icons/flecha-izquierda.png")));
		btnRegresar.setBounds(356, 250, 122, 27);
		add(btnRegresar);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(210, 211, 105, 27);
		add(btnNuevo);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(356, 212, 105, 27);
		add(btnEliminar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(210, 173, 105, 27);
		add(btnBuscar);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setBounds(362, 174, 105, 27);
		add(btnCerrar);

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
