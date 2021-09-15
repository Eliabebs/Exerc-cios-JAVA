
public class ImparOuPar {

	public static void main(String[] args) {
//		Escreva um programa que imprima na tela a soma dos números ímpares entre
//		0 e 30 e a multiplicação dos números pares entre 0 e 30.
		
		long impar = 0, par = 1; 
		
		for(int i = 1; i <= 30; i++) { 
			if(i%2==0) {
				par  *=  i;
			} else { 
			 impar += i; 
			}
		}
		System.out.println("A soma dos números impares é:" + impar);
		System.out.println(" A multiplicação dos numeros pares é:" + par);
		
	}

}
