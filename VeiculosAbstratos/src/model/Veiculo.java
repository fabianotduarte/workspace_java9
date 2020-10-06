package model;

/* Por que criamos classes abstratas? Para termos um "TEMPLATE" de como as classes filhas devem
 *  ser definidas. Desde a sua estrutura mínima até definindo um "compromisso" (ou "contrato") na qual
 *  as classes filhas obrigam-se a cumprir. De que maneira? Definindo métodos abstratos na classe pai
 *  e as classes filhas inserindo a lógica destes métodos
 */
public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	
	
	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/* aqui está o grande trunfo das classes abstratas: defino O QUE as filhas devem implementar
	 * e o COMO? Fica sob responsabilidade de cada uma das classes filhas
	 */
	public abstract void acelerar();
	public abstract void frear();
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
