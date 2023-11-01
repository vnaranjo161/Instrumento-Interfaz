package Ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ventana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto1,etiTexto2;
	JButton btnTraspasa1, btnTraspasa2;
	
	public Ventana() {
		crearVentana();
	}
	
	public void crearVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(160, 36, 109, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setBounds(51, 86, 129, 20);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setBounds(257, 86, 129, 20);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTraspasa1.setBounds(65, 128, 89, 23);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTraspasa2.setBounds(272, 128, 89, 23);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
			txtTexto.setText("");
			etiTexto2.setText("");
		} else if(e.getSource()== btnTraspasa2){
			etiTexto2.setText(txtTexto.getText());
			txtTexto.setText("");
			etiTexto1.setText("");
		}
	}
}
