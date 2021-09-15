package entities;

public class Aluno {
	public String nome;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;
	
	public double notaFinal() {
		return notaPrimeiroTrimestre+notaSegundoTrimestre+notaTerceiroTrimestre;
	}
	public double pontosPendentes() {
		return 100-notaFinal();
	}
	public String resultado() {
		if(notaFinal() >= 60) {
			return "PASS";
		}else { 
			return "FAILED, MISSING " + pontosPendentes();
		}
	}
}
