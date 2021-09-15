import java.util.Scanner;
public class CalculoImposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario; 
		System.out.println("Digite o valor de seu salário: ");
		salario = sc.nextDouble();
		
		if(salario<=2000) { 
			System.out.println("Insento!");
		}else if(salario<=3000) {
			System.out.printf("R$ %.2f\n", (salario-2000)*0.08);
		}else if(salario<=4500) {
			System.out.printf("R$ %.2f\n", 1000.0 * 0.08 + (salario-3000.0)*0.18 );
		}else {
			System.out.printf("R$ %.2f\n", 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28);
			
		}
		sc.close();

	}

}
