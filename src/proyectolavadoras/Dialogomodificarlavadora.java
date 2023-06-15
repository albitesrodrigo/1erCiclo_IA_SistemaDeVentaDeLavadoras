package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogomodificarlavadora extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblmodelo;
	private JLabel lblprecio;
	private JLabel lblancho;
	private JLabel lblalto;
	private JLabel lblfondo;
	private JLabel lblcapacidad;
	private JComboBox<String> cbomodelo;
	private JTextField txtPrecio;
	private JTextField txtFondo;
	private JTextField txtCapacidad;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JButton btnCerrar;
	private JButton btnGrabar;

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
					Dialogomodificarlavadora dialog = new Dialogomodificarlavadora();
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
	public Dialogomodificarlavadora() {
		setModal(true);
		setTitle("Modificar lavadora");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblmodelo);
		
		lblprecio = new JLabel("Precio (S/)");
		lblprecio.setBounds(10, 36, 50, 14);
		getContentPane().add(lblprecio);
		
		lblancho = new JLabel("Ancho (cm)");
		lblancho.setBounds(10, 61, 54, 14);
		getContentPane().add(lblancho);
		
		lblalto = new JLabel("Alto (cm)");
		lblalto.setBounds(10, 86, 46, 14);
		getContentPane().add(lblalto);
		
		lblfondo = new JLabel("Fondo (cm)");
		lblfondo.setBounds(10, 111, 54, 14);
		getContentPane().add(lblfondo);
		
		lblcapacidad = new JLabel("Capacidad (kg)");
		lblcapacidad.setBounds(10, 136, 72, 14);
		getContentPane().add(lblcapacidad);
		
		cbomodelo = new JComboBox<String>();
		cbomodelo.addActionListener(this);
		cbomodelo.setModel(new DefaultComboBoxModel(new String[] {"WHIRLPOOL WWI16BSBLA", "SAMSUNG WA17T6260BW", "MABE LMA72200WDBB1", "WINIA WLA-195ECG", "LG TS1604NW"}));
		cbomodelo.setBounds(101, 7, 174, 22);
		getContentPane().add(cbomodelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(101, 33, 174, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setBounds(101, 108, 174, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(101, 133, 174, 20);
		getContentPane().add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(101, 57, 174, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setBounds(101, 83, 174, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 36, 89, 23);
		getContentPane().add(btnGrabar);
		
		mostrardatos(proyectogrupal.precio0,proyectogrupal.ancho0,proyectogrupal.alto0,proyectogrupal.fondo0,proyectogrupal.capacidad0);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
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
		
	
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		double pre,anc,alt,fon,cap;
		int cod;
		cod = leerCodigo();
		pre = leerPrecio();
		anc = leerAncho();
		alt = leerAlto();
		fon = leerFondo();
		cap = leerCapacidad();
		
	if (cod == 0) {
		proyectogrupal.precio0 = pre;proyectogrupal.ancho0 = anc;proyectogrupal.alto0 = alt;proyectogrupal.fondo0 = fon;proyectogrupal.capacidad0 = cap;
		JOptionPane.showMessageDialog(this,"Cambios Exitosos");
		dispose();
	}
	else if (cod ==1) {
		proyectogrupal.precio1 = pre;proyectogrupal.ancho1 = anc;proyectogrupal.alto1 = alt;proyectogrupal.fondo1 = fon;proyectogrupal.capacidad1 = cap;
		JOptionPane.showMessageDialog(this,"Cambios Exitosos");
		dispose();
	}
	else if (cod == 2) {
		proyectogrupal.precio2 = pre;proyectogrupal.ancho2 = anc;proyectogrupal.alto2 = alt;proyectogrupal.fondo2 = fon;proyectogrupal.capacidad2 = cap;
		JOptionPane.showMessageDialog(this,"Cambios Exitosos");
		dispose();	
	}
	else if (cod ==3) {
		proyectogrupal.precio3 = pre;proyectogrupal.ancho3 = anc;proyectogrupal.alto3 = alt;proyectogrupal.fondo3 = fon;proyectogrupal.capacidad3 = cap;
		JOptionPane.showMessageDialog(this,"Cambios Exitosos");
		dispose();
	}
	else {
		proyectogrupal.precio4 = pre;proyectogrupal.ancho4 = anc;proyectogrupal.alto4 = alt;proyectogrupal.fondo4 = fon;proyectogrupal.capacidad4 = cap;
		JOptionPane.showMessageDialog(this,"Cambios Exitosos");
		dispose();
	}
	
	}

	
	
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}
	double leerAncho() {
		return Double.parseDouble(txtAncho.getText());
	}
	double leerAlto() {
		return Double.parseDouble(txtAlto.getText());
	}
	double leerFondo() {
		return Double.parseDouble(txtFondo.getText());
	}
	double leerCapacidad() {
		return Double.parseDouble(txtCapacidad.getText());
	}
	
	void mensajeError(String m) {
		JOptionPane.showMessageDialog(this, m);
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
