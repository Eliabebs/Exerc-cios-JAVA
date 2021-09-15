package entitie;

public class CurrencyConverter {
	public double cotacao;
	public double qntdCompra;

	public double conversao() {
		return qntdCompra * cotacao;
	}

	public double descontoIof() {
		return conversao() * 0.06;
	}

	public double total() {
		return conversao() + descontoIof();
	}
}
