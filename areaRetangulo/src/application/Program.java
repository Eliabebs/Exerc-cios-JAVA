package application;

import java.util.Scanner;

import entities.Retangulo;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Digite o valor da base do retangulo:");
		retangulo.base = sc.nextDouble();
		System.out.println("Digite o valor da altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("O valor da área é: " + retangulo.area());
		System.out.println("O valor do perimetro é de: " + retangulo.perimetro());
		System.out.println("O valor da diagonal é de: " + retangulo.diagonal());
		sc.close();
	}

}
