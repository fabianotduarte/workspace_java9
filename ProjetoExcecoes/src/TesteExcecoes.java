import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecoes {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int id;
		String strId;
		String strPreco;
		String nome;
		float preco;

		int opcao = 1;

		do {

			try {
				Produto p = new Produto();
				System.out.println("Digite o ID do produto");
				strId = teclado.nextLine();
				id = Integer.parseInt(strId);
				p.setId(id);
				System.out.println("Digite o nome do produto");
				nome = teclado.nextLine();
				p.setNome(nome);
				System.out.println("Digite o preço do produto");
				strPreco = teclado.nextLine();
				preco = Float.parseFloat(strPreco);
				p.setPreco(preco);

				System.out.println("Produto cadastrado " + p);
				
				System.out.println("Quer continuar? 1- Sim / 0- Nao");
				opcao = Integer.parseInt(teclado.nextLine());
			}
			catch (IsiException ex) {
				System.out.println("Erro na regra de negócio");
				System.out.println("    --> "+ex.getMessage());
			}
			catch (NumberFormatException ex) {
				System.out.println("O valor digitado tem que ser um número");
			} catch (Exception ex) {
				System.out.println("Tipo do erro: "+ex.getClass().getName());
				System.out.println("ERRO: " + ex.getMessage());
			}

		} while (opcao != 0);
	}

}
