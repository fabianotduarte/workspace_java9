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
		lista = new BombaDeCombustivel[4]; // aqui funciona como se eu tivesse 4 variáveis
		
		// que eu preciso fazer agora? criar cada objeto
		
		// lista[0] --> este é um cara que equivale a b0 do tipo "Bomba de combustivel"
		lista[0] = new BombaDeCombustivel("Gasolina Comum", 4.299);
		lista[1] = new BombaDeCombustivel("Gasolina Aditivada", 4.499);
		lista[2] = new BombaDeCombustivel("Etanol", 2.599);
		lista[3] = new BombaDeCombustivel("Diesel", 3.499);
		Scanner teclado = new Scanner(System.in);
		int opcao;
		int numBomba;
		double valor;
		
		do {
			System.out.println("Escolha o combustivel:");
			System.out.println("0 - "+lista[0].getNome());
			System.out.println("1 - "+lista[1].getNome());
			System.out.println("2 - "+lista[2].getNome());
			System.out.println("3 - "+lista[3].getNome());
			System.out.println("-1 para Encerrar");
			numBomba = teclado.nextInt();
		} while (numBomba != -1);
		System.out.println("----  Volte sempre!!!");
	}

}
