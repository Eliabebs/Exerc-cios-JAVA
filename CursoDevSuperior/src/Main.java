import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		
//	 	Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//		números 4, 5 e 6. A soma das duas médias. A média das médias.
//
//		int num1 = 8; 
//		int num2 = 9;
//		int num3 = 7;
//		int media1 = (num1 + num2 + num3)/3;
//		int num4 = 4;
//		int num5 = 5; 
//		int num6 = 6;
//		int media2 = (num4 + num5 + num6)/3;
//		int somaMedia = media1+media2;
//		int mediaDaMedia = somaMedia/2;
//		
//		System.out.println("A média dos numeros 8, 9 e 7 é: " + media1);
//		System.out.println(" A média dos numeros 4, 5 e 6 é: " + media2);
//		System.out.println("A Soma das duas médias é: " + somaMedia);
//		System.out.println("A Média das Médias é: " + mediaDaMedia);
		
//		----------
		
//		Informar um saldo e imprimir o saldo com reajuste de 1% 
//		
//		double saldoOriginal = 100.0;
//		double calc = saldoOriginal*0.01;
//		double novoSaldo = saldoOriginal+calc;
//		
//		System.out.println("o saldo inserido foi: " + saldoOriginal + " E o saldo corrigido é de: " + novoSaldo);
//		
//		 Escrever um algoritmo que lê:
//			- a porcentagem do IPI a ser acrescido no valor das peças
//			- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//			- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//			O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//			Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
//
//		
//		double ipi = 30; 
//		
//		int codigoPeca1 = 25; 
//		double valorPeca1 = 30.50; 
//		int qntdPeca1 = 32; 
//		
//		int codigoPeca2 = 26; 
//		double valorPeca2 = 22.60; 
//		int qntdPeca2 = 14; 
//		
//		double valorTotal = (valorPeca1*qntdPeca1 + valorPeca2*qntdPeca2)*(ipi/100+1); 
//		
//		System.out.printf("O valor total a ser pago é de: " + "%.2f", valorTotal);
//		
//		Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//		calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//		(1SM=R$788,00)
//
//		double salarioMinimo = 788.00; 
//		double salarioUsuario = 2934.00;
//		double qntdSalarioMinimo = salarioUsuario/salarioMinimo;
//		
//		System.out.printf("O salário mínimo é de %.2f e o usuário recebe %.2f , totalizando %.2f vezes o salário minimo.", salarioMinimo, salarioUsuario, qntdSalarioMinimo);
//		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		
	}

}
