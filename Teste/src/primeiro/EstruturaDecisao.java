package primeiro;
import java.util.Scanner;

public class EstruturaDecisao {

	public static void main(String[] args) {
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " e maior que " + n2);
		}
		else if(n1 < n2) {
			System.out.println(n2 + " e maior que " + n1);
		}
		else {
			System.out.println("Os numeros sao iguias.");
		}
	}

}
