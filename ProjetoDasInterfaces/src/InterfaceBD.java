
/* o que é uma interface? Basicamente temos 2 interpretações
 * 
 * 1 - é um "contrato" que se estabelece entre ela e a classe que a implmenta, para que a classe se comprometa
 *     a implementar os métodos descritos na interface
 * 2 - do ponto de vista de programação é uma classe abstrata apenas com métodos abstratos (ou seja, não tenho
 *     nem atributos, muitos menos métodos com corpo de código)
 */
public interface InterfaceBD {
	public void conectar(String usuario, String database);
	public void desconectar(String database);
	public void executar(String comando);
}
