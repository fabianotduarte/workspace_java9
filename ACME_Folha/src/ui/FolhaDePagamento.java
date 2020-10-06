package ui;

import java.text.NumberFormat;
import java.util.ArrayList;

import core.Celetista;
import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		// importo a biblioteca para formatar moeda
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // getCurrentInstance recupera o formato de moedo
		nf.setMinimumFractionDigits(2);  // aqui defino as casas decimais
		
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe       (1234, "Jose Chefe da Silva"  , 5000.0f, 15.0f, 630.0f));
		lista.add(new Comissionado(1235, "João Comissionado"    , 3450.0f, 12.5f));
		lista.add(new Horista     (1236, "Paula Horista"        , 85, 77.35f));
		lista.add(new Horista     (1237, "Pedro Horista Santos" , 77, 65.43f));
		lista.add(new Empreiteiro (1238, "Maria Empreiteira",    2865.78f));
		lista.add(new Empreiteiro (1239, "Alberto Autonomo",     1973.54f));
		lista.add(new Celetista   (1230, "Carlos Celetista",     2035.00f, 389.00f, 450.0f));
		
		System.out.println("      F O L H A     D E    P A G A M E N T O      ");
		System.out.println("--------------------------------------------------");
		for (Funcionario f: lista) {
			System.out.printf("   %-30s  %s\n", f.getNome(), nf.format(f.calcularSalario()));
		}
		
	}

}
