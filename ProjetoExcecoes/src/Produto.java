
public class Produto {

	private int    id;
	private String nome;
	private float  preco;
	
	public int getId() {
		return id;
	}
	
	/*
	 * formalmente uma exceção não-verificada não precisa da declaração de lançamento no cabeçalho do método
	 * já nas exceções VERIFICADAS, a cláusula THROWS é obrigatória no cabeçalho do método
	 */
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID de produto não pode ser zero ou negativo!");
		}
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws IsiException {
		if (nome == null || nome.length() == 0) {
			throw new IsiException("Nome do produto não pode estar vazio!");
		}
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) throws IsiException {
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
