import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Digite a:");
		a = teclado.nextInt();
		System.out.println("Digite b:");
		b = teclado.nextInt();
		
		c = a + b;
		
		d = a + b + c;
		
		System.out.println("Valor de c = " + c);
		System.out.println("Valor de d = " + d);
		
		teclado.close();
	}
}

