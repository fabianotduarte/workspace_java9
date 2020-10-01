
public class WebLoja {
	public static void main(String[] args) {
		Carro c1, c2; // apenas declaro referências
		
		c1 = new Carro(); // aqui eu efetivamente reservo memória
		c2 = new Carro(); // é neste ponto que a Maquina Virtual java ocupa a memória extamente do tamanho da estrutura definida
	    
		// ok, já reservei memória, como fazer pra preencher o objeto?
		// preencho campo a campo (propriedade a propriedade)
		c1.marca      = "Porsche";
		c1.modelo     = "Cayenne";
		c1.ano        = 2020;
		c1.finalPlaca = 8;
		c1.cor        = "Prata";
		c1.preco      = 1350000.00;
		
		c2.marca      = "Chevrolet";
		c2.modelo     = "Corsa";
		c2.ano        = 1997;
		c2.finalPlaca = 9;
		c2.cor        = "Prata com detalhes em branco";
		c2.preco      = 6200.00;
		
		// o "fenômeno" de agruparmos vários tipos de dados em um único
		// novo tipo, chamamos de "Abstração". Agora, quando nos referimos
		// ao tipo "Carro", automaticamente a estrutura toda é referenciada
		
		c1.exibirInfo();
		// ao executar o calcularIPVA, fica o resultado do cálculo
		// armazenado na variável "ipva" declarada na função
		// a instrução abaixo é como se fizéssemos 
		// ipvaC1 = ipva (vindo da função calcularIPVA)
		double ipvaC1 = c1.calcularIPVA();
		System.out.println("IPVA do veiculo = R$ "+ipvaC1);
		double novoPreco = c1.calcularDesconto(15.0);
		System.out.println("O patrao ficou louco!!! O preco é "+novoPreco);
		
		System.out.println("");
		
		c2.exibirInfo();
		double ipvaC2 = c2.calcularIPVA();
		System.out.println("IPVA do veiculo = R$ "+ipvaC2);
		double novoPreco2 = c2.calcularDesconto(3.0);
		System.out.println("Campeao esse aqui dá pra fazer R$ "+novoPreco2);
		
		
	
	}
}
