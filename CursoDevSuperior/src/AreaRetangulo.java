import java.util.Scanner;
public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base; 
		System.out.println("Digite o valor da base do quadrilatero:");
		base = sc.nextDouble();
		double altura;
		System.out.println("Digite o valor da altura do quadrilatero:");
		altura = sc.nextDouble();
		double area = base*altura;
		double perimetro = (base+altura)*2;
		double diagonal = Math.sqrt(base*base+altura*altura);
		System.out.println("O valor da �rea � de: " + area);
		System.out.println("O valor do perimetro � de: " + perimetro);
		System.out.printf("O valor da diagonal � de: %.2f", diagonal);
		sc.close();
	}

}
