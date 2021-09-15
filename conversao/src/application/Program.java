package application;

import java.util.Scanner;

import entitie.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencyConverter converter = new CurrencyConverter();
		System.out.println("Digite o valor da cotação:");
		converter.cotacao = sc.nextDouble();
		System.out.println("Digite o valor que deseja comprar em Dólares: ");
		converter.qntdCompra = sc.nextDouble();
		System.out.println("Valor total a ser pago em reais: " + converter.total());

		sc.close();
	}

}
