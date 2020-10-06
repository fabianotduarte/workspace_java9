
public class ObjetoExtrator implements InterfaceERPMicrosoft, InterfaceERPOracle, InterfaceERPSAP{
	
	// esse método aqui é a minha "inteligência"
	public void fazerExtracaoDeDados(String dados) {
		System.out.println("Extraindo dados...."+dados);
	}

	
	// aqui é pra eu me integrar ao ERAP da SAP
	@Override
	public void processInvoiceXMLContent(String xmlContent) {
		fazerExtracaoDeDados(xmlContent);
		
	}

	
	// aqui é pra eu me integrar com o ERP da SAP
	@Override
	public void processarInvoice(String txtInvoice) {
		fazerExtracaoDeDados(txtInvoice);
		
	}

	// aqui é pra eu me integrar com o ERP da MS
	@Override
	public void extractInvoiceData(String fileName) {
		fazerExtracaoDeDados(fileName);
		
	}

}
