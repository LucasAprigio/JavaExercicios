package Principal;
import java.util.Scanner;
	public class Ex04 {
		public static void main(String[] args) {
		Double salariobruto, gratificacao, imposto, salariototal, saldo;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite Seu salario Bruto: ");
		salariobruto = leitura.nextDouble();
		
		gratificacao = salariobruto * 0.10;
		
		imposto = salariobruto * 0.20;
		
		saldo = gratificacao - imposto;
		
		salariototal = salariobruto + saldo;
		
		System.out.println("O salário Liquido é: "+salariototal+"R$");
	}
}
