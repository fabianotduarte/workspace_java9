package model;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override  // estou tornando explícita a "sobrescrita do método acelerar" 
	public void acelerar() {
	   System.out.println("Carro "+super.modelo+" acelera no pé");
	}

	public void frear() {
		System.out.println("Carro "+super.modelo+" freia na mão");
	}
}
