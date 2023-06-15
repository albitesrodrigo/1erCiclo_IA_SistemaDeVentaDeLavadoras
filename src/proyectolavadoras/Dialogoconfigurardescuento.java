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

public class Dialogoconfigurardescuento extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbl1a5;
	private JLabel lbl6a10;
	private JLabel lbl11a15;
	private JLabel lblmasde15;
	private JTextField txt1a5;
	private JTextField txt11a15;
	private JTextField txtmasde15;
	private JTextField txt6a10;
	private JLabel lblporcentaje1;
	private JLabel lblporcentaje2;
	private JLabel lblporcentaje3;
	private JLabel lblporcentaje4;
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
					Dialogoconfigurardescuento dialog = new Dialogoconfigurardescuento();
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
	public Dialogoconfigurardescuento() {
		setModal(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 550, 185);
		getContentPane().setLayout(null);
		
		lbl1a5 = new JLabel("1 a 5 unidades");
		lbl1a5.setBounds(10, 11, 101, 14);
		getContentPane().add(lbl1a5);
		
		lbl6a10 = new JLabel("6 a 10 unidades");
		lbl6a10.setBounds(10, 41, 85, 14);
		getContentPane().add(lbl6a10);
		
		lbl11a15 = new JLabel("11 a 15 unidades");
		lbl11a15.setBounds(10, 77, 101, 14);
		getContentPane().add(lbl11a15);
		
		lblmasde15 = new JLabel("M\u00E1s de 15 unidades");
		lblmasde15.setBounds(10, 113, 101, 14);
		getContentPane().add(lblmasde15);
		
		txt1a5 = new JTextField();
		txt1a5.setBounds(114, 8, 118, 20);
		getContentPane().add(txt1a5);
		txt1a5.setColumns(10);
		
		txt11a15 = new JTextField();
		txt11a15.setBounds(114, 74, 118, 20);
		getContentPane().add(txt11a15);
		txt11a15.setColumns(10);
		
		txtmasde15 = new JTextField();
		txtmasde15.setBounds(114, 110, 118, 20);
		getContentPane().add(txtmasde15);
		txtmasde15.setColumns(10);
		
		txt6a10 = new JTextField();
		txt6a10.setBounds(114, 38, 118, 20);
		getContentPane().add(txt6a10);
		txt6a10.setColumns(10);
		
		lblporcentaje1 = new JLabel("%");
		lblporcentaje1.setBounds(242, 11, 46, 14);
		getContentPane().add(lblporcentaje1);
		
		lblporcentaje2 = new JLabel("%");
		lblporcentaje2.setBounds(242, 41, 46, 14);
		getContentPane().add(lblporcentaje2);
		
		lblporcentaje3 = new JLabel("%");
		lblporcentaje3.setBounds(242, 77, 46, 14);
		getContentPane().add(lblporcentaje3);
		
		lblporcentaje4 = new JLabel("%");
		lblporcentaje4.setBounds(242, 113, 46, 14);
		getContentPane().add(lblporcentaje4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(435, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(435, 37, 89, 23);
		getContentPane().add(btnCancelar);
		
		mostrarDescuentos();

	}

	 void mostrarDescuentos() {
		txt1a5.setText(""+ proyectogrupal.porcentaje1);
		txt6a10.setText("" + proyectogrupal.porcentaje2);
		txt11a15.setText(""+ proyectogrupal.porcentaje3);
		txtmasde15.setText(""+ proyectogrupal.porcentaje4);
	 }

	 
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
		double des0,des1,des2,des3;
		
		des0 = leerDescuento0();
		des1 = leerDescuento1();
		des2 = leerDescuento2();
		des3 = leerDescuento3();
		
		if(des0>100 || des0<1) {
			JOptionPane.showMessageDialog(this,"El Primer descuento Incorrecto : Debe ser en rango de 1 a 100");
			txt1a5.requestFocus();
			txt1a5.selectAll();
		
		}
		else if (des1>100 || des1<1) {
			JOptionPane.showMessageDialog(this,"El Primer descuento Incorrecto : Debe ser en rango de 1 a 100");
			txt6a10.requestFocus();
			txt6a10.selectAll();	
		}
		else if (des2>100 || des2<1) {
			JOptionPane.showMessageDialog(this,"El Primer descuento Incorrecto : Debe ser en rango de 1 a 100");
			txt11a15.requestFocus();
			txt11a15.selectAll();	
		}
		else if (des3>100 || des3<1) {
			JOptionPane.showMessageDialog(this,"El Primer descuento Incorrecto : Debe ser en rango de 1 a 100");
			txtmasde15.requestFocus();
			txtmasde15.selectAll();	
		}
		else {
			proyectogrupal.porcentaje1 = des0;
			proyectogrupal.porcentaje2 = des1;
			proyectogrupal.porcentaje3 = des2;
			proyectogrupal.porcentaje4 = des3;
			JOptionPane.showMessageDialog(this,"Cambios Realizados");
			dispose();
		}
	}
		catch (Exception error) {
			JOptionPane.showMessageDialog(this, "solo acepta números");
		}
	}
	
	double leerDescuento0() {
		return Double.parseDouble(txt1a5.getText());
	}
	
	double leerDescuento1() {
		return Double.parseDouble(txt6a10.getText());
	}	
	double leerDescuento2() {
		return Double.parseDouble(txt11a15.getText());
	}
	double leerDescuento3() {
		return Double.parseDouble(txtmasde15.getText());
	}
}
