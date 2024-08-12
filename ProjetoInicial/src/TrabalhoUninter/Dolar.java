package TrabalhoUninter;

public class Dolar extends Moeda {
	//escolhi o valor de dolar aproximado para evitar numeros muito quebrados
	private static final double dolarReal = 5;
	 public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	public String info() {
		return String.format("Dolar - Valor: %3f", valor);
		
		
	}

	@Override
	public double ConverterValor() {
		// TODO Auto-generated method stub
		return this.valor*dolarReal;
	}
	

}
