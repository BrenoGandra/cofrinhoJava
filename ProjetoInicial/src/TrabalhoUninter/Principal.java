package TrabalhoUninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//preferi definir os itens que eu usaria no começo do código
		int tipoMoeda;
		int opcao;
		Scanner teclado = new Scanner(System.in);	

		Cofrinho cofre = new Cofrinho ();	
		//usei o do para iniciar o loop projeto 
		do {
		System.out.println("Bem vindo ao seu Cofrinho!");
		System.out.println("--------------------------");
		System.out.println("Menu: ");
		System.out.println();
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Mostrar o total em reais");
		System.out.println("5-Encerrar");
		
		opcao = teclado.nextInt();
		
		
			
			switch (opcao) {
			
			//adicionar moedas
			case 1:
				tipoMoeda =0;
				while(tipoMoeda < 1 || tipoMoeda >3) {
				System.out.println("Escolha um tipo de moeda:");
				System.out.println("1-Real");
				System.out.println("2-Dolar");
				System.out.println("3-Euro");
				System.out.println();
	
				tipoMoeda = teclado.nextInt();
				}
				System.out.println("Digite o valor da moeda: ");
				  double valor = teclado.nextInt();
				  Moeda m = null;
				  
				  if (tipoMoeda == 1) {
					  m = new Real (valor);
					  
				  }
				  
				  else if (tipoMoeda == 2) {
					  m = new Dolar (valor);
				  }
				
				  else if (tipoMoeda == 3) {
					  m = new Euro (valor);
				  }
				
				if (m != null) {
					cofre.Adicionar(m);
					System.out.println("-------------------------------------");
					System.out.println("Processo concluído.");
					System.out.println("Sua moeda foi adicionada com Sucesso!");
					System.out.println();
				}
				else {
				 System.out.println("Selecione um tipo de moeda válido.");
				}
				
				break;		
				
			//remover moedas
			case 2:
				if (!cofre.pMoedas().isEmpty()) {
					Moeda mRemovida = cofre.pMoedas().get(cofre.pMoedas().size() - 1);
					cofre.Remover(mRemovida);
					System.out.println("Processo finalizado.");
					System.out.println("Moeda removida com sucesso!");
					
				}
				else {
					System.out.println("Você não possui moedas para remover.");
				}
				break;
				
			//listar moedas
			case 3:
				cofre.ListagemMoedas();
				break;
				
				//calcular o valor obtido em real
			case 4:
				double calcularReal = cofre.totalConvertido();
				System.out.println("O valor total é: R$" + calcularReal);
				break;
				
			//encerrar
			case 5:
				break;
				//aqui é a parte que retorna caso o usuário digite um valor invalido, possibilitando que ele recomece no cofrinho
				default:
					System.out.println("Opção Incorreta!");
					System.out.println("Selecione um número de 1 a 4!");
					System.out.println("---------------------------------");
					System.out.println("Bem vindo ao seu Cofrinho!");
					System.out.println("--------------------------");
					System.out.println("Menu: ");
					System.out.println();
					System.out.println("1-Adicionar Moeda");
					System.out.println("2-Remover Moeda");
					System.out.println("3-Listar Moedas");
					System.out.println("4-Mostrar o total em reais");
					System.out.println("5-Encerrar");
					 
				opcao = teclado.nextInt();
			
			}
			
		//aqui finaliza o do com while
		} while (opcao != 5);
		//aqui finaliza o Scanner
		teclado.close();

			
		
	}

}
