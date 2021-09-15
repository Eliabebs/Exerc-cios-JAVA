import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
//		Crie uma classe java NumeroDecrescente que contenha um método que receba
//		um número inteiro e imprima, em ordem decrescente, o valor do número até
//		0
		Scanner sc = new Scanner(System.in);
		int numero; 
		
		System.out.print("Digite um Número:");
		numero = sc.nextInt();
	
		do {
			System.out.println(numero);
			--numero;
		}while(numero >= 0);
		
		sc.close();
	}

}
