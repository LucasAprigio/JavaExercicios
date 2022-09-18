package Principal;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Double base, altura, area;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a Base do triangulo: ");
		base = leitura.nextDouble();
		
		System.out.println("Digite a altura do triangulo: ");
		altura = leitura.nextDouble();
		
		area = base * altura;
		
		System.out.println("A area do triangulo é "+area.toString()+"cm²");
	}
}
