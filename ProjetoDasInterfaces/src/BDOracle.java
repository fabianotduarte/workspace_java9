
public class BDOracle implements InterfaceBD {

	@Override
	public void conectar(String usuario, String database) {
		System.out.println("Connecting on Oracle Database "+database+" with user "+usuario);
		
	}

	@Override
	public void desconectar(String database) {
		System.out.println("Disconnecting from "+database);		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle>"+comando);
		
	}

}
