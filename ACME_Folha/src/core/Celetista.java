package core;

public class Celetista extends Funcionario {
	private float salarioBase;
	private float valeTransporte;
	private float auxilioAlimentacao;
	public Celetista(int numRegistro, String nome, float salarioBase, float valeTransporte, float auxilioAlimentacao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.valeTransporte = valeTransporte;
		this.auxilioAlimentacao = auxilioAlimentacao;
	}
	
	public float calcularSalario() {
		return salarioBase + valeTransporte + auxilioAlimentacao;
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getValeTransporte() {
		return valeTransporte;
	}
	public void setValeTransporte(float valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	public float getAuxilioAlimentacao() {
		return auxilioAlimentacao;
	}
	public void setAuxilioAlimentacao(float auxilioAlimentacao) {
		this.auxilioAlimentacao = auxilioAlimentacao;
	}
	
	

}
