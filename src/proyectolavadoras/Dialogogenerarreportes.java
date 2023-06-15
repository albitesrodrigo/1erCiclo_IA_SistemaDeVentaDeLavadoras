package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogogenerarreportes extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbltipodereporte;
	private JComboBox<String> cboTipodereporte;
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
					Dialogogenerarreportes dialog = new Dialogogenerarreportes();
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
	public Dialogogenerarreportes() {
		setModal(true);
		setTitle("Generar reportes");
		setBounds(100, 100, 600, 300);
		getContentPane().setLayout(null);
		
		lbltipodereporte = new JLabel("Tipo de reporte");
		lbltipodereporte.setBounds(10, 11, 85, 14);
		getContentPane().add(lbltipodereporte);
		
		cboTipodereporte = new JComboBox<String>();
		cboTipodereporte.addActionListener(this);
		cboTipodereporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima", "Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores"}));
		cboTipodereporte.setBounds(93, 7, 322, 22);
		getContentPane().add(cboTipodereporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(485, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 564, 204);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}
    
	double apd0,apd1,apd2,apd3,apd4;
	double vco0,vco1,vco2,vco3,vco4;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipodereporte) {
			actionPerformedCboTipodereporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
	}
	protected void actionPerformedCboTipodereporte(ActionEvent e) {
		int tip;
		tip = leerTipos();
		porcentajecd();
		mostrarDatos(tip);
		
	
	}
	int leerTipos() {
		return cboTipodereporte.getSelectedIndex();
		}
	void porcentajecd() {
		apd0=proyectogrupal.imptot0*100/proyectogrupal.cuotaDiaria;
		apd1=proyectogrupal.imptot1*100/proyectogrupal.cuotaDiaria;
		apd2=proyectogrupal.imptot2*100/proyectogrupal.cuotaDiaria;
		apd3=proyectogrupal.imptot3*100/proyectogrupal.cuotaDiaria;
		apd4=proyectogrupal.imptot4*100/proyectogrupal.cuotaDiaria;
	}
	void ventapormodelo(String mod,int cv,int cuv,double itv,double acd) {
		imprimir("MODELO : "+ mod);
		imprimir("Cantidad  de ventas :"+ cv);
		imprimir("Cantidad de unidades vendidas :"+ cuv);
		imprimir("Importe total vendido :"+ itv);
		imprimir("Aporte a la cuota diaria :"+ acd +"%"+"\n");
	}
	void imprimir(String m) {
		txtS.append( m +  "\n");
	}
	void mostrarDatos(int t) {
		switch(t) {
		case 0: 
			txtS.setText("");
			imprimir("VENTAS POR MODELO"+"\n");
			ventapormodelo(proyectogrupal.modelo0,proyectogrupal.canven0,proyectogrupal.canuni0,proyectogrupal.imptot0,apd0);
			ventapormodelo(proyectogrupal.modelo1,proyectogrupal.canven1,proyectogrupal.canuni1,proyectogrupal.imptot1,apd1);
			ventapormodelo(proyectogrupal.modelo2,proyectogrupal.canven2,proyectogrupal.canuni2,proyectogrupal.imptot2,apd2);
			ventapormodelo(proyectogrupal.modelo3,proyectogrupal.canven3,proyectogrupal.canuni3,proyectogrupal.imptot3,apd3);
			ventapormodelo(proyectogrupal.modelo4,proyectogrupal.canven4,proyectogrupal.canuni4,proyectogrupal.imptot4,apd4);break;
		case 1:
			txtS.setText("");
			imprimir("VENTAS EN RELACION A LA CANTIDAD OPTIMA DE UNIDADES VENDIDAS"+"\n");
			imprimir("Modelo:"+proyectogrupal.modelo0);
			imprimir("Cantidad de unidades vendidas:"+proyectogrupal.canuni0);
			
		}
		
	}
	

	
	void ventapormodelo(String mod,int cuv) {
		imprimir("MODELO : "+ mod);
		imprimir("Cantidad de unidades vendidas :"+ cuv);
	}

	
	
}
