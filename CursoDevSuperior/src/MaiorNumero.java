import java.util.Scanner;

public class MaiorNumero {

	
//	Crie uma classe java MaiorNumero que contenha um método que receba dois
//	números inteiros e imprima o maior entre eles.

	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();

		System.out.print("Digite outro número: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("Os dois números são iguais!");
		} else if (num1 < num2) {
			System.out.println(num1 + " é menor que " + num2);
		}
		sc.close();
	}
	
	
}
