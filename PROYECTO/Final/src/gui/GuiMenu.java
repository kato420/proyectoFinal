package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.PanelLogin;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;

public class GuiMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JMenuBar menuBar;
	private JMenu mnInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMenu frame = new GuiMenu();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 658);
		
		menuBar = new JMenuBar();
		menuBar.setForeground(UIManager.getColor("Label.disabledForeground"));
		menuBar.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		setJMenuBar(menuBar);
		
		mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("INGRESAR USUARIO");
		PanelLogin login = new PanelLogin();
		login.setBounds(12, 0, 953, 595);
		contentPane.add(login);
		
		panel = new JPanel();
		panel.setBounds(12, 0, 953, 595);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		panel.removeAll();
		panel.revalidate();
		panel.repaint();
	}
}
