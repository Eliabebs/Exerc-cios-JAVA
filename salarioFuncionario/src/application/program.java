package application;

import java.util.Scanner;

import entities.Funcionario;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Digite o nome do funcionario: ");
		funcionario.name = sc.next();
		System.out.println("Digite o salario bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor do desconto: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("Funcionario: " + funcionario.name + ", $" + funcionario.netSalary());
		System.out.println("Qual o valor a ser acrescentado no salário? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}

}
