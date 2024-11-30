package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.Utils;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiPrueba extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNombre;
	private JTextArea txtS;
	private JTextField txtNombre;
	private JButton btnSaludar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPrueba frame = new GuiPrueba();
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
	public GuiPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(51, 28, 60, 17);
		contentPane.add(lblNombre);
		
		txtS = new JTextArea();
		txtS.setBounds(48, 75, 334, 162);
		contentPane.add(txtS);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(154, 26, 114, 21);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(this);
		btnSaludar.setBounds(300, 23, 106, 27);
		contentPane.add(btnSaludar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSaludar) {
			actionPerformedBtnSaludar(e);
		}
	}
	protected void actionPerformedBtnSaludar(ActionEvent e) {
		String nombre = txtNombre.getText();
		txtS.setText(Utils.saludar(nombre));
	}
}
