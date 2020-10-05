package ui;

import model.Estudante;
import model.Pessoa;

public class AplicacaoPrincipal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Estudante e = new Estudante();
		p.setNome("isidro");
		p.setEmail("isidro@isidro.com");
		p.setTelefone("987654321");
		
		
		e.setNome("pedro");
		e.setEmail("pedro@pedro.com");
		e.setTelefone("912345678");
		e.setCurso("Computacao");
		e.setAnoConclusao(2020);
		
		p.imprimirInfo();
		
		e.imprimirInfo();
	}

}
