package Principal;
import java.util.Scanner;
public class Ex02 {
	
	public static void main (String[] args ) {
		Scanner leitura = new Scanner(System.in);
		Double celsius,fahren;
		
		System.out.println("Digite Uma Temperatura: ");
		celsius = leitura.nextDouble();
		
		fahren = (9 *celsius + 160) / 5;
		System.out.println("A temperatura digita(Celsius) em Fahrenheit é "+fahren.toString()+"F°");
	}

}
