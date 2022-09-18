package Principal;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Double n1;
		
		System.out.println("Digite um Numero: ");
		n1 = leitura.nextDouble();
		
		if(n1 < 0) {
			System.out.println("O módulo do número escolhido é: "+(n1 * -1) );
		}else {
			System.out.println("O módulo do número escolhido é: "+n1);
		}
	}
}
