package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogoventas extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
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
					Dialogoventas dialog = new Dialogoventas();
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
	public Dialogoventas() {
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 50, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 46, 14);
		getContentPane().add(lblCantidad);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"WHIRLPOOL WWI16BSBLA", "SAMSUNG WA17T6260BW", "MABE LMA72200WDBB1", "WINIA WLA-195ECG", "LG TS1604NW"}));
		cboModelo.setBounds(69, 7, 170, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(70, 33, 169, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(70, 58, 169, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(335, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 414, 163);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		txtPrecio.setText(""+ proyectogrupal.precio0);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
	int cod;
	cod = leerMarca();
	switch(cod) {
	case 0 :
		txtPrecio.setText(proyectogrupal.precio0+"");break;
	case 1 :
		txtPrecio.setText(proyectogrupal.precio1+"");break;
	case 2 :
		txtPrecio.setText(proyectogrupal.precio2+"");break;
	case 3 :
		txtPrecio.setText(proyectogrupal.precio3+"");break;
	default :
		txtPrecio.setText(proyectogrupal.precio4+"");
		
	}
	}
	int leerMarca() {
	return cboModelo.getSelectedIndex();
	}
	
	
//ACCION AL BOTON VENDER
	protected void actionPerformedBtnVender(ActionEvent e) {
	int mar,can;
	double icom,ides,ipag,pre;
	String mod,obs;
	
	can = leerCantidad();
	pre = leerPrecio();
	mar = leerMarca();
	icom = importeCompra(can,pre);
	ides = importeDescuento(can,icom);
	ipag = importePagar(icom,ides);
	obs = Obsequio(can);
	mod = nombreModelo(mar);
	calcularAumentos(mar, can, ipag);
	imprimirDatos(mod,pre,can,icom,ides,ipag,obs);
	}
	
	void calcularAumentos(int mar,int can,double ip) {
		switch (mar) {
		case 0 : proyectogrupal.canven0 ++;proyectogrupal.canuni0 += can;proyectogrupal.imptot0 += ip; break;
		case 1 : proyectogrupal.canven1 ++;proyectogrupal.canuni1 += can;proyectogrupal.imptot1 += ip; break;
		case 2 : proyectogrupal.canven2 ++;proyectogrupal.canuni2 += can;proyectogrupal.imptot2 += ip; break;
		case 3 : proyectogrupal.canven3 ++;proyectogrupal.canuni3 += can;proyectogrupal.imptot3 += ip; break;
		default : proyectogrupal.canven4 ++;proyectogrupal.canuni4 += can;proyectogrupal.imptot4 += ip; 
		}
	}
	
	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}
	double importeCompra(int c,double p) {
		return c * p ;
	}
	double importeDescuento(int ca,double ic) {
		switch (ca) {
		case 1 : case 2 : case 3 : case 4 : case 5 : return ic * proyectogrupal.porcentaje1 /100;
		case 6: case 7: case 8: case 9: case 10: return ic * proyectogrupal.porcentaje2/100;
		case 11: case 12: case 13: case 14: case 15 : return ic* proyectogrupal.porcentaje3/100;
		default : return ic * proyectogrupal.porcentaje4/100;
		}
	}
	
	double importePagar(double ic,double id) {
		return ic - id;
	}
	String Obsequio(int ca) {
		switch (ca) {
		case 1 : return proyectogrupal.obsequio1;
		case 2 : case 3: case 4 : case 5: return proyectogrupal.obsequio2;
		default : return proyectogrupal.obsequio3;
		}
	}
	String nombreModelo(int ma) {
		switch (ma) {
		case 0 : return proyectogrupal.modelo0;
		case 1 : return proyectogrupal.modelo1;
		case 2 : return proyectogrupal.modelo2;
		case 3 : return proyectogrupal.modelo3;
		default : return proyectogrupal.modelo4;
		}
	}
	
	void imprimirDatos(String mod,double pre,int can,double ic,double id,double ipag,String ob) {
	
    txtS.setText("BOLETA DE VENTA" + "\n\n");
	txtS.append("Modelo               : " + mod + "\n");
	txtS.append("Precio               : " + pre + "\n");
	txtS.append("Cantidad             : " + can + "\n");
	txtS.append("Importe de Compra    : " + ic + "\n");
	txtS.append("Importe de descuento : " + id + "\n");
	txtS.append("Importe a pagar      : " + ipag + "\n");
	txtS.append("Obsequio             : " + ob + "\n");
	}
}
