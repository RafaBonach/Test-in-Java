package primeiro;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		double a1, a2, a3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a Primeira altura:");
		a1 = entrada.nextDouble();
		System.out.println("Digite a Segunda altura:");
		a2 = entrada.nextDouble();
		System.out.println("Digite a Terceira altura:");
		a3 = entrada.nextDouble();
		
		System.out.println("As alturas digitadas sao " + a1 + ", " + a2 + ", " + a3);
	}

}
