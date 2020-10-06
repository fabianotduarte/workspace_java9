package userinterface;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Estacionamento {

	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Fiat","Palio");
		
		v1.acelerar();
		v1.frear();
		
		v2 = new Moto("Honda", "Biz");
		v2.acelerar();
		v2.frear();
	}
}
