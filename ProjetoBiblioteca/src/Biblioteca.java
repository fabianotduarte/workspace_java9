
public class Biblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3, l4;
		l1 = new Livro("Java Basico  ","Isidro", 2020, "Terror   ",1,2);
		l2 = new Livro("Java Web     ","Isidro", 2020, "Suspense ",1,3);
		l3 = new Livro("Java Avancado","Isidro", 2020, "Ocultismo",1,4);
		l4 = new Livro("Front End    ","Isidro");
//		l1.setTitulo("Java Basico");
//		l1.setAutor("Prof. Isidro");
//		l1.setAnoPublicacao(2020);
//		l1.setCategoria("Terror");
//		l1.setPosE(1);
//		l1.setPosP(2);
		
//		l2.setTitulo("Java WEB");
//		l2.setAutor("Prof. Isidro");
//		l2.setAnoPublicacao(2020);
//		l2.setCategoria("Suspense");
//		l2.setPosE(1);
//		l2.setPosP(3);

//	    l3.setTitulo("Java Avançado");
//	    l3.setAutor("Prof. Isidro");
//	    l3.setAnoPublicacao(2020);
//	    l3.setCategoria("Magias Ocultas");
//	    l3.setPosE(1);
//	    l3.setPosP(4);

	    
//	    l1.imprimir();
//	    l2.imprimir();
//	    l3.imprimir();
	    l4.imprimir();
	    
	    Livro l5;
	    l5 = l4;  // aqui efetivamente eu tenho uma cópia de L4 em L5??
	    
	    l5.setCategoria("Desenvolvimento");
	    l4.imprimir();
	    l4.setTitulo("Javascript");
	    l5.imprimir();
	}

}
