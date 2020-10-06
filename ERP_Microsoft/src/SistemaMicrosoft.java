
public class SistemaMicrosoft {
	public static void main(String[] args) {
		InterfaceERPMicrosoft ierp;
		
		System.out.println("Sistema Microsoft");
		
		ierp = new ObjetoExtrator();
		ierp.extractInvoiceData("notafiscal.xml");
		
		
	}

}
