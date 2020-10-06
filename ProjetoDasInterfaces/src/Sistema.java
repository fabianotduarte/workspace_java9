
public class Sistema {
	public static void main(String[] args) {
		InterfaceBD ibd;
		
		ibd = new BDSqlServer(); // BDOracle(); //BDMySQL();
		
		ibd.conectar("admin","db_vendas");
		ibd.executar("Select * from tbl_produtos");
		ibd.desconectar("db_vendas");
	}

}
