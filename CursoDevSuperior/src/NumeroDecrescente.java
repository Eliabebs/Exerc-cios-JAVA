import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
//		Crie uma classe java NumeroDecrescente que contenha um m�todo que receba
//		um n�mero inteiro e imprima, em ordem decrescente, o valor do n�mero at�
//		0
		Scanner sc = new Scanner(System.in);
		int numero; 
		
		System.out.print("Digite um N�mero:");
		numero = sc.nextInt();
	
		do {
			System.out.println(numero);
			--numero;
		}while(numero >= 0);
		
		sc.close();
	}

}
