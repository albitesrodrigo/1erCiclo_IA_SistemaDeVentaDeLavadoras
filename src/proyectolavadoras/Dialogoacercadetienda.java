package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JButton;

public class Dialogoacercadetienda extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTienda;
	private JLabel lblautores;
	private JSeparator separator;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
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
					Dialogoacercadetienda dialog = new Dialogoacercadetienda();
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
	public Dialogoacercadetienda() {
		setModal(true);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 363);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTienda.setBounds(152, 11, 124, 37);
		getContentPane().add(lblTienda);
		
		lblautores = new JLabel("Autores");
		lblautores.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblautores.setBounds(177, 72, 64, 28);
		getContentPane().add(lblautores);
		
		separator = new JSeparator();
		separator.setBounds(10, 59, 414, 2);
		getContentPane().add(separator);
		
		lbl1 = new JLabel("Franklin Tarco");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl1.setBounds(74, 111, 82, 28);
		getContentPane().add(lbl1);
		
		lbl2 = new JLabel("Tadashi Muramato");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl2.setBounds(59, 150, 118, 14);
		getContentPane().add(lbl2);
		
		lbl3 = new JLabel("Axel Padilla");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl3.setBounds(79, 184, 97, 14);
		getContentPane().add(lbl3);
		
		lbl4 = new JLabel("Graciela Guambuguete");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl4.setBounds(59, 218, 145, 14);
		getContentPane().add(lbl4);
		
		lbl5 = new JLabel("Jeh\u00FA Avalo");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl5.setBounds(279, 118, 75, 14);
		getContentPane().add(lbl5);
		
		lbl6 = new JLabel("Brayan Bautista");
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl6.setBounds(269, 151, 106, 14);
		getContentPane().add(lbl6);
		
		lbl7 = new JLabel("Dener Flores");
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl7.setBounds(279, 184, 97, 14);
		getContentPane().add(lbl7);
		
		lbl8 = new JLabel("Aileen Sanchez");
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl8.setBounds(269, 219, 106, 15);
		getContentPane().add(lbl8);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(177, 275, 89, 23);
		getContentPane().add(btnCerrar);

	}
}
