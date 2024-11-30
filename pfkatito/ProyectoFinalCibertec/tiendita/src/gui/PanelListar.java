package gui;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextArea;

import metodos.Utils;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class PanelListar extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea txtS;
	private JButton btnListar;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public PanelListar() {
		setBackground(SystemColor.menu);
		setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(368, 483, 89, 23);
		add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 11, 619, 458);
		add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	
	//FUNCION QUE PRINTEA EL TITULO
	public void directFunct(){
		txtS.setText("LISTADO DE COCINAS" + "\n");
		txtS.append("----------------------------------------"+"\n");
	}
	//FUNCIO QUE IMPRIME EL CONTENIDO DINAMICAMENTE:
	public void printItems(int modelo) {
		txtS.append("Modelo: " + Utils.obtenerPropiedadDinamica("modelo", modelo) + "\n");
		txtS.append("Precio: " + Utils.obtenerPropiedadDinamica("precio", modelo) + "\n");
		txtS.append("Profundidad: " + Utils.obtenerPropiedadDinamica("fondo", modelo) + "\n");
		txtS.append("Ancho: " + Utils.obtenerPropiedadDinamica("ancho", modelo) + "\n");
		txtS.append("Alto:" + Utils.obtenerPropiedadDinamica("alto", modelo) + "\n");
		txtS.append("Quemadores: " + Utils.obtenerPropiedadDinamica("quemadores", modelo) + "\n");
		txtS.append("Stock: " + Utils.obtenerPropiedadDinamica("stock", modelo) + "\n");
		txtS.append("\n");
	}
	public void forItems() {
		for (int i = 1; i < 6; i++) {
			printItems(i);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		directFunct();
		forItems();
		txtS.setCaretPosition(0);
	}
}
