/* quero definir um novo tipo de dado */
public class Empregado {
	
	/* quais infomrações ele armazena? */
	
	/*
	 * defino os atributos com o modificador "PRIVATE" para que a estrutura do objeto
	 * não seja acesível de outra classe. Isso preserva o acesso, evitando, por exemplo
	 * que outra classes atribuam/consultem valores indevidamente
	 *
	 * mas então como fazer para acessá-los? CRIANDO FUNCIONALIDADES
	 */
	private String nome;
	private String cargo;
	private double salario;
	
	/* o que ele tem de funcionalidades? */
	// um método para modificar o valor do atributo (por que isso? pq eu posso, por exemplo,
	// criar uma rotina de validação antes de atribuir
	
	// um método para consultar o valor do nome, que pode até vir com uma formatação diferente
	
	// em casos de coincidência de nomenclatura entre atributos e parâmetros,
	// fica OBRIGATÓRIO o uso do operador THIS (referindo-se ao atributo)
	// para diferencia-lo do nome do parâmetro
	
	
	/* funcionalidade1: mostrar as informações do empregado */
	void imprimir() {
		System.out.println("Nome: "+nome+"/"+cargo+"  R$ "+salario);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/* funcionalidade2: aumentar (modificar) o salário do empregado */
	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual/100;
	}

}
