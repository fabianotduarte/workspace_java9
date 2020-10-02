
public class Produto {
	private int codigo;
	private String descricao;
	
	
	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void finalize() {
		System.out.println("Garbage colector prestes a remover o produto de codigo "+codigo);
	}
	

}
