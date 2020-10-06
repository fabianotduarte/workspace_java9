/* isso aqui signfica que nossa classe BDMySQL está comprometida com InterfaceBD, ou seja, a classe
 * irá colocar lógica nos métodos que foram definidos na interface
 * 
 */
public class BDMySQL implements InterfaceBD {

	@Override
	public void conectar(String usuario, String database) {
		System.out.println("Conectando no banco MySQL "+usuario+"@"+database);
	}

	@Override
	public void desconectar(String database) {
		System.out.println("Desconectando da base MySQL:"+database);
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql>"+comando);
	}
	

}
