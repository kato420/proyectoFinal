package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.Utils;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogDescuentos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblA;
	private JLabel lblNewLabel_2;
	private JLabel lblA_1;
	private JLabel lblNewLabel_3;
	private JLabel lblA_2;
	private JLabel lblNewLabel_4;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogDescuentos dialog = new DialogDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogDescuentos() {
		setBounds(100, 100, 462, 241);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(32, 43, 94, 17);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(322, 43, 23, 17);
		contentPanel.add(lblNewLabel_1);
		
		lblA = new JLabel("6 a 10 unidades");
		lblA.setBounds(32, 71, 94, 17);
		contentPanel.add(lblA);
		
		lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setBounds(322, 71, 23, 17);
		contentPanel.add(lblNewLabel_2);
		
		lblA_1 = new JLabel("11 a 15 unidades");
		lblA_1.setBounds(32, 100, 100, 17);
		contentPanel.add(lblA_1);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(322, 100, 23, 17);
		contentPanel.add(lblNewLabel_3);
		
		lblA_2 = new JLabel("Más de 15 unidades");
		lblA_2.setBounds(32, 131, 118, 17);
		contentPanel.add(lblA_2);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(322, 131, 23, 17);
		contentPanel.add(lblNewLabel_4);
		{
			JButton okButton = new JButton("Aceptar");
			okButton.setBounds(363, 61, 85, 27);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cerrar");
			cancelButton.setBounds(363, 95, 85, 27);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(180, 41, 124, 21);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setColumns(10);
		txtPorcentaje2.setBounds(180, 69, 124, 21);
		contentPanel.add(txtPorcentaje2);
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setColumns(10);
		txtPorcentaje3.setBounds(180, 98, 124, 21);
		contentPanel.add(txtPorcentaje3);
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setColumns(10);
		txtPorcentaje4.setBounds(180, 129, 124, 21);
		contentPanel.add(txtPorcentaje4);
		
		//Para darle el valor por defecto
		txtPorcentaje1.setText(String.valueOf(Utils.porcentaje1));
		txtPorcentaje2.setText(String.valueOf(Utils.porcentaje2));
		txtPorcentaje3.setText(String.valueOf(Utils.porcentaje3));
		txtPorcentaje4.setText(String.valueOf(Utils.porcentaje4));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
