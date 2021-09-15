import java.util.Scanner;
public class NegativoOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();		
		
		if(num >= 0) {
			System.out.println("O número digitado é positivo! ");
		} else {
			System.out.println("O número digitado é negativo! ");
		}
		sc.close();
	}

}
