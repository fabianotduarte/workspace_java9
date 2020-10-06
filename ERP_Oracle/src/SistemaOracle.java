
public class SistemaOracle {
	public static void main(String[] args) {
		
		InterfaceERPOracle ierp;
		
		System.out.println("Sistema ERP ORacle!!!");
		
		ierp = new ObjetoExtrator();
		ierp.processarInvoice("Dados da NOTA FISCAL");
	}

}
