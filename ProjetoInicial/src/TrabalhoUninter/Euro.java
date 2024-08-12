package TrabalhoUninter;

public class Euro extends Moeda {
	//assim como em dolar eu preferi deixar um numero aproximado do euro para evitar numeros muito quebrados
	private static final double euroReal = 5.5;
	
	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	//tive problemas com info() sozinho e entao resolvi retornar em string
	public String info() {
		return String.format("Euro: %s - Valor: %3f", valor);
		
		
	}

	@Override
	public double ConverterValor() {
		// TODO Auto-generated method stub
		return this.valor *euroReal;
	}

}
