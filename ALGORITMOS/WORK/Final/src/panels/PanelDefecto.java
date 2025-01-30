package panels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import code.Login;

public class PanelDefecto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblMes;
	private JTextArea txtS;

	/**
	 * Create the panel.
	 */
	void imprimir(String s) {
		txtS.append(s + "\n");
	}

	public PanelDefecto() {
		setLayout(null);

		lblMes = new JLabel("");
		lblMes.setIcon(new ImageIcon(PanelDefecto.class.getResource("/icons/pro.png")));
		lblMes.setBounds(12, 61, 366, 251);
		add(lblMes);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setBounds(417, 61, 263, 251);
		add(txtS);

		txtS.setText("=========  DATOS DEL USUARIO  =========" + "\n");
		imprimir("Usuario: " + Login.getUsuario());
	}
}
