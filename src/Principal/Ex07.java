package Principal;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Integer n1, n2;
		
		System.out.println("Digite um numero inteiro: ");
		n1 = leitura.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		n2 = leitura.nextInt();
		
		if(n1 > n2) {
			System.out.println("A diferença dos numeros é: "+(n1 - n2));
		}else {
			System.out.println("A diferença dos numeros é: "+(n2 - n1));
		}
	}
}
