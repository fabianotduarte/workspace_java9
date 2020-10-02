package model;

public class Questao {
	private String enunciado;
	private String gabarito;
	
	public Questao(String enunciado, String gabarito) {
		super();
		this.enunciado = enunciado;
		this.gabarito = gabarito;
	}
	
	public String exibirQuestao() {
		return enunciado;
	}
	
	public boolean corrigir(String respostaUsuario) {
		return this.gabarito.equals(respostaUsuario);
//		if (this.gabarito.equals(respostaUsuario)) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	

}
