package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConsultarlavadora extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblancho;
	private JLabel lblalto;
	private JLabel lblfondo;
	private JLabel lblcapacidad;
	private JComboBox<String> cbomodelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtCapacidad;
	private JButton btnCerrar;

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
					DialogoConsultarlavadora dialog = new DialogoConsultarlavadora();
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
	public DialogoConsultarlavadora() {
		setModal(true);
		setTitle("Consultar lavadora");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 50, 14);
		getContentPane().add(lblPrecio);
		
		lblancho = new JLabel("Ancho (cm)");
		lblancho.setBounds(10, 65, 54, 14);
		getContentPane().add(lblancho);
		
		lblalto = new JLabel("Alto (cm)");
		lblalto.setBounds(10, 90, 46, 14);
		getContentPane().add(lblalto);
		
		lblfondo = new JLabel("Fondo (cm)");
		lblfondo.setBounds(10, 115, 54, 14);
		getContentPane().add(lblfondo);
		
		lblcapacidad = new JLabel("Capacidad (kg)");
		lblcapacidad.setBounds(10, 140, 72, 14);
		getContentPane().add(lblcapacidad);
		
		cbomodelo = new JComboBox<String>();
		cbomodelo.addActionListener(this);
		cbomodelo.setModel(new DefaultComboBoxModel<String>(new String[] {"WHIRLPOOL WWI16BSBLA", "SAMSUNG WA17T6260BW", "MABE LMA72200WDBB1", "WINIA WLA-195ECG", "LG TS1604NW"}));
		cbomodelo.setBounds(102, 7, 162, 22);
		getContentPane().add(cbomodelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(102, 33, 162, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(102, 62, 162, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(102, 87, 162, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(102, 112, 162, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setEditable(false);
		txtCapacidad.setBounds(102, 137, 162, 20);
		getContentPane().add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		mostrardatos(proyectogrupal.precio0,proyectogrupal.ancho0,proyectogrupal.alto0,proyectogrupal.fondo0,proyectogrupal.capacidad0);

		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cbomodelo) {
			actionPerformedCbomodelo(e);
		}
	}
	protected void actionPerformedCbomodelo(ActionEvent e) {
	int cod;
	cod = leerCodigo();
	switch (cod) {
	case 0 :
		mostrardatos(proyectogrupal.precio0,proyectogrupal.ancho0,proyectogrupal.alto0,proyectogrupal.fondo0,proyectogrupal.capacidad0);
		break;
	case 1 :
		mostrardatos(proyectogrupal.precio1,proyectogrupal.ancho1,proyectogrupal.alto1,proyectogrupal.fondo1,proyectogrupal.capacidad1);
		break;
	case 2 :
		mostrardatos(proyectogrupal.precio2,proyectogrupal.ancho2,proyectogrupal.ancho2,proyectogrupal.fondo2,proyectogrupal.capacidad2);
		break;
	case 3 :
		mostrardatos(proyectogrupal.precio3,proyectogrupal.ancho3,proyectogrupal.alto3,proyectogrupal.fondo3,proyectogrupal.capacidad3);
		break;
	default :
		mostrardatos(proyectogrupal.precio4,proyectogrupal.ancho4,proyectogrupal.alto4,proyectogrupal.fondo4,proyectogrupal.capacidad4);

	}
	
		
	}
	void mostrardatos(double pre,double anc,double alt,double fon,double cap) {
	txtPrecio.setText(""+pre);
	txtAncho.setText(""+ anc);
	txtAlto.setText(""+alt);
	txtFondo.setText(""+ fon);
	txtCapacidad.setText(""+cap);
	}
	
	int leerCodigo() {
		return cbomodelo.getSelectedIndex();
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
