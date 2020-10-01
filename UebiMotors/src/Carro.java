/* esta classe Carro não terá método MAIN, pois nela
 * teremos apenas a definição de como é o novo tipo de dado 
 * CARRO, ou seja, teremos aqui definições de variáveis
 */
public class Carro {
	// estas variáveis são chamadas de ATRIBUTOS ou PROPRIEDADES
	String marca;
	String modelo;
	int    ano;
	String cor;
	int    finalPlaca;
	double preco;

	/* posso também declarar funcionalidades para o objeto, capazes
	 * de, por exemplo: receber dados de outras classes, retornar
	 * valores calculados ou não ou simplesmente fazer uma ação
	 *
	 * qual é a forma dessa funcionalidade? Um bloco de código
	 *  
	 *  
	 *  NOME_DA_FUNCIONALIDADE(){
	 *    ... comandos...
	 *  }
	 * 
	 * 
	 * porém toda funcionalidade, por ser um trecho de código também
	 * trabalha no modelo E -> P -> S
	 * 
	 * TIPO_SAIDA NOME_DA_FUNCIONALIDADE(VARIAVEIS_DE_ENTRADA){
	 *    ... comandos...
	 *  }
	 *  
	 *  tipos possíveis de saída:
	 *  	int, float, double, etc..
	 *      void --> aqui é quando a funcionalidade não gera valores de saída para o programa principal
	 * 
	 */
	
	// exemplo: vamos fazer um método (funcionalide) para exibir as informações
	void exibirInfo() {
		System.out.println("Carro: "+marca+"-"+modelo);
		System.out.println("   Ano: "+ano+"  Final Placa "+finalPlaca);
		System.out.println("   Cor: "+cor+"  Preço R$ "+preco);
	}
	
	// a função calcularIPVA vai retornar um valor que, ao ser chamado na função principal, deve ser atribuído a uma variavel
	double calcularIPVA() {  
		double ipva;
		if (ano < 2000) {
			ipva = 0.0;
		}
		else {
			ipva = preco * 0.04;
		}
		// aqui é fundamental: toda função que é declarada com tipo
		// diferente de VOID, OBRIGATORIAMENTE tem que ter a instrução
		// RETURN
		return ipva;
	}
	
	// neste caso, o método calcularDesconto recebe como parâmetro
	// o valor do percentual a ser descontado
	// a entrada é o valor do percentual
	// a saída é o novo valor do veículo com desconto (descontando este percentual)
	double calcularDesconto(double percentual) {
		double desconto = preco - preco*percentual/100;
		return desconto;
	}
	
}
