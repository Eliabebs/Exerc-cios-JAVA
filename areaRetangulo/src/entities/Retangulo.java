package entities;

public class Retangulo {
	public double base;
	public double altura;

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return (base + altura) * 2;
	}

	public double diagonal() {
		return Math.sqrt(base * base + altura * altura);
	}
}
