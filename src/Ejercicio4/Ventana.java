package Ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnActivar, btnDesactivar, btnAceptar;
	private JLabel etiTexto;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(59, 27, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(275, 27, 86, 20);
		contentPane.add(txtCiudad);
		
		etiTexto = new JLabel("");
		etiTexto.setBounds(69, 62, 265, 14);
		contentPane.add(etiTexto);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(28, 100, 105, 23);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(156, 100, 103, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);

		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(283, 100, 103, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnAceptar) {
			etiTexto.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText()+".");
		} else if(e.getSource()==btnActivar){
			txtCiudad.setEnabled(true);
			txtNombre.setEnabled(true);
		}else if (e.getSource()==btnDesactivar) {
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);
		}
	}
}
