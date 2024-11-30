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

public class DialogRegalos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAM;
	private JTextField txtRegalo1;
	private JTextField txtRegalo2;
	private JTextField txtRegalo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogRegalos dialog = new DialogRegalos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogRegalos() {
		setBounds(100, 100, 479, 228);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Aceptar");
			okButton.setBounds(333, 62, 89, 27);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.setBounds(333, 101, 89, 27);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		
		lblNewLabel = new JLabel("1 unidad");
		lblNewLabel.setBounds(43, 62, 60, 17);
		contentPanel.add(lblNewLabel);
		
		lblA = new JLabel("2 a 5 unidades");
		lblA.setBounds(43, 91, 89, 17);
		contentPanel.add(lblA);
		
		lblAM = new JLabel("6 a más unidades");
		lblAM.setBounds(43, 121, 104, 17);
		contentPanel.add(lblAM);
		
		txtRegalo1 = new JTextField();
		txtRegalo1.setBounds(187, 60, 114, 21);
		contentPanel.add(txtRegalo1);
		txtRegalo1.setColumns(10);
		
		txtRegalo2 = new JTextField();
		txtRegalo2.setColumns(10);
		txtRegalo2.setBounds(187, 89, 114, 21);
		contentPanel.add(txtRegalo2);
		
		txtRegalo3 = new JTextField();
		txtRegalo3.setColumns(10);
		txtRegalo3.setBounds(187, 119, 114, 21);
		contentPanel.add(txtRegalo3);
		
		//Configurar los valores por defecto:
		txtRegalo1.setText(String.valueOf(Utils.obsequio1));
		txtRegalo2.setText(String.valueOf(Utils.obsequio2));
		txtRegalo3.setText(String.valueOf(Utils.obsequio3));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
