import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() { 
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Mi ventana");
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
