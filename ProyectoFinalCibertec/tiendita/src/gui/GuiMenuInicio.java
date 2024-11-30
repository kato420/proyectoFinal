package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Toolkit;


public class GuiMenuInicio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnSalir;
	private JMenu mnConsultar;
	private JMenu mnNewMenu;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmListarCocina;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercaDeLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMenuInicio frame = new GuiMenuInicio();
					frame.setVisible(true);
					frame.setResizable(false); // Esto bloquea el tamaño de la ventana
					frame.setTitle("Tienda Camaro");
					frame.setLocationRelativeTo(null);
					//nooo
					//frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiMenuInicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GuiMenuInicio.class.getResource("/imagenes/horno.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 597);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSalir = new JMenu("Archivo");
		mnSalir.setFont(new Font("Dialog", Font.BOLD, 12));
		menuBar.add(mnSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/exit-alt.png")));
		mntmSalir.setFont(new Font("Dialog", Font.BOLD, 14));
		mnSalir.add(mntmSalir);
		
		mnConsultar = new JMenu("Mantenimiento");
		menuBar.add(mnConsultar);
		
		mntmConsultarCocina = new JMenuItem("Consultar cocina");
		mntmConsultarCocina.addActionListener(this);
		mntmConsultarCocina.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmConsultarCocina.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/search.png")));
		mnConsultar.add(mntmConsultarCocina);
		
		mntmModificarCocina = new JMenuItem("Modificar cocina");
		mntmModificarCocina.addActionListener(this);
		mntmModificarCocina.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/edit.png")));
		mntmModificarCocina.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConsultar.add(mntmModificarCocina);
		
		mntmListarCocina = new JMenuItem("Listar cocina");
		mntmListarCocina.addActionListener(this);
		mntmListarCocina.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/list-check.png")));
		mntmListarCocina.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConsultar.add(mntmListarCocina);
		
		mnNewMenu = new JMenu("Ventas");
		menuBar.add(mnNewMenu);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/shopping-bag-add.png")));
		mntmVender.setFont(new Font("Dialog", Font.BOLD, 14));
		mnNewMenu.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mntmGenerarReportes.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/search.png")));
		mntmGenerarReportes.setFont(new Font("Dialog", Font.BOLD, 14));
		mnNewMenu.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuración");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mntmConfigurarDescuentos.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/tags.png")));
		mntmConfigurarDescuentos.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mntmConfigurarObsequios.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/gift.png")));
		mntmConfigurarObsequios.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad óptima");
		mntmConfigurarCantidadptima.addActionListener(this);
		mntmConfigurarCantidadptima.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/marketplace.png")));
		mntmConfigurarCantidadptima.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConfiguracion.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mntmConfigurarCuotaDiaria.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/money-wings.png")));
		mntmConfigurarCuotaDiaria.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeLa = new JMenuItem("Acerca de la tienda");
		mntmAcercaDeLa.addActionListener(this);
		mntmAcercaDeLa.setIcon(new ImageIcon(GuiMenuInicio.class.getResource("/imagenes/team-check.png")));
		mntmAcercaDeLa.setFont(new Font("Dialog", Font.BOLD, 14));
		mnAyuda.add(mntmAcercaDeLa);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaDeLa) {
			actionPerformedMntmAcercaDeLa(e);
		}
		if (e.getSource() == mntmConfigurarCuotaDiaria) {
			actionPerformedMntmConfigurarCuotaDiaria(e);
		}
		if (e.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarCocina) {
			actionPerformedMntmListarCocina(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmModificarCocina(e);
		}
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	
	protected void actionPerformedMntmSalir(ActionEvent e) {
	}
	
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		setTitle("Acerca de la Tienda");
		PanelConsultar panelConsultar = new PanelConsultar();
		contentPane.removeAll();
		contentPane.add(panelConsultar);
		contentPane.revalidate();
		contentPane.repaint();
	}
	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
		setTitle("Acerca de la Tienda");
		PanelModificar panelModificar = new PanelModificar();
		contentPane.removeAll();
		contentPane.add(panelModificar);
		contentPane.revalidate();
		contentPane.repaint();
	}
	protected void actionPerformedMntmListarCocina(ActionEvent e) {
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		   // Crear una instancia del JDialog
	    DialogDescuentos dialogDescuentos = new DialogDescuentos();
	    // Configurar propiedades si es necesario
	    dialogDescuentos.setLocationRelativeTo(null); // Centrarlo en la pantalla
	    dialogDescuentos.setResizable(false);//evitar el resize
	    dialogDescuentos.setTitle("Configurar porcentajes de descuento");//title
	    // Mostrar el JDialog (esto es lo que hace que se vea)
	    dialogDescuentos.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		   // Crear una instancia del JDialog
	    DialogRegalos dialogRegalos = new DialogRegalos();
	    // Configurar propiedades si es necesario
	    dialogRegalos.setLocationRelativeTo(null); // Centrarlo en la pantalla
	    dialogRegalos.setResizable(false);//evitar el resize
	    dialogRegalos.setTitle("Configurar obsequios");//title
	    // Mostrar el JDialog (esto es lo que hace que se vea)
	    dialogRegalos.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent e) {
		   // Crear una instancia del JDialog
	    DialogCantidad dialogCantidad = new DialogCantidad();
	    // Configurar propiedades si es necesario
	    dialogCantidad.setLocationRelativeTo(null); // Centrarlo en la pantalla
	    dialogCantidad.setResizable(false);//evitar el resize
	    dialogCantidad.setTitle("Configurar obsequios");//title
	    // Mostrar el JDialog (esto es lo que hace que se vea)
	    dialogCantidad.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCuotaDiaria(ActionEvent e) {
		   // Crear una instancia del JDialog
	    DialogCuota dialogCuota = new DialogCuota();
	    // Configurar propiedades si es necesario
	    dialogCuota.setLocationRelativeTo(null); // Centrarlo en la pantalla
	    dialogCuota.setResizable(false);//evitar el resize
	    dialogCuota.setTitle("Configurar obsequios");//title
	    // Mostrar el JDialog (esto es lo que hace que se vea)
	    dialogCuota.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeLa(ActionEvent e) {
		//setTitle("Acerca de la Tienda");
		//PanelAcerca panelAcerca = new PanelAcerca();
		//contentPane.removeAll();
		//contentPane.add(panelAcerca);
		//contentPane.revalidate();
		//contentPane.repaint();
	}
}
