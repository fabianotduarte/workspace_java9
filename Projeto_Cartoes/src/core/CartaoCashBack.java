package core;

public class CartaoCashBack extends CartaoPrePago{
	private int tipo;   // 0 - GOLD / 1 - SILVER / 2 - BRONZE

	public CartaoCashBack(String nomeTitular, String numeroCartao, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(nomeTitular, numeroCartao, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch(tipo) {
			case 0: // gold
				super.saldo += valor * 0.08; // 8% de bônus no crédito
				break;
			case 1: // silver
				super.saldo += valor * 0.05; // 5% de bônus
				break;
			case 2: // bronze
				super.saldo += valor * 0.02; // 2% de bônus
			}
			return true;  // compra e recompensa deram certo! 
		}
		return false;
	}
	
	public String toString() {
		String strTipo;
		if (tipo == 0) {
			strTipo = "GOLD";
		}
		else if (tipo == 1) {
			strTipo = "SILVER";
		}
		else {
			strTipo = "BRONZE";
		}
		return "Cartao Cash Back "+super.numeroCartao+"/"+super.nomeTitular+
			   " ("+super.mesValidade+"/"+super.anoValidade+")  R$ "+super.saldo+" "+strTipo;
	}

	

}
