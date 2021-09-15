import java.util.Scanner;
public class EmQualIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num; 
		System.out.println("Digite um número");
		num = sc.nextDouble();
		
		if(num >= 0 && num <= 25) { 
			System.out.println("O numero está entre 0 e 25");
		}else if(num > 25 && num <= 50) { 
			System.out.println("O numero está entre 25 e 50");
		}else if(num > 50 && num <= 75) { 
			System.out.println("O numero está entre 50 e 75");
		}else if(num > 75 && num <= 100) { 
			System.out.println("O numero está entre 75 e 100");
		} else { 
			System.out.println("O número não está dentre nenhum dos intervalos!");
		}
		
		sc.close();
	}

}
