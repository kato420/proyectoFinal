package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import panels.CrearRegistro;
import panels.ModificarRegistro;
import panels.Opciones;

public class FrameGeneral extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnRegistro;
	private JMenuItem mntmCrearRegistro;
	private JMenuItem mntmModificarRegistro;
	private JMenu mnVer;
	private JMenuItem mntmVerRegistros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGeneral frame = new FrameGeneral();
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
	public FrameGeneral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 437);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnRegistro = new JMenu("Alumnos");
		mnRegistro.setIcon(new ImageIcon(FrameGeneral.class.getResource("/icons/agregar-usuario.png")));
		menuBar.add(mnRegistro);

		mntmCrearRegistro = new JMenuItem("Crear Registro");
		mntmCrearRegistro.addActionListener(this);
		mnRegistro.add(mntmCrearRegistro);

		mntmModificarRegistro = new JMenuItem("Modificar Registro");
		mntmModificarRegistro.addActionListener(this);
		mnRegistro.add(mntmModificarRegistro);

		mnVer = new JMenu("Ver");
		mnVer.setIcon(new ImageIcon(FrameGeneral.class.getResource("/icons/prismaticos.png")));
		menuBar.add(mnVer);

		mntmVerRegistros = new JMenuItem("Opciones");
		mntmVerRegistros.addActionListener(this);
		mnVer.add(mntmVerRegistros);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmModificarRegistro) {
			actionPerformedMntmModificarRegistro(e);
		}
		if (e.getSource() == mntmVerRegistros) {
			actionPerformedMntmVerRegistros(e);
		}
		if (e.getSource() == mntmCrearRegistro) {
			actionPerformedMntmCrearRegistro(e);
		}
	}

	protected void actionPerformedMntmCrearRegistro(ActionEvent e) {
		setTitle("Crear Registro");
		CrearRegistro registro = new CrearRegistro();
		contentPane.removeAll();
		contentPane.add(registro);
		contentPane.revalidate();
		contentPane.repaint();
	}

	protected void actionPerformedMntmVerRegistros(ActionEvent e) {
		setTitle("Opciones");
		Opciones visualizar = new Opciones();
		contentPane.removeAll();
		contentPane.add(visualizar);
		contentPane.revalidate();
		contentPane.repaint();
	}

	protected void actionPerformedMntmModificarRegistro(ActionEvent e) {
		setTitle("Modificar Registro");
		ModificarRegistro modificar = new ModificarRegistro();
		contentPane.removeAll();
		contentPane.add(modificar);
		contentPane.revalidate();
		contentPane.repaint();
	}
}
