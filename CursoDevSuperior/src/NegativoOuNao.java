import java.util.Scanner;
public class NegativoOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();		
		
		if(num >= 0) {
			System.out.println("O n�mero digitado � positivo! ");
		} else {
			System.out.println("O n�mero digitado � negativo! ");
		}
		sc.close();
	}

}
