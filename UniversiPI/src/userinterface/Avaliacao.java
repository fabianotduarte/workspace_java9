package userinterface;

import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Avaliacao {
	public static void main(String[] args) {
		String resp;
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples lista[];
		lista = new QuestaoSimples[5];
		
		lista[0] = new QuestaoSimples("E o XV? ","Jogou como nunca, perdeu como sempre!");
		lista[1] = new QuestaoComDica("Qual a linguagem do curso?", "JAVA","Começa com JA e termina com VA");
		lista[2] = new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O", "NaCl", "H2O", "H2SO4", "H2O2");
		lista[3] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?","Marrom","Cuidado com o nome");
		lista[4] = new QuestaoSimples("Quanto vale 1+1?","2");
		
		/*
		 * método mais longo e mais complexo: a cada objeto recuperado tenho que verificar o tipo de 
		 * objeto instanciado e fazer um tratamento diferente para cada um
		 */
		for (QuestaoSimples q : lista) {
		   if (q instanceof QuestaoComDica) {
				QuestaoComDica qd = (QuestaoComDica)q;
				System.out.println(qd.getEnunciado());
				System.out.println("  DICA:"+qd.getDica());
			}
			else if (q instanceof QuestaoMultiplaEscolha) {
				QuestaoMultiplaEscolha qm = (QuestaoMultiplaEscolha)q;
				System.out.println(qm.getEnunciado());
				System.out.println("a. "+qm.getAlt1());
				System.out.println("b. "+qm.getAlt2());
				System.out.println("c. "+qm.getAlt3());
				System.out.println("d. "+qm.getAlt4());
			}
			else if (q instanceof QuestaoSimples) {  // o objeto q é do tipo "QuestaoSimples?"
				System.out.println(q.getEnunciado());
			}
		   
		   resp = teclado.nextLine();
		   if (q.corrigir(resp)) {
			   System.out.println("2 palavras: para bens");
		   }
		   else {
			   System.out.println("Erroooouuuuuuu");
		   }
		}
		
		/* este 2o método usando polimorfismo facilita a abstração, pois o conceito comum "aplicar questão" tem
		 * diferentes formas de ser implementado, de acordo com o tipo de objeto (o tipo de questão instanciado)
		 * 
		 * neste caso como pensar? pensamos assim: o conceito é o mesmo? SIM, então ele se torna um método na
		 * superclasse e as demais classes filhas reescrevem a lógica deste método, aproveitando alguma
		 * informação da superclasse e incluindo informações específicas da sua própria definição
		 */
		
//		for (QuestaoSimples q: lista) {
//			System.out.println(q.aplicarQuestao());
//			resp = teclado.nextLine();
//			if (q.corrigir(resp)) {
//				System.out.println("Parabéns");
//			}
//			else {
//				System.out.println("Errou!");
//			}
//		}
		
		teclado.close();
	}

}
