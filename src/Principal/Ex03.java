package Principal;
import java.util.Scanner;
public class Ex03 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String nome,sobrenome;
		
		System.out.println("Digite seu nome: ");
		nome = leitura.next();
		
		System.out.println("Digite seu Sobrenome: ");
		sobrenome = leitura.next();
		
		System.out.println("Seu nome completo é "+nome+" "+sobrenome);
	}
	

}
