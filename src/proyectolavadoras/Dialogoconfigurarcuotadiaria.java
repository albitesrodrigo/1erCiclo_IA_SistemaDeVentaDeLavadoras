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

public class Dialogoconfigurarcuotadiaria extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblcuotadiaria;
	private JTextField txtCuotadiaria;
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
					Dialogoconfigurarcuotadiaria dialog = new Dialogoconfigurarcuotadiaria();
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
	public Dialogoconfigurarcuotadiaria() {
		setModal(true);
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 520, 105);
		getContentPane().setLayout(null);
		
		lblcuotadiaria = new JLabel("Cuota diaria esperada (S/.)");
		lblcuotadiaria.setBounds(10, 11, 154, 14);
		getContentPane().add(lblcuotadiaria);
		
		txtCuotadiaria = new JTextField();
		txtCuotadiaria.setBounds(174, 8, 140, 20);
		getContentPane().add(txtCuotadiaria);
		txtCuotadiaria.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(405, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(405, 32, 89, 23);
		getContentPane().add(btnCancelar);
		txtCuotadiaria.setText(""+ proyectogrupal.cuotaDiaria);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
		double cuod;
		cuod = leerCuotaDiaria();
		
		
		if (cuod<1) {
			JOptionPane.showMessageDialog(this,"número invalido-número debe ser mayor que 0");
			txtCuotadiaria.requestFocus();
			txtCuotadiaria.selectAll();
		}
			else {
				proyectogrupal.cuotaDiaria = cuod;
				JOptionPane.showMessageDialog(this, "cambio exitoso");
				dispose();
			}
		}
		catch(Exception error) {
			JOptionPane.showMessageDialog(this, "solo se acepta números");
			txtCuotadiaria.requestFocus();
			txtCuotadiaria.selectAll();
			
		}
		}
	
    double leerCuotaDiaria() {
    	return Double.parseDouble(txtCuotadiaria.getText());
    	
    }
}
