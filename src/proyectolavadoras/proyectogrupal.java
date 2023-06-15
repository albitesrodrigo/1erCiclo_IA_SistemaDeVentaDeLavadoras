package proyectolavadoras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class proyectogrupal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguración;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarlavadora;
	private JMenuItem mntmModificarlavadora;
	private JMenuItem mntmListarlavadoras;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarreportes;
	private JMenuItem mntmConfigurardescuentos;
	private JMenuItem mntmConfigurarobsequios;
	private JMenuItem mntmConfigurarcantidadóptima;
	private JMenuItem mntmConfigurarcuotadiaria;
	private JMenuItem mntmAcercadetienda;

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
					proyectogrupal frame = new proyectogrupal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public proyectogrupal() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 416);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarlavadora = new JMenuItem("Consultar lavadora");
		mntmConsultarlavadora.addActionListener(this);
		mnMantenimiento.add(mntmConsultarlavadora);
		
		mntmModificarlavadora = new JMenuItem("Modificar lavadora");
		mntmModificarlavadora.addActionListener(this);
		mnMantenimiento.add(mntmModificarlavadora);
		
		mntmListarlavadoras = new JMenuItem("Listar lavadoras");
		mntmListarlavadoras.addActionListener(this);
		mnMantenimiento.add(mntmListarlavadoras);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarreportes = new JMenuItem("Generar reportes");
		mntmGenerarreportes.addActionListener(this);
		mnVentas.add(mntmGenerarreportes);
		
		mnConfiguración = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguración);
		
		mntmConfigurardescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurardescuentos.addActionListener(this);
		mnConfiguración.add(mntmConfigurardescuentos);
		
		mntmConfigurarobsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarobsequios.addActionListener(this);
		mnConfiguración.add(mntmConfigurarobsequios);
		
		mntmConfigurarcantidadóptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigurarcantidadóptima.addActionListener(this);
		mnConfiguración.add(mntmConfigurarcantidadóptima);
		
		mntmConfigurarcuotadiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarcuotadiaria.addActionListener(this);
		mnConfiguración.add(mntmConfigurarcuotadiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercadetienda = new JMenuItem("Acerca de Tienda");
		mntmAcercadetienda.addActionListener(this);
		mnAyuda.add(mntmAcercadetienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercadetienda) {
			actionPerformedMntmAcercadetienda(e);
		}
		if (e.getSource() == mntmConfigurarcuotadiaria) {
			actionPerformedMntmConfigurarcuotadiaria(e);
		}
		if (e.getSource() == mntmConfigurarcantidadóptima) {
			actionPerformedMntmConfigurarcantidadóptima(e);
		}
		if (e.getSource() == mntmConfigurarobsequios) {
			actionPerformedMntmConfigurarobsequios(e);
		}
		if (e.getSource() == mntmConfigurardescuentos) {
			actionPerformedMntmConfigurardescuentos(e);
		}
		if (e.getSource() == mntmGenerarreportes) {
			actionPerformedMntmGenerarreportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarlavadoras) {
			actionPerformedMntmListarlavadoras(e);
		}
		if (e.getSource() == mntmModificarlavadora) {
			actionPerformedMntmModificarlavadora(e);
		}
		if (e.getSource() == mntmConsultarlavadora) {
			actionPerformedMntmConsultarlavadora(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	//DECLARAR VARIABLES GLOBALES
	//DATOS DE LA PRIMERA LAVADORA
	public static String modelo0="WHIRLPOOL WWI16BSBLA";
	public static double precio0= 999.0;
	public static double fondo0= 67.0;
	public static double ancho0= 64.0;
	public static double alto0= 105.0;
	public static double capacidad0= 16;
	
	//DATOS DE LA SEGUNDA LAVADORA
	public static String modelo1="SAMSUNG WA17T6260BW";
	public static double precio1= 1199.0;
	public static double ancho1= 63.0;
	public static double alto1= 108.0;
	public static double fondo1= 69.0;
	public static double capacidad1= 17;
	
	//DATOS DE LA TERCERA LAVADORA
	public static String modelo2="MABE LMA72200WDBB1";
	public static double precio2= 1599.0;
	public static double ancho2= 68.0;
	public static double alto2= 109.0;
	public static double fondo2= 68.0;
	public static double capacidad2= 22;
	
	//DATOS DE LA CUARTA LAVADORA
	public static String modelo3="WINIA WLA-195ECG";
	public static double precio3= 899.0;
	public static double ancho3= 52.5;
	public static double alto3= 85.5;
	public static double fondo3= 53.5;
	public static double capacidad3= 6.5;
	
	//DATOS DE LA QUINTA LAVADORA
	public static String modelo4="LG TS1604NW";
	public static double precio4= 1099.0;
	public static double ancho4= 63.2;
	public static double alto4= 102.0;
	public static double fondo4= 67;
	public static double capacidad4= 17;
	
	//PORCENTAJE DE DESCUENTO
	public static double porcentaje1= 7.5;
	public static double porcentaje2= 10.0;
	public static double porcentaje3= 12.5;
	public static double porcentaje4= 15.0;
	
	//OBSEQUIoS
	public static String obsequio1="Cafetera";
	public static String obsequio2="Licuadora";
	public static String obsequio3="Extractor";
	
	//CANTIDAD OPTIMA DE UNIDADES VENDIDAS
	public static int cantidadOptima= 10;
	
	//CUOTA DIARIA
	public static double cuotaDiaria= 30000;
	
	//CONTADORES CANTIDAD DE VENTAS
	public static int canven0,canven1,canven2,canven3,canven4,canvengene;
	//CONTADORES CANTIDAD DE VENTAS POR UNIDADES
	public static int canuni0,canuni1,canuni2,canuni3,canuni4;
	//ACUMULADORES DEL IMPORTE TOTAL DE CADA LAVADORA
	public static double imptot0,imptot1,imptot2,imptot3,imptot4;
	
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsultarlavadora(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		DialogoConsultarlavadora d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new DialogoConsultarlavadora();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmModificarlavadora(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogomodificarlavadora d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogomodificarlavadora();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmListarlavadoras(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogolistarlavadoras d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogolistarlavadoras();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoventas d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoventas();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmGenerarreportes(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogogenerarreportes d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogogenerarreportes();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmConfigurardescuentos(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoconfigurardescuento d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoconfigurardescuento();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarobsequios(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoconfigurarobsequios d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoconfigurarobsequios();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarcantidadóptima(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoconfigurarcantidad d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoconfigurarcantidad();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarcuotadiaria(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoconfigurarcuotadiaria d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoconfigurarcuotadiaria();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
	protected void actionPerformedMntmAcercadetienda(ActionEvent e) {
		//Declarar una variable referencia para controlar el objeto dialogoconsultar
		Dialogoacercadetienda d;
		//Crear objeto Dialogoconsultar y asignar el control a la variable referencia
		d = new Dialogoacercadetienda();
		//Centrar la caja de dialogo
		d.setLocationRelativeTo(this);
		//Hacer Visible el objeto
		d.setVisible(true);
	}
}
