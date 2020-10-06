
public class BDSqlServer implements InterfaceBD{

	@Override
	public void conectar(String usuario, String database) {
		System.out.println("Conectando on "+usuario+"/"+database);
		
	}

	@Override
	public void desconectar(String database) {
		System.out.println("Desconnecting do "+database);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mssql>"+comando);
		
	}

}
