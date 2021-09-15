
public class TrocaNumero {
	
	static int a = 30; 
	static int b = 50; 
	static int aux ; 
	
	public static int trocaA() { 
		aux = b;
		return aux;
	}
	
	public static int trocaB() { 
		b = a;
		return b;
	}


	public static void main(String[] args) {
//		Crie uma classe java TrocaNumero que contenha um método que receba dois
//		números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os
//		dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
//		ordem NumA = 9 e NumB = 5.
		
		TrocaNumero trocas = new TrocaNumero();
		
		
		System.out.println("O valor de A era: " + a + " e agora ficou: " + trocaA());
		System.out.println("O valor de B era " + b + " e agora ficou " + trocaB());
		
		
	}

}
