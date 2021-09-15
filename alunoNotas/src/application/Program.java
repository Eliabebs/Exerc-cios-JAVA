package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.println("Digite a nota do primeiro trimestre:");
		aluno.notaPrimeiroTrimestre = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre:");
		aluno.notaSegundoTrimestre = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre:");
		aluno.notaTerceiroTrimestre = sc.nextDouble();
		System.out.println("A nota final do aluno é : " + aluno.notaFinal());
		System.out.println("Resultado: " + aluno.resultado());
		sc.close();
	}

}
