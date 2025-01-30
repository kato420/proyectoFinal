package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import code.Menu;

public class GuiMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtS;
	private JButton btnRegistro_1;
	private JButton btnRegistro_2;
	private JButton btnRegistro_3;
	private JButton btnRegistro;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMenu frame = new GuiMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setBounds(222, 33, 373, 338);
		contentPane.add(txtS);

		btnRegistro_1 = new JButton("REGISTRO");
		btnRegistro_1.addActionListener(this);
		btnRegistro_1.setBounds(58, 103, 105, 27);
		contentPane.add(btnRegistro_1);

		btnRegistro_2 = new JButton("VERIFICAR");
		btnRegistro_2.addActionListener(this);
		btnRegistro_2.setBounds(58, 163, 105, 27);
		contentPane.add(btnRegistro_2);

		btnRegistro_3 = new JButton("MODIFICAR");
		btnRegistro_3.addActionListener(this);
		btnRegistro_3.setBounds(58, 227, 105, 27);
		contentPane.add(btnRegistro_3);

		btnRegistro = new JButton("OK");
		btnRegistro.setBounds(42, 344, 59, 27);
		contentPane.add(btnRegistro);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(120, 344, 69, 27);
		contentPane.add(btnSalir);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRegistro_3) {
			actionPerformedBtnRegistro_3(arg0);
		}
		if (arg0.getSource() == btnRegistro_2) {
			actionPerformedBtnRegistro_2(arg0);
		}
		if (arg0.getSource() == btnRegistro_1) {
			actionPerformedBtnRegistro_1(arg0);
		}
	}

	protected void actionPerformedBtnRegistro_1(ActionEvent arg0) {
		Menu.setOpcion(1);
		informacion(Menu.getOpcion());
	}

	protected void actionPerformedBtnRegistro_2(ActionEvent arg0) {
		Menu.setOpcion(2);
		informacion(Menu.getOpcion());
	}

	protected void actionPerformedBtnRegistro_3(ActionEvent arg0) {
		Menu.setOpcion(3);
		informacion(Menu.getOpcion());
	}

	void informacion(int valor) {
		imprimir();
		switch (valor) {
		case 1: {
			imprimir();
			imprimir("========== Registrar Alumno: ");
			imprimir("Mac pato cabro");
			break;
		}
		case 2: {
			imprimir();
			imprimir("========== Verificar Registros: ");
			break;
		}
		case 3: {
			imprimir();
			imprimir("========== Modificar Registros: ");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + valor);
		}
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}

	void imprimir() {
		txtS.setText("");
	}
}
