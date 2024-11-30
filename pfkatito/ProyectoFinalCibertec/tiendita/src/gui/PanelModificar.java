package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;

import metodos.Utils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.SystemColor;

public class PanelModificar extends JPanel implements ActionListener {

  private static final long serialVersionUID = 1L;
  private JLabel lblNewLabel;
  private JComboBox cboModelo;
  private JLabel lblPrecio;
  private JTextField txtPrecio;
  private JLabel lblAncho;
  private JTextField txtAncho;
  private JLabel lblAlto;
  private JTextField txtAlto;
  private JLabel lblFondo;
  private JTextField txtFondo;
  private JLabel lblQuemadores;
  private JTextField txtQuemadores;
  private JButton btnGrabar;
  private JLabel lblQuemadores_1;
  private JTextField txtStock;
  private JButton txtGrabar;

  /**
   * Create the panel.
   */
  public PanelModificar() {
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
		txtPrecio.setBounds(376, 94, 173, 37);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtAncho.setColumns(10);
		txtAncho.setBounds(376, 167, 173, 37);
		add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtAlto.setColumns(10);
		txtAlto.setBounds(376, 230, 173, 37);
		add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtFondo.setColumns(10);
		txtFondo.setBounds(376, 293, 173, 37);
		add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtFondo.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(376, 356, 173, 37);
		add(txtQuemadores);
		
		lblQuemadores_1 = new JLabel("Stock");
		lblQuemadores_1.setIcon(new ImageIcon(PanelModificar.class.getResource("/imagenes/carrito-de-compra-anadir.png")));
		lblQuemadores_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblQuemadores_1.setBounds(178, 417, 158, 28);
		add(lblQuemadores_1);
		
		txtStock = new JTextField();
		txtStock.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtStock.setColumns(10);
		txtStock.setBounds(376, 408, 173, 37);
		add(txtStock);
		
		txtGrabar = new JButton("Grabar");
		txtGrabar.addActionListener(this);
		txtGrabar.setBounds(598, 49, 106, 27);
		add(txtGrabar);
  }

  public void actionPerformed(ActionEvent e) {
  	if (e.getSource() == txtGrabar) {
  		actionPerformedTxtGrabar(e);
  	}
    if (e.getSource() == cboModelo) {
      actionPerformedCboModelo(e);
    }
  }

  void cambiarValores() {
    double precio, alto, ancho, fondo;
    int quemadores, stock;
    precio = Double.parseDouble(txtPrecio.getText());
    alto = Double.parseDouble(txtAlto.getText());
    ancho = Double.parseDouble(txtAncho.getText());
    fondo = Double.parseDouble(txtFondo.getText());
    quemadores = Integer.parseInt(txtQuemadores.getText());
    stock = Integer.parseInt(txtStock.getText());
    // Transformacion de los valores
    int modelo = cboModelo.getSelectedIndex();
    if (modelo == 1) {
      Utils.precio1 = precio;
      Utils.alto1 = alto;
      Utils.ancho1 = ancho;
      Utils.fondo1 = fondo;
      Utils.quemadores1 = quemadores;
      Utils.stock1 = stock;
    } else if (modelo == 2) {
      Utils.precio2 = precio;
      Utils.alto2 = alto;
      Utils.ancho2 = ancho;
      Utils.fondo2 = fondo;
      Utils.quemadores2 = quemadores;
      Utils.stock2 = stock;
    } else if (modelo == 3) {
      Utils.precio3 = precio;
      Utils.alto3 = alto;
      Utils.ancho3 = ancho;
      Utils.fondo3 = fondo;
      Utils.quemadores3 = quemadores;
      Utils.stock3 = stock;
    } else if (modelo == 4) {
      Utils.precio4 = precio;
      Utils.alto4 = alto;
      Utils.ancho4 = ancho;
      Utils.fondo4 = fondo;
      Utils.quemadores4 = quemadores;
      Utils.stock4 = stock;
    } else if (modelo == 5) {
      Utils.precio5 = precio;
      Utils.alto5 = alto;
      Utils.ancho5 = ancho;
      Utils.fondo5 = fondo;
      Utils.quemadores5 = quemadores;
      Utils.stock5 = stock;
    } else { // para que no nos de error
      txtPrecio.setText("");
      txtAlto.setText("");
      txtAncho.setText("");
      txtFondo.setText("");
      txtQuemadores.setText("");
      txtStock.setText("");
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
  }

  // método para darle el valor del indice de cada modelo
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

  protected void actionPerformedCboModelo(ActionEvent e) {
    int modelo = cboModelo.getSelectedIndex();
    darIndice(modelo);
  	}
	protected void actionPerformedTxtGrabar(ActionEvent e) {
		cambiarValores();
	}
}
