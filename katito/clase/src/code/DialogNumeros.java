package code;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogNumeros extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JTextField txt2;
	private JLabel lblNewLabel;
	private JLabel lblValor;
	private JButton okButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogNumeros dialog = new DialogNumeros();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogNumeros() {
		setBounds(100, 100, 415, 192);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(144, 35, 86, 20);
		contentPanel.add(txt1);
		txt1.setColumns(10);
		txt1.setText(String.valueOf(GuiPractica.val1));
		
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(144, 66, 86, 20);
		contentPanel.add(txt2);
		txt2.setText(String.valueOf(GuiPractica.val2));
		
		lblNewLabel = new JLabel("VALOR 1:");
		lblNewLabel.setBounds(39, 38, 56, 14);
		contentPanel.add(lblNewLabel);
		
		lblValor = new JLabel("VALOR 2:");
		lblValor.setBounds(39, 69, 56, 14);
		contentPanel.add(lblValor);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(this);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cancelButton) {
			actionPerformedCancelButton(arg0);
		}
		if (arg0.getSource() == okButton) {
			actionPerformedOkButton(arg0);
		}
	}
	protected void actionPerformedOkButton(ActionEvent arg0) {
		GuiPractica.val1 = Integer.parseInt(txt1.getText());
		GuiPractica.val2 = Integer.parseInt(txt2.getText());
	}
	protected void actionPerformedCancelButton(ActionEvent arg0) {
		dispose();
	}
}
