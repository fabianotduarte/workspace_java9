
public class BombaDeCombustivel {
	private String nome;
	private double valorLitro;
	private double totalPagar;
	private double totalLitros;
	
	
	public BombaDeCombustivel(String nome, double valorLitro) {
		this.nome = nome;
		this.valorLitro = valorLitro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	
	public void abastecerPorLitros(double litros) {
		this.totalLitros = litros;
		this.totalPagar = litros * this.valorLitro;
	}
	
	public void abastecerPorValor(double total) {
		this.totalPagar = total;
		this.totalLitros = total / valorLitro;
	}
	
	public void exibirRecibo() {
		System.out.println("-----------------------------");
		System.out.println(" IsidroCorp(r) Gas & Energy  ");
		System.out.println("-----------------------------");
		System.out.println("      R E C I B O            ");
		System.out.println("Combustivel "+ this.nome);
		System.out.printf ("Preço Litro R$ %8.3f\n", valorLitro);
		System.out.printf ("Total Litros   %8.2f\n", totalLitros);
		System.out.printf ("Total Pago  R$ %8.2f\n", totalPagar);
		System.out.println("-----------------------------");
	}
	
	

}
