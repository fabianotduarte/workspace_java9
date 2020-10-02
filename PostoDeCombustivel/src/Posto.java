import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		
//		BombaDeCombustivel b1, b2;
		
//		b1 = new BombaDeCombustivel("Gasolina Podium",6.849);
////		b1.setNome("Gasolina Podium");
////		b1.setValorLitro(6.849);
////		b1.setTotalLitros(0);
////		b1.setTotalPagar(0);
//		
//		b2 = new BombaDeCombustivel("Etanol", 2.599);
////		b2.setNome("Etanol");
////		b2.setValorLitro(2.494);
////		b2.setTotalLitros(0);
////		b2.setTotalPagar(0);
//		
		
		/* agora eu quero fazer um programa onde eu tenha 3, 4, 5 bombas de combustível
		 * e permita ao usuário selecionar cada uma delas
		 */
		
		// A pergunta é: eu preciso ter uma LISTA de bombas de combustível. Como faz?
		// quero montar uma lista de 4 combustíveis
		BombaDeCombustivel lista[];
		lista = new BombaDeCombustivel[5]; // aqui funciona como se eu tivesse 4 variáveis
		
		// que eu preciso fazer agora? criar cada objeto
		
		// lista[0] --> este é um cara que equivale a b0 do tipo "Bomba de combustivel"
		lista[0] = new BombaDeCombustivel("Gasolina Comum", 4.299);
		lista[1] = new BombaDeCombustivel("Gasolina Aditivada", 4.499);
		lista[2] = new BombaDeCombustivel("Etanol", 2.599);
		lista[3] = new BombaDeCombustivel("Diesel", 3.499);
		lista[4] = new BombaDeCombustivel("Diesel S10", 3.999);
		Scanner teclado = new Scanner(System.in);
		int opcao;
		int numBomba;
		double valor;
		
		do {
			System.out.println("Escolha o combustivel:");
			for (int pos=0; pos < lista.length; pos++) {
				System.out.println("   "+pos+" - "+lista[pos].getNome());
			}
			System.out.println("-1 para Encerrar");
			numBomba = teclado.nextInt();
			/* daqui pra frente */
			if (numBomba < 0 || numBomba >= lista.length) {
				System.out.println("Bomba não selecionada");
			}
			else {
				System.out.println("Voce selecionou a bomba "+numBomba);
				
				System.out.println("Quer abastecer por (1) Litros ou (2) valor total?");
				opcao = teclado.nextInt();
			    if (opcao == 1) {
			    	System.out.println("Digite a quantidade de litros");
			    	valor = teclado.nextDouble();
			    	lista[numBomba].abastecerPorLitros(valor);
			    	lista[numBomba].exibirRecibo();
			    }
			    else if (opcao == 2) {
			    	System.out.println("Digite o valor a pagar");
			    	valor = teclado.nextDouble();
			    	lista[numBomba].abastecerPorValor(valor);
			    	lista[numBomba].exibirRecibo();
			    }
			    else {
			    	System.out.println("ERRO - Opcao Invalida");
			    }
			}
			/* até aqui */
			
		} while (numBomba != -1);
		System.out.println("----  Volte sempre!!!");
	}

}
