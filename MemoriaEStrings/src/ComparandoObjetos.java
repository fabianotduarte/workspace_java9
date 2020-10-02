
public class ComparandoObjetos {
	public static void main(String[] args) {
		String s1, s2;
		
		/* o que eu acabo de fazer chama-se Boxing, ou seja: atribuo valor para
		 * um objeto como se ele fosse um tipo primitivo (não explicito o "NEW")
		 */
		/*s1 = "Oi, tudo bem?";
		s2 = "Oi, tudo bem?";
		
		if (s1 == s2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		*/
		
		// neste caso eu tô forçando a VM a criar novos espaços de memória
		s1 = new String("Oi, tudo bem?");
		s2 = new String("Oi, tudo bem?");
		
		if (s1 == s2) {  /// se s1 e s2 apontam para a mesma área
			System.out.println("Mesma área da memória");
		}
		else {
			System.out.println("Áreas de memória distintas");
		}
		
		if (s1.equals(s2)) {  // aqui sim eu comparo conteúdo lexicográfico
			System.out.println("Mesmo conteúdo");
		}
		else {
			System.out.println("Conteúdos distintos");
		}
		
		String s3, s4;
		s3 = "Isidro fala pa buné";
		s4 = "Isidro fala pa buné";
		// aqui s3 e s4 apontarão para o mesmo endereço de memória
		
		// entretanto em Java, STRINGS são objetos considerados IMUTÁVEIS
		
		s4 = "Fica quieto Isidro!";
	    // quando fazemos esta nova atribuição, JAVA cria um NOVO endereço de memória e faz com que
		// s4 aponte para ele
		
		// portanto s3 aponta para "Isidro fala pa buné"
		//        e s4 aponta para "Fica quieto Isidro!"
		System.out.println(s3);
		System.out.println(s4);
		
		/* firula na memória */
		System.out.println(" ------> Firula na memória");
		Produto p=null;
		for (int valor = 1; valor <= 10; valor++) {
			// neste caso, a cada passo do for, eu crio um novo objeto e sobrescrevendo
			// a referência p
			p = new Produto(valor, "Descricao "+valor);
		}
		
		System.gc();
		System.out.println(p.getCodigo()+"- "+p.getDescricao());
		
	}
}
