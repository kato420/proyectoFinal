package gui;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import metodos.Utils;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelVender extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;

	/**
	 * Create the panel.
	 */
	public PanelVender() {
		setBackground(SystemColor.menu);
		setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(152, 80, 73, 25);
		add(lblNewLabel);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(152, 124, 73, 25);
		add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCantidad.setBounds(152, 165, 93, 25);
		add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrecio.setBounds(289, 126, 137, 23);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(289, 167, 137, 23);
		add(txtCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Escoge un modelo", Utils.modelo1, Utils.modelo2, Utils.modelo3, Utils.modelo4, Utils.modelo5}));
		cboModelo.setBounds(289, 86, 137, 20);
		add(cboModelo);
		
		btnVender = new JButton("vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(516, 85, 89, 23);
		add(btnVender);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.setBounds(516, 126, 89, 23);
		add(btnCerrar);
		
		txtS = new JTextArea();
		txtS.setBounds(75, 229, 583, 258);
		add(txtS);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == cboModelo) {
			actionPerformedComboBox(arg0);
		}
	}
	
	//CODIGO PARA GENERAR LOS VALORES
	void obtenerValores(int modelo) {
	    txtPrecio.setText(Utils.obtenerPropiedadDinamica("precio", modelo));
	    
	}

	void obtenerValoresVacios() {
		txtPrecio.setText("");
   
	}
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
	//PARTE DEL CODIGO QUE MUESTRA LOS PRECIOS DE LOS MODELOS AL ELEGIR UNA COCINA
	protected void actionPerformedComboBox(ActionEvent arg0) {
		int modelo = cboModelo.getSelectedIndex();
		darIndice(modelo);
	}
	
	//FUNCION PARA IMPRIMIR LOS VALORES DE LA BOLETA
	void imprimirBoleta(int indice) {
		int cantidad = Integer.parseInt(txtCantidad.getText());
		int modelo = cboModelo.getSelectedIndex();
		double precio = Double.parseDouble(Utils.obtenerPropiedadDinamica("precio", modelo));
		//obtener el porcentaje
		double porcentaje = 0;
		if (1 <= cantidad && cantidad < 6) {
			porcentaje = Utils.porcentaje1;
		} 	else if (6 <= cantidad && cantidad < 11) {
			porcentaje = Utils.porcentaje2;
		}	else if (11 <= cantidad && cantidad < 15) {
			porcentaje = Utils.porcentaje3;
		} else {
			porcentaje = Utils.porcentaje4;
		}
		//obtener el obsequio
		String obs;
		if (cantidad == 1) {
			obs = Utils.obsequio1;
		} 	else if (2 <= cantidad && cantidad < 6) {
			obs = Utils.obsequio2;
		}  else {
			obs = Utils.obsequio3;
		}
		porcentaje = porcentaje/100.0;
		double ic  = cantidad * precio;
		double des = porcentaje * ic; // no olvidar que soy un idiota importante variableee!!!!!!!!
		txtS.append("Modelo: " + Utils.obtenerPropiedadDinamica("modelo", modelo) + "\n");
		txtS.append("Precio: S/. " + Utils.obtenerPropiedadDinamica("precio", modelo) + "\n");
		txtS.append("Cantidad: " + cantidad + "\n");
		txtS.append("Importe de compra: S/. " + (ic) + "\n");
		txtS.append("Importe de descuento: S/. " + (des) + "\n");
		txtS.append("Importe a pagar: S/. " + (ic-des) + "\n");
		txtS.append("Obsequio: " + obs + "\n");
		
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		int modelo = cboModelo.getSelectedIndex();
		txtS.setText("BOLETA DE VENTA" + "\n");
		txtS.append("-------------------------------" + "\n");
		if (modelo == 1) {
		    	imprimirBoleta(modelo);
		    } else if (modelo == 2) {
		    	imprimirBoleta(modelo);
		    } else if (modelo == 3) {
		    	imprimirBoleta(modelo);
		    } else if (modelo == 4) {
		    	imprimirBoleta(modelo);
		    } else if (modelo == 5) {
		    	imprimirBoleta(modelo);
		    } else {
		      // para que no nos de error
		      txtS.setText("");
		    }
		
	}
}
