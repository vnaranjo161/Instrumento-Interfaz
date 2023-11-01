package ejercicio10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(82, 47, 86, 20);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(233, 47, 86, 20);
		contentPane.add(txtPalabra2);
		
		etiTexto = new JLabel("");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(82, 91, 237, 14);
		contentPane.add(etiTexto);
		
		btnConcatena = new JButton("Concatena");
		btnConcatena.setBounds(153, 124, 113, 23);
		contentPane.add(btnConcatena);
		btnConcatena.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
