import java.util.Scanner;
public class ValorTotalProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do item: ");
		int codigo; 
		codigo = sc.nextInt();
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00; 
		double torradaSimples = 2.00;
		double refrigerante = 1.5;
		System.out.println("Digite a quantidade do item: ");
		int qntd;
		qntd = sc.nextInt();
		
		if(codigo == 1) { 
			System.out.println("O valor total é de: R$" + (qntd*cachorroQuente));
		}else if(codigo == 2) { 
			System.out.println("O valor total é de: R$" + (qntd*xSalada));
		}else if(codigo == 3) { 
			System.out.println("O valor total é de R$" + (qntd*xBacon));
		}else if(codigo == 4) { 
			System.out.println("O valor total é de R$" + (qntd*torradaSimples));
		}else if(codigo == 5) { 
			System.out.println("O valor toal é de R$" + (qntd*refrigerante));
		}else {
			System.out.println("Código Invalido!");
		}
		
		sc.close();
	}

}
