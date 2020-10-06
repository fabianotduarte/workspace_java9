import java.util.Scanner;
public class VariasLeituras{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int numero;
		float numeroFloat;
		String strNumero;
		String texto;

		System.out.println("Digite um numero");
		strNumero = teclado.nextLine();
		numero = Integer.parseInt(strNumero);
		System.out.println("Digite um texto");
		texto = teclado.nextLine();
		System.out.println("Digite um valor Real");
		strNumero = teclado.nextLine();
		numeroFloat = Float.parseFloat(strNumero);

		System.out.println("Voce digitou : "+numero+"/"+texto+"/"+numeroFloat);
	}
}