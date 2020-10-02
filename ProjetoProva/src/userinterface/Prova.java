package userinterface;

import java.util.Scanner;

import model.Questao;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Questao listaQuestoes[];
		listaQuestoes = new Questao[5];
		int pontos=0;

		String resposta;
		listaQuestoes[0] = new Questao("Quem descobriu o Brasa?", "PA Cabral");
		listaQuestoes[1] = new Questao("Quem ganhou o sub-20 do paulista serie B em 2019?", "XV de Jau");
		listaQuestoes[2] = new Questao("Quanto vale 2+2?", "4");
		listaQuestoes[3] = new Questao("Qual a formula da agua?", "H2O");
		listaQuestoes[4] = new Questao("Qual a cor do cavalo Branco de Napoleao?", "Marrom");

		// existe uma 2a variação da instrução FOR que é EXCLUSIVA para Listas/Conjuntos
		
		// for (Classe var : lista) { ...}
		for (Questao q : listaQuestoes) {  // leio assim: para cada Questão q na lista 
			System.out.println(q.exibirQuestao());
			resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				pontos++;
			}
			
		}
		// equivale a: for (int pos=0; pos<listaQuestoes.length; pos++){
		//                 Questao q = listaQuestoes[pos];
		//             ...}
		
		
//		for (int pos = 0; pos < listaQuestoes.length; pos++) {
//			System.out.println(listaQuestoes[pos].exibirQuestao());
//			resposta = teclado.nextLine();
//			if (listaQuestoes[pos].corrigir(resposta)) {
//				pontos++;
//			} 
////			else {
////				System.out.println("Errrroooooouuu - mentalize o Faustao falando");
////			}
//		}
		System.out.println("Voce acertou "+pontos+" de um total de "+listaQuestoes.length);

	}

}
