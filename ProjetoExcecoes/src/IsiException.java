/* se uma exceção é filha de RuntimeException - ela é não-verificada
 * se uma exceção é filha de Exception        - ela é verificada!
 */


public class IsiException extends Exception{
	public IsiException(String msg) {
		super(msg);
	}
}
