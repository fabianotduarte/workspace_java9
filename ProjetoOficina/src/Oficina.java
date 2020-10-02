
public class Oficina {

	private String dono;
	
	public Oficina(String dono) {
		this.dono = dono;
	}
	
	public void realizarReparoDoCarro(Carro c) {
		System.out.println("***** Oficina do "+dono+" *****");
		c.consertar();
		System.out.println("Seu serviço custou R$ xxxxx,xx - aproveite o dia!");
	}
	
	public void fazerRevisao(Carro c) {
		System.out.println("Fazendo revisao do carro "+c.getMarca());
	}
}

