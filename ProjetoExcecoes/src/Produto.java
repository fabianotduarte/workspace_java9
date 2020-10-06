
public class Produto {

	private int    id;
	private String nome;
	private float  preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0) {
			throw new IsiException("ID de produto não pode ser zero ou negativo!");
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new IsiException("Nome do produto não pode estar vazio!");
		}
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if (preco < 0) {
			throw new IsiException("Preço nao pode ser negativo!");
		}
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
