package userinterface;

import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		
		// passo 1 - criei ambos os objetos
		Conta         c = new Conta("Isidro","123.456.789-00",1234);
		ContaEspecial e = new ContaEspecial("Nicolas","987.654.321-00",9876,200);  // crio a conta especial com limite
		
		// posso 2 - fiz um crédito de R$ 100,00 em ambas (entretanto a conta especial ainda tem um limite de R$ 200,00) 
		c.creditar(100);
		e.creditar(100);
		
		// passo 3 - mostrei as informações de ambos os objetos
		System.out.println(c.getNomeTitular()+"/"+c.getCpf()+"/"+c.getNumeroConta()+"  R$ "+c.getSaldo());
		System.out.println(e.getNomeTitular()+"/"+e.getCpf()+"/"+e.getNumeroConta()+"  R$ "+e.getSaldo()+" R$ "+e.getLimite());
		
		
		// passo 4 - vou tentar sacar 145 reais de uma conta com apenas R$ 100,00 de saldo
		System.out.println("\n\n ---> Manipulando a conta normal...");
		if (c.debitar(145)) {
			System.out.println("Saque efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c.getNomeTitular()+"/"+c.getCpf()+"/"+c.getNumeroConta()+"  R$ "+c.getSaldo());
		
		// passo 5 - agora vou tentar sacar os mesmos 145 reais de uma conta especial com R$ 100,00 de saldo e R$ 200,00 de limite
		System.out.println("\n\n ---> Manipulando a conta especial...");
		if (e.debitar(145)) {
			System.out.println("Saque efetuado na conta especial");
		}
		else {
			System.out.println("Nao tem saldo nem limite disponíveis");
		}
		System.out.println(e.getNomeTitular()+"/"+e.getCpf()+"/"+e.getNumeroConta()+"  R$ "+e.getSaldo()+" R$ "+e.getLimite());
		
	}

}
