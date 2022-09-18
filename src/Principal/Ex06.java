package Principal;
import java.util.Scanner;
public class Ex06 
{
	public static void main(String[] args) 
	{
		
		Scanner leitura = new Scanner(System.in);
		Double n1,n2,n3,n4,media,aprovado,reprovado,exame ;
		
		System.out.println("Digite sua Primeira nota: ");
		n1 = leitura.nextDouble();
		
		System.out.println("Digite Sua segunda nota: ");
		n2 = leitura.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		n3 = leitura.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		n4 = leitura.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 7) {
			System.out.println("O aluno esta Aprovado, com a media "+media);
		}else if(media < 3) {
			System.out.println("O aluno esta reprovado, com a media "+media);
		}else {
			System.out.println("O aluno esta em exame, com a media "+media);
			
			}
		
	}
	
	
}

