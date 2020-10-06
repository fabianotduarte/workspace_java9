package core;

public class Horista extends Funcionario {
	private int   numHoras;
	private float valorHora;
	
	public Horista(int numRegistro, String nome, int numHoras, float valorHora) {
		super(numRegistro, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}
	
	public float calcularSalario() {
		return this.numHoras * this.valorHora;
	}
	
	
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
