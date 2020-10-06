package model;

/* Agora a classe filha está comprometida a expandir a classe-pai
 * Só que de uma maneira mais "forte". Além de herdar a estrutura, a classe filha compromete-se (obriga-se) a
 * implementar a lógica dos métodos definidos na classe pai.
 * 
 * quais são esses métodos? acelerar e frear
 */
public class Moto extends Veiculo {

	public Moto(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.modelo+" acelera na mão! PROPROPROPROPRO");
		
	}

	@Override
	public void frear() {
		System.out.println("Moto "+super.modelo+" freia no pé!");
	}
	
	

	
}
