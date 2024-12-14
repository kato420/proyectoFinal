package code;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GuiPractica extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextArea txtS;
	private JButton btnTriangulo;
	private JLabel lblValor;
	private JTextField txtEntrada;
	private JButton btnNewButton_1;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;

	public static int val1 = 0;
	public static int val2 = 0;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPractica frame = new GuiPractica();
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
	public GuiPractica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 339);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("numeros");
		mnNewMenu.addActionListener(this);
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("cambiar valores");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("FIGURA:");
		lblNewLabel.setBounds(43, 67, 46, 14);
		contentPane.add(lblNewLabel);

		btnNewButton = new JButton("CUADRADO");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(120, 63, 99, 23);
		contentPane.add(btnNewButton);

		txtS = new JTextArea();
		txtS.setBounds(43, 110, 343, 140);
		contentPane.add(txtS);

		btnTriangulo = new JButton("TRIANGULO");
		btnTriangulo.addActionListener(this);
		btnTriangulo.setBounds(229, 63, 99, 23);
		contentPane.add(btnTriangulo);

		lblValor = new JLabel("VALOR:");
		lblValor.setBounds(43, 42, 46, 14);
		contentPane.add(lblValor);

		txtEntrada = new JTextField();
		txtEntrada.setBounds(120, 32, 86, 20);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);

		btnNewButton_1 = new JButton("ALEATORIO");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(229, 31, 99, 23);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(arg0);
		}

		if (arg0.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(arg0);
		}
		if (arg0.getSource() == btnTriangulo) {
			actionPerformedBtnTriangulo(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}

	}

	// METODOS IMPORTANTES:
	void cuadrado(int val) {
		txtS.setText("LA FIGURA ES UN CUADRADO: " + "\n");
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < val; j++) {
				txtS.append("*   ");
			}
			txtS.append("\n");
		}
	}

	void triangulo(int val) {
		txtS.setText("LA FIGURA ES UN TRIANGULO: " + "\n");
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < i + 1; j++) {
				txtS.append("*  ");
			}
			txtS.append("\n");
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		// Verificamos si el campo de texto no está vacío
		String entrada = txtEntrada.getText().trim();
		if (entrada.isEmpty()) { // recordar para verificar si la entrada es vacía
			txtS.setText("Por favor, ingrese un valor.");
			return; // Salimos del método si no hay entrada
		}

		try {
			// Intentamos convertir la entrada a un número entero
			int valor = Integer.parseInt(entrada);
			// Llamamos a la función cuadrado (asegúrate de que esté definida correctamente)
			cuadrado(valor);
		} catch (NumberFormatException e) {
			// Si ocurre un error, mostramos un mensaje claro de error
			txtS.setText("Error: Ingrese un valor entero válido.");
		}
	}

	protected void actionPerformedBtnTriangulo(ActionEvent arg0) {
		// Verificamos si el campo de texto no está vacío
		String entrada = txtEntrada.getText().trim();
		if (entrada.isEmpty()) {
			txtS.setText("Por favor, ingrese un valor.");
			return; // Salimos del método si no hay entrada
		}

		try {
			// Intentamos convertir la entrada a un número entero
			int valor = Integer.parseInt(entrada);
			// Llamamos a la función cuadrado (asegúrate de que esté definida correctamente)
			triangulo(valor);
		} catch (NumberFormatException e) {
			// Si ocurre un error, mostramos un mensaje claro de error
			txtS.setText("Error: Ingrese un valor entero válido.");
		}
	}

	protected void actionPerformedBtnNewButton_1(ActionEvent arg0) {
		txtS.setText("RANDOM: " + "\n");
		txtS.append("Minimo: "  + val1 + "\n");
		txtS.append("Máximo: "  + val2 + "\n");
	}

	protected void actionPerformedMntmNewMenuItem(ActionEvent arg0) {
		DialogNumeros dialogNumeros = new DialogNumeros();
		// Configurar propiedades si es necesario
		dialogNumeros.setLocationRelativeTo(null); // Centrarlo en la pantalla
		dialogNumeros.setResizable(false);// evitar el resize
		dialogNumeros.setTitle("Escoger valores");// title
		// Mostrar el JDialog (esto es lo que hace que se vea)
		dialogNumeros.setVisible(true);
	}
}
