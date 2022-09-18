package Principal;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		Float comprimento,largura,altura,volume;
		
		System.out.println("Digite o Comprimeiro da figura: ");
		comprimento = leitura.nextFloat();
		
		System.out.println("Digite a largura da figura: ");
		largura = leitura.nextFloat();
		
		System.out.println("Digite a altura da figura: ");
		altura = leitura.nextFloat();
		
		volume = comprimento * largura * altura;
		
		System.out.println("O volume da figura é "+ volume.toString() +"cm³");
	}
}
