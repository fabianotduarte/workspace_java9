
public class SistemaSAP {
	public static void main(String[] args) {
		
		InterfaceERPSAP ierp;
		
		
		System.out.println("Sistema SAP");
		ierp = new ObjetoExtrator();
		ierp.processInvoiceXMLContent("<xml> NOTA FISCAL </xml>");
	}

}
