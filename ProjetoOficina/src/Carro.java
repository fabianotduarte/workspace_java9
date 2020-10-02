
public class Carro {
	private String marca;
	private boolean funcionando;
	
	public Carro(String marca) {
		this.marca = marca;
		this.funcionando = true;
	}
	
	public void andar() {
		if (funcionando) {
			System.out.println(marca+ " vruuummmm");
		}
		else {
			System.out.println("Carro "+marca+" nao consegue funcionar...");
		}
	}
	
	public void quebrar() {
		funcionando = false;
		System.out.println(":( Carro "+marca+" quebrou");
	}

	public void consertar() {
		funcionando = true;
		System.out.println(":) Carro "+marca+" novo em folha!");
	}
	
	public String getMarca() {
		return marca;
	}
}
