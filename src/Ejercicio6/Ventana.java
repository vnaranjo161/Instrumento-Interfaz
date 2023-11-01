package Ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Ventana extends JFrame implements ActionListener, MouseListener{

	private JPanel contentPane;
	private JLabel etiNombre;
	private JButton btnAgrandar,btnCentro,btnEsquina,btnAchicar;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Valen");
		etiNombre.setBackground(new Color(255, 234, 255));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(135, 33, 59, 14);
		etiNombre.setOpaque(true);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(53, 100, 89, 23);
		contentPane.add(btnEsquina);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);

		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(180, 100, 89, 23);
		contentPane.add(btnCentro);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(53, 134, 89, 23);
		contentPane.add(btnAgrandar);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(180, 134, 89, 23);
		contentPane.add(btnAchicar);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
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
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(100, 30);
		}else if (e.getSource()==btnCentro) {
			btnCentro.setSize(100, 30);
		}else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(100, 30);
		}else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100, 30);
		}
	}		

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(89, 23);
		}else if (e.getSource()==btnCentro) {
			btnCentro.setSize(89, 23);
		}else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(89, 23);
		}else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89, 23);
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(10, 15);
		}else if (e.getSource()==btnCentro) {
			etiNombre.setLocation(135, 33);
		}else if (e.getSource()==btnAchicar) {
			etiNombre.setSize(50, 10);;
		}else if (e.getSource()==btnAgrandar) {
			etiNombre.setSize(50, 40);
		}
	}
}
