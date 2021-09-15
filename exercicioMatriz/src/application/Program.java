package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Digite o numero de linhas: ");
				int m = sc.nextInt();
				System.out.println("Digite o numero de colunas: ");
				int n = sc.nextInt();
				
				int[][] mat = new int [m][n];//cria a matriz bidimencional de nome 'mat' recebendo numeros inteiros m como linhas e n como colunas 
				
	// necessário fazer 2 for: o primeiro para linhas e o segundo para colunas
				for(int i=0; i<mat.length; i++) {//o prmeiro for percorre as linhas
					for(int j=0; j<mat[i].length; j++) {//o segundo for percorre as colunas, e ao partir para a segunda linha, reinicia seu valor
						mat[i][j] = sc.nextInt(); 
					}
				}
				
				System.out.println("Digite um numero pertencente a matriz: ");
				int x = sc.nextInt();
				
				for(int i=0; i<mat.length; i++) {
					for(int j=0; j<mat[i].length; j++) {
						if(mat[i][j] == x) {
							System.out.println("Position " + i + ", " + j + ": ");
							if(j>0) {
								System.out.println("Left: " + mat[i][j-1]);
							}
							if(i>0) {
								System.out.println("Up: " + mat[i-1][j]);
							}
							if(j<mat[i].length-1) {
								System.out.println("Right: " + mat[i][j+1]);
							}
							if(i<mat.length-1) {
								System.out.println("Down: " + mat[i+1][j]);
							}
						}
					}
				}
				sc.close();

	}

}
