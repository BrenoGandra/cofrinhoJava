package TrabalhoUninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList <Moeda> moedas;

	public Cofrinho () {
		this.moedas = new ArrayList <>();
	}
	


	//aqui começa o metodo de adicionar moedas
	public void Adicionar(Moeda m) {
		moedas.add(m);
		
		
	}
	
	
	//aqui começa o metodo de remover moedas
	public void Remover (Moeda m) {
		moedas.remove(m);
		
	}
	
	//aqui serve para pegar as moedas selecionadas
	public ArrayList <Moeda> pMoedas() {
		return moedas;
		
	}
	
	
	
	//aqui começa o metodo de listar moedas 
	
	public void ListagemMoedas () {
		if (moedas.isEmpty()) {
			System.out.println("Seu cofrinho está vazio.");
		}
		else {
			for (Moeda m : moedas) {
				System.out.println(m.info());
			}
		}
	}
	
	//aqui começa o metodo para converter os valores das moedas no cofre e mostrar o total em reais
	public double totalConvertido() {
		double total = 0;
		for (Moeda m : moedas) {
			total += m.ConverterValor();
		}
		return total;
	}
	

}
