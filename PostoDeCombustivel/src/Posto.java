
public class Posto {
	public static void main(String[] args) {
		
		BombaDeCombustivel b1, b2;
		
		b1 = new BombaDeCombustivel();
		b1.setNome("Gasolina Podium");
		b1.setValorLitro(6.849);
		b1.setTotalLitros(0);
		b1.setTotalPagar(0);
		
		b2 = new BombaDeCombustivel();
		b2.setNome("Etanol");
		b2.setValorLitro(2.494);
		b2.setTotalLitros(0);
		b2.setTotalPagar(0);
		
		b1.abastecerPorLitros(45);
		b1.exibirRecibo();
		System.out.println("**********");
		b2.abastecerPorValor(80);
		b2.exibirRecibo();
	}

}
