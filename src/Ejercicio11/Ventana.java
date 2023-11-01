package Ejercicio11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Ventana extends JFrame implements MouseListener, ActionListener{

	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel etiNueve, etiOcho, etiSiete, etiSeis, etiCinco, etiCuatro, etiTres, etiDos, etiUno, etiCero; 
	private JButton btnBorrar;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(75, 10, 272, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		etiCero = new JLabel("0");
		etiCero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setBounds(38, 65, 46, 14);
		etiCero.addMouseListener(this);
		contentPane.add(etiCero);
		
		etiUno = new JLabel("1");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiUno.setBounds(114, 67, 46, 14);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiDos.setBounds(191, 67, 46, 14);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiTres.setBounds(271, 67, 46, 14);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiCuatro.setBounds(345, 67, 46, 14);
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiCinco.setBounds(38, 116, 46, 14);
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiSeis.setBounds(114, 116, 46, 14);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiSiete.setBounds(191, 118, 46, 14);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiOcho.setBounds(271, 118, 46, 14);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiNueve.setBounds(345, 118, 46, 14);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(172, 183, 89, 23);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBorrar) {
			txtNumero.setText("");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		  if (e.getSource() == etiUno) {
	            txtNumero.setText(txtNumero.getText() + etiUno.getText());
	        } else if (e.getSource() == etiDos) {
	            txtNumero.setText(txtNumero.getText() + etiDos.getText());
	        } else if (e.getSource() == etiTres) {
	            txtNumero.setText(txtNumero.getText() + etiTres.getText());
	        } else if (e.getSource() == etiCuatro) {
	            txtNumero.setText(txtNumero.getText() + etiCuatro.getText());
	        } else if (e.getSource() == etiCinco) {
	            txtNumero.setText(txtNumero.getText() + etiCinco.getText());
	        } else if (e.getSource() == etiSeis) {
	            txtNumero.setText(txtNumero.getText() + etiSeis.getText());
	        } else if (e.getSource() == etiSiete) {
	            txtNumero.setText(txtNumero.getText() + etiSiete.getText());
	        } else if (e.getSource() == etiOcho) {
	            txtNumero.setText(txtNumero.getText() + etiOcho.getText());
	        } else if (e.getSource() == etiNueve) {
	            txtNumero.setText(txtNumero.getText() + etiNueve.getText());
	        } else if (e.getSource() == etiCero) {
	            txtNumero.setText(txtNumero.getText() + etiCero.getText());
	        }
	}
	

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
