package model;

// aqui definimos que Estudante vai herdar todas as caracteristicas de PESSOA, além da definição
// das suas próprias características
public class Estudante extends Pessoa {
	private String curso;
	private int    anoConclusao;
	
	public void imprimirInfo() {
		System.out.println("ESTUDANTE: "+super.nome+"/"+super.email+"/"+super.telefone+"/"+this.curso+"/"+this.anoConclusao);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(int anoConclusao) {
		this.anoConclusao = anoConclusao;
	}
	
	

}
