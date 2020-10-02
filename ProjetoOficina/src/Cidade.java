
public class Cidade {
	public static void main(String[] args) {
		Carro c1, c2, c3;
		
		c1 = new Carro("Vokis");
		c2 = new Carro("Fórde");
		c3 = new Carro("Fiote");
		
		Oficina o = new Oficina("Zé das Couve");
		
		c1.andar();
		c2.andar();
		c3.andar();
		
		c1.quebrar();
		c2.quebrar();
		
		
		c1.andar();
		c2.andar();
		c3.andar();
		
		o.realizarReparoDoCarro(c1);  // lá no método da classe Oficina, o parâmetro c recebe a referência c1
		                              // c = c1
		
		
		c1.andar();
		
		o.fazerRevisao(c3);
		
	}

}
