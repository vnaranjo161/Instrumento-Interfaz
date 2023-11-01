package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnVisuNombre,btnVisuCiudad,btnOcultarNombre,btnOcultarCiudad;
	JLabel etiNombre,etiCiudad;
	
	public VentanaEjercicio1() {
		crearVentana();
        setLocationRelativeTo(null);
	}
	
	public void crearVentana(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Valentina");
		etiNombre.setBounds(92, 48, 73, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Armenia");
		etiCiudad.setBounds(288, 48, 78, 14);
		contentPane.add(etiCiudad);
		
		btnVisuNombre = new JButton("Visualizar nombre");
		btnVisuNombre.setBackground(new Color(255, 240, 254));
		btnVisuNombre.setForeground(new Color(0, 0, 0));
		btnVisuNombre.setBounds(54, 73, 141, 23);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
		
		btnVisuCiudad = new JButton("Visualizar ciudad");
		btnVisuCiudad.setForeground(Color.BLACK);
		btnVisuCiudad.setBackground(new Color(255, 240, 254));
		btnVisuCiudad.setBounds(243, 73, 141, 23);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		
		btnOcultarNombre = new JButton("Ocultar nombre");
		btnOcultarNombre.setForeground(Color.BLACK);
		btnOcultarNombre.setBackground(new Color(255, 240, 254));
		btnOcultarNombre.setBounds(54, 107, 141, 23);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar ciudad");		
		btnOcultarCiudad.setForeground(Color.BLACK);
		btnOcultarCiudad.setBackground(new Color(255, 240, 254));
		btnOcultarCiudad.setBounds(243, 107, 141, 23);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		} else if(e.getSource()==btnOcultarNombre){
			etiNombre.setVisible(false);
		}else if (e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}else if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
	}
}
