import java.util.Scanner;

public class MaiorNumero {

	
//	Crie uma classe java MaiorNumero que contenha um m�todo que receba dois
//	n�meros inteiros e imprima o maior entre eles.

	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite um n�mero: ");
		num1 = sc.nextInt();

		System.out.print("Digite outro n�mero: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " � maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("Os dois n�meros s�o iguais!");
		} else if (num1 < num2) {
			System.out.println(num1 + " � menor que " + num2);
		}
		sc.close();
	}
	
	
}
