import java.util.Scanner;
public class MultiplosOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("S�o Multiplos! ");
		} else {
			System.out.println("N�o s�o multiplos! ");
		}
	}

}
