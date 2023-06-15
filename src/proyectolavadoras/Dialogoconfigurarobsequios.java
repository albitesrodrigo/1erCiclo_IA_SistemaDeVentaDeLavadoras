package proyectolavadoras;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogoconfigurarobsequios extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbl1unidad;
	private JLabel lbl2a5;
	private JLabel lbl6amas;
	private JTextField txt1unidad;
	private JTextField txt2a5;
	private JTextField txt6amas;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
					Dialogoconfigurarobsequios dialog = new Dialogoconfigurarobsequios();
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
	public Dialogoconfigurarobsequios() {
		setModal(true);
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 149);
		getContentPane().setLayout(null);
		
		lbl1unidad = new JLabel("1 unidad");
		lbl1unidad.setBounds(10, 11, 46, 14);
		getContentPane().add(lbl1unidad);
		
		lbl2a5 = new JLabel("2 a 5 unidades");
		lbl2a5.setBounds(10, 42, 98, 14);
		getContentPane().add(lbl2a5);
		
		lbl6amas = new JLabel("6 a m\u00E1s unidades");
		lbl6amas.setBounds(10, 73, 98, 14);
		getContentPane().add(lbl6amas);
		
		txt1unidad = new JTextField();
		txt1unidad.setBounds(159, 8, 98, 20);
		getContentPane().add(txt1unidad);
		txt1unidad.setColumns(10);
		
		txt2a5 = new JTextField();
		txt2a5.setBounds(159, 39, 98, 20);
		getContentPane().add(txt2a5);
		txt2a5.setColumns(10);
		
		txt6amas = new JTextField();
		txt6amas.setBounds(159, 70, 98, 20);
		getContentPane().add(txt6amas);
		txt6amas.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 38, 89, 23);
		getContentPane().add(btnCancelar);
		
		txt1unidad.setText(proyectogrupal.obsequio1);
		txt2a5.setText(proyectogrupal.obsequio2);
		txt6amas.setText(proyectogrupal.obsequio3);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
	String obs1,obs2,obs3;
	obs1 = LeerRegalos1();
	obs2 = LeerRegalos2();
	obs3 = LeerRegalos3();
	
	if (obs1.length() == 0) {
	JOptionPane.showMessageDialog(this,"Primer obsequio no puede estar vacio");
	txt1unidad.requestFocus();
	}
	else if (obs2.length() == 0) {
	JOptionPane.showMessageDialog(this,"Segundo obsequio no puede estar vacio");
	txt1unidad.requestFocus();
	}
	else if (obs3.length() == 0) {
	JOptionPane.showMessageDialog(this,"Tercer Obsequio no puede estar vacio");
	txt1unidad.requestFocus();
	}
	else
	proyectogrupal.obsequio1 = obs1;
	proyectogrupal.obsequio2 = obs2;
	proyectogrupal.obsequio3 = obs3;
	}
	
	
	String LeerRegalos1() {
	return txt1unidad.getText(); 
	}
	String LeerRegalos2() {
	return txt2a5.getText();	
	}
	String LeerRegalos3() {
		return txt6amas.getText();	
	}

}
