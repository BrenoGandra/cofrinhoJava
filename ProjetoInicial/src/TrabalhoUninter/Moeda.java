package TrabalhoUninter;

public abstract class Moeda {

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	//aqui eu criei o metodo que mostrara o valor convertido 
	public abstract double ConverterValor();

	protected double valor;
	
	public String info() {
		return String.format("Moeda: %s - Valor: %.3f", this.getClass().getSimpleName(), valor);
		
	}
}
