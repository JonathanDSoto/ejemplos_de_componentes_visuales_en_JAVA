import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener{
		
	private JButton botonLogin; 
	private JButton botonRegistro;
	private JLabel  titulo;
	private JTextField nombre;
	
	public Login() {
		this.setLayout(null);
		this.setVisible(true);
		
		titulo = new JLabel("Programa");
		titulo.setBounds(150, 0, 100, 20); 
		this.add(titulo);
		
		nombre = new JTextField("Example");
		nombre.setBounds(250, 0, 100, 20); 
		this.add(nombre);
		
		botonLogin = new JButton("Acceder"); 
		botonLogin.setBounds(50, 50, 150, 30);  
		botonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String temporal = nombre.getText();
				temporal+=" xdDDD";
				nombre.setText(temporal);
				System.out.println("Hola");
				
			}
			
		});
		this.add(botonLogin);
		
		botonRegistro = new JButton("Regístrarme"); 
		botonRegistro.setBounds(200, 50, 150, 30);  
		botonRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, nombre.getText()); 
			}
			
		});
		this.add(botonRegistro);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { 
		
		JButton btn = (JButton) arg0.getSource();
		
		System.out.println(btn.getText());
		JOptionPane.showMessageDialog(this, btn.getText()); 
	}

}
