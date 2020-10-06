package core;
// classe Funcionario atua como um "Template" para suas classes filhas
public abstract class Funcionario {
	protected int    numRegistro;
	protected String nome;
	
	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
	
	// definindo o "termo de compromisso" das classes filhas
	public abstract float calcularSalario();
	
	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
