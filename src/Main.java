import java.util.ArrayList;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);  
		Ventana w = new Ventana(); 
		
		Login l = new Login();
		
		w.add(l); 
		w.validate();
		//w.setContentPane(l);
	}

}
