package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;

import metodos.Utils;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class PanelConsultar extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JLabel lblStock;
	private JTextField txtStock;

	/**
	 * Create the panel.
	 */
	public PanelConsultar() {
		setBackground(SystemColor.menu);
		setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(178, 45, 96, 28);
		lblNewLabel.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/parrilla.png")));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblNewLabel);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(178, 108, 82, 28);
		lblPrecio.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/money-wings.png")));
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblPrecio);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(178, 171, 91, 28);
		lblAncho.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/regla-horizontal.png")));
		lblAncho.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblAncho);
		
		lblAlto = new JLabel("Alto");
		lblAlto.setBounds(178, 234, 70, 28);
		lblAlto.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/regla-vertical.png")));
		lblAlto.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblAlto);
		
		lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(178, 297, 96, 28);
		lblFondo.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/regla-triangulo.png")));
		lblFondo.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblFondo);
		
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(178, 360, 158, 28);
		lblQuemadores.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/fuego.png")));
		lblQuemadores.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblQuemadores);
		
		cboModelo = new JComboBox();
		cboModelo.setFont(new Font("Dialog", Font.BOLD, 20));
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Elegir modelo", Utils.modelo1, Utils.modelo2, Utils.modelo3, Utils.modelo4, Utils.modelo5}));
		cboModelo.setBounds(376, 45, 187, 37);
		add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(376, 94, 173, 37);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(376, 167, 173, 37);
		add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtAlto.setEditable(false);
		txtAlto.setColumns(10);
		txtAlto.setBounds(376, 230, 173, 37);
		add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtFondo.setEditable(false);
		txtFondo.setColumns(10);
		txtFondo.setBounds(376, 293, 173, 37);
		add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtFondo.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtQuemadores.setEditable(false);
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(376, 356, 173, 37);
		add(txtQuemadores);
		
		lblStock = new JLabel("Stock");
		lblStock.setIcon(new ImageIcon(PanelConsultar.class.getResource("/imagenes/carrito-de-compra-anadir.png")));
		lblStock.setFont(new Font("Dialog", Font.BOLD, 20));
		lblStock.setBounds(178, 416, 158, 28);
		add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtStock.setEditable(false);
		txtStock.setColumns(10);
		txtStock.setBounds(376, 412, 173, 37);
		add(txtStock);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedComboBox(e);
		}
	}
	
	// METODOS DE SALIDA PARA LOS txt
	void obtenerValores(int modelo) {
		    txtPrecio.setText(Utils.obtenerPropiedadDinamica("precio", modelo));
		    txtAlto.setText(Utils.obtenerPropiedadDinamica("alto", modelo));
		    txtAncho.setText(Utils.obtenerPropiedadDinamica("ancho", modelo));
		    txtFondo.setText(Utils.obtenerPropiedadDinamica("fondo", modelo));
		    txtQuemadores.setText(Utils.obtenerPropiedadDinamica("quemadores", modelo));
		    txtStock.setText(Utils.obtenerPropiedadDinamica("stock", modelo));
	}

	void obtenerValoresVacios() {
	    txtPrecio.setText("");
	    txtAlto.setText("");
	    txtAncho.setText("");
	    txtFondo.setText("");
	    txtQuemadores.setText("");
	    txtStock.setText("");
	  }
	
	 //método para darle el valor del indice de cada modelo
	 void darIndice(int modelo) {
		 if (modelo == 1) {
		      obtenerValores(modelo);
		    } else if (modelo == 2) {
		      obtenerValores(modelo);
		    } else if (modelo == 3) {
		      obtenerValores(modelo);
		    } else if (modelo == 4) {
		      obtenerValores(modelo);
		    } else if (modelo == 5) {
		      obtenerValores(modelo);
		    } else {
		      // para que no nos de error
		      obtenerValoresVacios();
		    }
	 }
	
	protected void actionPerformedComboBox(ActionEvent e) {
	    int modelo = cboModelo.getSelectedIndex();
	    darIndice(modelo);
	}
}
