package Ejercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener, KeyListener {

    private JPanel contentPane;
    private JTextField txtTexto;
    JLabel etiTexto;
    JButton btnVaciar;

    public Ventana() {
        crearVentana();
    }

    public void crearVentana() {
        setBounds(100, 100, 450, 172);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtTexto = new JTextField();
        txtTexto.setBounds(162, 31, 111, 20);
        contentPane.add(txtTexto);
        txtTexto.setColumns(10);
        txtTexto.addKeyListener(this);

        etiTexto = new JLabel("");
        etiTexto.setBounds(118, 62, 190, 14);
        contentPane.add(etiTexto);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(175, 101, 89, 23);
        contentPane.add(btnVaciar);
        btnVaciar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            txtTexto.setText("");
            etiTexto.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == txtTexto) {
        	if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				etiTexto.setText(txtTexto.getText());
			}
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
}

