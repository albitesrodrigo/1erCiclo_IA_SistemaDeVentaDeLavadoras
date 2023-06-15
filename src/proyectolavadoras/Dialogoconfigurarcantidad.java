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

public class Dialogoconfigurarcantidad extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblcoduv;
	private JTextField txtcoduv;
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
					Dialogoconfigurarcantidad dialog = new Dialogoconfigurarcantidad();
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
	public Dialogoconfigurarcantidad() {
		setModal(true);
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 450, 110);
		getContentPane().setLayout(null);
		
		lblcoduv = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblcoduv.setBounds(10, 11, 199, 14);
		getContentPane().add(lblcoduv);
		
		txtcoduv = new JTextField();
		txtcoduv.setBounds(232, 8, 52, 20);
		getContentPane().add(txtcoduv);
		txtcoduv.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(323, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(323, 34, 89, 23);
		getContentPane().add(btnCancelar);
		txtcoduv.setText(""+ proyectogrupal.cantidadOptima);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
	    int cantop;
		cantop = leerCantidadOptima();
		if (cantop<1) {
			JOptionPane.showMessageDialog(this,"número inválido-número debe ser mayor que cero");
			txtcoduv.requestFocus();
			txtcoduv.selectAll();
		}
		else {
			proyectogrupal.cantidadOptima=cantop;
			JOptionPane.showMessageDialog(this,"cambio exitoso");
			dispose();
		}
		}
		catch(Exception x) {
			JOptionPane.showMessageDialog(this,"solo se aceptan números");
			txtcoduv.requestFocus();
			txtcoduv.selectAll();
		}
		
	}
	
	int leerCantidadOptima() {
		return Integer.parseInt(txtcoduv.getText());
	}
}
