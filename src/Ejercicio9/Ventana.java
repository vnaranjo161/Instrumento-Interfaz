package Ejercicio9;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Ventana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSeguntoTrimestre;
	private JTextField txtTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiNotaFinal, etiResultado;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 243);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 241, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		crearVentana();
	}

	private void crearVentana() {
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(39, 48, 75, 28);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSeguntoTrimestre = new JTextField();
		txtSeguntoTrimestre.setBounds(159, 48, 75, 28);
		contentPane.add(txtSeguntoTrimestre);
		txtSeguntoTrimestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(292, 48, 75, 28);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setBounds(52, 108, 96, 28);
		contentPane.add(etiNotaFinal);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setBounds(39, 28, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setBounds(173, 28, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3");
		lblNewLabel_2.setBounds(292, 28, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		btnCalcular = new JButton("Calcular\r\n");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(147, 165, 87, 28);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		etiResultado = new JLabel("");
		etiResultado.setBounds(205, 108, 118, 28);
		contentPane.add(etiResultado);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCalcular) {
			calcular();
		}
		
	}
	
	public void calcular() {
		double nota1=Double.parseDouble(txtPrimerTrimestre.getText());
		double nota2=Double.parseDouble(txtSeguntoTrimestre.getText());
		double nota3=Double.parseDouble(txtTercerTrimestre.getText());
		double promedio=(nota1+nota2+nota3)/3;
		
		if (promedio<5) {
			etiNotaFinal.setForeground(Color.RED);
			etiResultado.setForeground(Color.RED);
			etiNotaFinal.setText("Nota Final: "+promedio);
			etiResultado.setText("SUPENSO");
			
		} else if(promedio>=5){
			etiNotaFinal.setForeground(Color.BLACK);
			etiResultado.setForeground(Color.BLACK);
			etiNotaFinal.setText("Nota Final: "+promedio);
			etiResultado.setText("APROBADO");
		}
	}
}
