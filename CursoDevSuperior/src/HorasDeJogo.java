import java.util.Scanner;
public class HorasDeJogo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int hInicial;
		System.out.println("Digite o horario inicial");
		hInicial = leitor.nextInt();
		int hFinal;
		System.out.println("Digite o horario final");		
		hFinal = leitor.nextInt();
		
		if(hInicial > hFinal) { 
			System.out.println("A duração do jogo foi de " + (24 - (hInicial - hFinal)) + " horas");
		} else if(hInicial < hFinal) { 
			System.out.println("A duração do jogo foi de: " + (hFinal - hInicial) + " horas");
		} else { 
			System.out.println("O jogo durou 24 Horas");
		}
		
		leitor.close();
	}

}
