package Principal;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Double  altura,pesoideal;
		String nome;
		char sexo;
			
		System.out.println("Digite seu nome: ");
		nome = leitura.nextLine();
		
		System.out.print("Digite a sua altura: ");
		altura = leitura.nextDouble();

		System.out.println("Digite Seu sexo [m - masculino / f - feminino ]: ");
		sexo = leitura.next().charAt(0);
		
		if( sexo == 'f' ) {
			pesoideal = (62.1 * altura )-44.7;
			System.out.println("Olá "+nome+" seu peso ideal é: "+pesoideal);
		}else{
			pesoideal = (72.7 * altura)- 58;
			System.out.println("Olá "+nome+" seu Peso ideal é: "+pesoideal);
		}
		
	}
}
