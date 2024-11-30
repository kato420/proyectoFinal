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

public class DialogCuota extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogCuota dialog = new DialogCuota();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogCuota() {
		setBounds(100, 100, 422, 174);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Aceptar");
			okButton.setBounds(314, 36, 89, 27);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.setBounds(314, 75, 89, 27);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		{
			JLabel lblCuotaDiariaEsperada = new JLabel("Cuota diaria esperada (S/.)");
			lblCuotaDiariaEsperada.setBounds(12, 58, 158, 17);
			contentPanel.add(lblCuotaDiariaEsperada);
		}
		{
			txtCuota = new JTextField();
			txtCuota.setBounds(188, 56, 114, 21);
			contentPanel.add(txtCuota);
			txtCuota.setColumns(10);
			txtCuota.setText(String.valueOf(Utils.cuotaDiaria));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
