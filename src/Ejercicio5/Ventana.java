package Ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class Ventana extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

	public Ventana() {
		crearVentana();
	}
	
	public void crearVentana(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("Palabra 1");
		etiPal1.setBounds(57, 36, 91, 14);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("Palabra 2");
		etiPal2.setBounds(178, 36, 91, 14);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("Palabra 3");
		etiPal3.setBounds(57, 66, 91, 14);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("Palabra 4");
		etiPal4.setBounds(178, 61, 91, 14);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setBackground(Color.cyan);
		etiOcultar.setForeground(new Color(0, 0, 0));
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiOcultar.setBounds(113, 116, 85, 14);
		etiOcultar.addMouseListener(this);
		etiOcultar.setOpaque(true);
		contentPane.add(etiOcultar);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		if (e.getSource()== etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
			etiOcultar.setBackground(Color.gray);
		}
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
			etiOcultar.setBackground(Color.cyan);
		}
	}
}
