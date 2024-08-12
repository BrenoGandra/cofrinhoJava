package TrabalhoUninter;

public class Real extends Moeda {

	
	public Real(double valor) {
		super(valor);
	}

@Override
public String info () {
	return String.format("Real - Valor: %3f", valor);
}

@Override
public double ConverterValor() {
	// TODO Auto-generated method stub
	return this.valor;
	
}
	

}
