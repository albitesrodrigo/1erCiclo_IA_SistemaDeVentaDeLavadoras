package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogolistarlavadoras extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dialogolistarlavadoras dialog = new Dialogolistarlavadoras();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Dialogolistarlavadoras() {
		setModal(true);
		setTitle("Listado de lavadoras");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(118, 225, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(217, 225, 89, 23);
		getContentPane().add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 206);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
	txtS.setText("LISTADO DE LAVADORA" + "\n\n");
	imprimir(proyectogrupal.modelo0,proyectogrupal.precio0,proyectogrupal.fondo0,proyectogrupal.ancho0,proyectogrupal.alto0,proyectogrupal.capacidad0);
	imprimir(proyectogrupal.modelo1,proyectogrupal.precio1,proyectogrupal.fondo1,proyectogrupal.ancho1,proyectogrupal.alto1,proyectogrupal.capacidad1);
	imprimir(proyectogrupal.modelo2,proyectogrupal.precio2,proyectogrupal.fondo2,proyectogrupal.ancho2,proyectogrupal.alto2,proyectogrupal.capacidad2);
	imprimir(proyectogrupal.modelo3,proyectogrupal.precio3,proyectogrupal.fondo3,proyectogrupal.ancho3,proyectogrupal.alto3,proyectogrupal.capacidad3);
	imprimir(proyectogrupal.modelo4,proyectogrupal.precio4,proyectogrupal.fondo4,proyectogrupal.ancho4,proyectogrupal.alto4,proyectogrupal.capacidad4);

	}
	
	void imprimir(String mod,double pre,double fon,double anc,double alt, double cap) {
	txtS.append("Modelo    : " + mod + "\n");
	txtS.append("Precio    : S/ "+ pre + "\n");
	txtS.append("Fondo     : " + fon + " cm" + "\n");
	txtS.append("Ancho     : " + anc + " cm" + "\n");
	txtS.append("Alto      : " + alt + " cm" + "\n");
	txtS.append("Capacidad : " + cap + " kg" + "\n\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
