package model;

public class ContaEspecial extends Conta {
	
	private float limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float limite) {
		super(nomeTitular,cpf,numeroConta);
		this.limite = limite;
	}
	
	
	public boolean debitar(float valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;
	}


	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}
	

}
