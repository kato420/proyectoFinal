package panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.Matricula;
import gui.Pagos;
import gui.Reportes;

public class Opciones extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnMatricula;
	private JButton btnPagos;
	private JButton btnReportes;

	/**
	 * Create the panel.
	 */
	public Opciones() {
		setLayout(null);

		btnMatricula = new JButton("MATRÍCULA");
		btnMatricula.addActionListener(this);
		btnMatricula.setIcon(new ImageIcon(Opciones.class.getResource("/icons/cartera.png")));
		btnMatricula.setBounds(72, 127, 130, 95);
		add(btnMatricula);

		btnPagos = new JButton("PAGOS");
		btnPagos.addActionListener(this);
		btnPagos.setIcon(new ImageIcon(Opciones.class.getResource("/icons/tarjeta-de-credito.png")));
		btnPagos.setBounds(260, 127, 130, 95);
		add(btnPagos);

		btnReportes = new JButton("REPORTES");
		btnReportes.addActionListener(this);
		btnReportes.setIcon(new ImageIcon(Opciones.class.getResource("/icons/grafico-circular.png")));
		btnReportes.setBounds(450, 127, 130, 95);
		add(btnReportes);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReportes) {
			actionPerformedBtnReportes(e);
		}
		if (e.getSource() == btnPagos) {
			actionPerformedBtnPagos(e);
		}
		if (e.getSource() == btnMatricula) {
			actionPerformedBtnMatricula(e);
		}
	}

	protected void actionPerformedBtnMatricula(ActionEvent e) {
		Matricula matri = new Matricula();
		matri.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		matri.setVisible(true);
		matri.setLocationRelativeTo(this);
		matri.setResizable(false);
	}

	protected void actionPerformedBtnPagos(ActionEvent e) {
		Pagos pago = new Pagos();
		pago.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pago.setVisible(true);
		pago.setLocationRelativeTo(this);
		pago.setResizable(false);
	}

	protected void actionPerformedBtnReportes(ActionEvent e) {
		Reportes reporte = new Reportes();
		reporte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		reporte.setVisible(true);
		reporte.setLocationRelativeTo(this);
		reporte.setResizable(false);
		;
	}
}
