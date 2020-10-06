package userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Avaliacao {
	public static void main(String[] args) {
		String resp;
		Scanner teclado = new Scanner(System.in);
		
		
		
		/* alternativa usando vetor estático e não-dimensionável 
		
		QuestaoSimples lista[];
		lista = new QuestaoSimples[5];
		
		lista[0] = new QuestaoSimples("E o XV? ","Jogou como nunca, perdeu como sempre!");
		lista[1] = new QuestaoComDica("Qual a linguagem do curso?", "JAVA","Começa com JA e termina com VA");
		lista[2] = new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O", "NaCl", "H2O", "H2SO4", "H2O2");
		lista[3] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?","Marrom","Cuidado com o nome");
		lista[4] = new QuestaoSimples("Quanto vale 1+1?","2");
		*/
		
		
		/*
		 * método mais longo e mais complexo: a cada objeto recuperado tenho que verificar o tipo de 
		 * objeto instanciado e fazer um tratamento diferente para cada um
		 */
		/*
		for (QuestaoSimples q : lista) {
		   if (q instanceof QuestaoComDica) {
				QuestaoComDica qd = (QuestaoComDica)q; // precisei converter a referência "q" para uma referência do tipo "QuestaoComDica"
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
		*/
		/* este 2o método usando polimorfismo facilita a abstração, pois o conceito comum "aplicar questão" tem
		 * diferentes formas de ser implementado, de acordo com o tipo de objeto (o tipo de questão instanciado)
		 * 
		 * neste caso como pensar? pensamos assim: o conceito é o mesmo? SIM, então ele se torna um método na
		 * superclasse e as demais classes filhas reescrevem a lógica deste método, aproveitando alguma
		 * informação da superclasse e incluindo informações específicas da sua própria definição
		 * 
		 * comparando com a situação anterior, eu troco as 16 linha de decisão + conversão de tipos
		 * (das linhas 27 a 43) por uma única linha  ( a linha 66 aqui embaixo)
		 */
		
		/* alternativa usando vetor dinâmico e redimensionável */
		ArrayList<QuestaoSimples>  lista; // isso significa um vetor redimensionável de objetos do tipo QuestãoSimples e sua descendencia
		lista = new ArrayList<QuestaoSimples>();
		lista.add(new QuestaoSimples("E o XV? ","Jogou como nunca, perdeu como sempre!"));
		lista.add(new QuestaoComDica("Qual a linguagem do curso?", "JAVA","Começa com JA e termina com VA"));
		lista.add(new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O", "NaCl", "H2O", "H2SO4", "H2O2"));
		lista.add(new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?","Marrom","Cuidado com o nome"));
		lista.add(new QuestaoSimples("Quanto vale 1+1?","2"));
		
		
		//lista.remove(1); // ou seja, removi a questao referente ao JAVA... ele vai reorganizar todos os objetos de novo
		
		for (int i=0; i<lista.size(); i++) {
			QuestaoSimples q = lista.get(i); // isso equivale a QuestaoSimples q = lista[i];
			System.out.println(q.aplicarQuestao());
			resp = teclado.nextLine();
			if (q.corrigir(resp)) {
				System.out.println("Parabéns");
			}
			else {
				System.out.println("Errou!");
			}
		}
		
		teclado.close();
	}

}
