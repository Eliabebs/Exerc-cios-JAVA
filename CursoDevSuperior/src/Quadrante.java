import java.util.Scanner; 
public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x; 
		System.out.println("Digite as cordenadas de 'X': ");
		x = sc.nextDouble();
		double y;
		System.out.println("Digite as cordenadas de 'Y': ");
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) { 
			System.out.println("Pertence ao quadrante número 1 ");
		}else if(x < 0 && y > 0){ 
			System.out.println("Pertence ao quadrante número 2");
		}else if(x < 0 && y < 0) { 
			System.out.println("Pertence ao quadrante número 3");
		}else if(x > 0 && y < 0) { 
			System.out.println("Pertence ao quadrante numero 4");
		}else { 
			System.out.println("Pertence ao centro");
		}
		
		sc.close();
	}	

}
