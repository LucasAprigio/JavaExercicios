package Principal;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Integer nascimento, anoatual, futuro,idade;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leitura.nextLine();
		
		System.out.println("Digite o ano em que você nasceu: ");
		nascimento = leitura.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoatual = leitura.nextInt();
		
		idade = anoatual - nascimento;
		futuro = 2030 - nascimento;
		
		System.out.println("Olá "+nome+" Você tem "+idade+" anos e em 2030 terá "+futuro+" anos!!");
	}
}
