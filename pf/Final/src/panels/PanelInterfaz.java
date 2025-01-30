package panels;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PanelInterfaz extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnNuevo;
	private JMenu mnInicio;
	// modificar para que se pueda acceder
	public static JPanel panel;
	private JMenuItem mntmRegistrarAlumnos;
	private JMenuItem mntmModificarRegistros;
	private JMenuItem mntmMatrculas;
	private JMenuItem mntmRetiros;
	private JMenu mnMantenimiento;

	/**
	 * Create the panel.
	 */
	public PanelInterfaz() {
		setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 726, 23);
		add(menuBar);

		mnNuevo = new JMenu("Registros");
		mnNuevo.setIcon(new ImageIcon(PanelInterfaz.class.getResource("/icons/registro.png")));
		menuBar.add(mnNuevo);

		mntmRegistrarAlumnos = new JMenuItem("Matricular Alumno");
		mntmRegistrarAlumnos.addActionListener(this);
		mnNuevo.add(mntmRegistrarAlumnos);

		mntmModificarRegistros = new JMenuItem("Retirar Alumno");
		mnNuevo.add(mntmModificarRegistros);

		mnInicio = new JMenu("Consultas");
		mnInicio.setIcon(new ImageIcon(PanelInterfaz.class.getResource("/icons/documento.png")));
		menuBar.add(mnInicio);

		mntmMatrculas = new JMenuItem("Matrículas");
		mnInicio.add(mntmMatrculas);

		mntmRetiros = new JMenuItem("Retiros");
		mnInicio.add(mntmRetiros);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(PanelInterfaz.class.getResource("/icons/mantenimiento.png")));
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("GRADO");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GuiGrado defecto = new GuiGrado();
				panel.removeAll();
				panel.add(defecto);
				panel.revalidate();
				panel.repaint();
			}
		});
		mnMantenimiento.add(mntmNewMenuItem);

		panel = new JPanel();
		panel.setBounds(10, 35, 704, 372);
		add(panel);
		panel.setLayout(new CardLayout(0, 0));

		// CREANDO EL PANEL CENTRAL POR DEFECTO
		PanelDefecto defecto = new PanelDefecto();
		panel.removeAll();
		panel.add(defecto);
		panel.revalidate();
		panel.repaint();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmRegistrarAlumnos) {
			actionPerformedMntmRegistrarAlumnos(arg0);
		}
	}

	protected void actionPerformedMntmRegistrarAlumnos(ActionEvent arg0) {
		PanelRegistrar registrar = new PanelRegistrar();
		panel.removeAll();
		panel.add(registrar);
		panel.revalidate();
		panel.repaint();
	}
}
