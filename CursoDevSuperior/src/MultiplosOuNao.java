import java.util.Scanner;
public class MultiplosOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("São Multiplos! ");
		} else {
			System.out.println("Não são multiplos! ");
		}
	}

}
