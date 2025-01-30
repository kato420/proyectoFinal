package gui;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Pagos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblInformacinDeMatrculas;
	private JComboBox comboBox;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagos frame = new Pagos();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pagos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblInformacinDeMatrculas = new JLabel("Información de matrículas:");
		lblInformacinDeMatrculas.setBounds(46, 28, 174, 17);
		contentPane.add(lblInformacinDeMatrculas);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Registrados", "Matriculados", "Retirados" }));
		comboBox.setBounds(266, 23, 144, 26);
		contentPane.add(comboBox);

		textArea = new JTextArea();
		textArea.setBounds(46, 90, 481, 195);
		contentPane.add(textArea);
	}

}
