
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	
	/* aqui vamos criar sobrecargas para o método setTime
	 *  3 diferentes "versões" do mesmo método
	 *  	versão 1 - 3 parâmetros inteiros (h,m,s)
	 *  	versão 2 - 2 parâmetros inteiros (h,m)
	 *  	versão 3 - 1 parâmetro  inteiro  (h)
	 */
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	public void setTime(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
	
	public String exibirHoraUniversal() {
		String res;
		res = formataNumero(hora) + ":" + formataNumero(minu) + ":" + formataNumero(segu);
		return res;
	}
	
	public String exibirHoraPadrao() {
		int novaHora;
		String sufixo;
		if (this.hora == 0) {
			novaHora = 12;
			sufixo = "AM";
		}
		else if (this.hora == 12) {
			novaHora = 12;
			sufixo = "PM";
		}
		else if (this.hora >= 1 && this.hora <= 11) {
			novaHora = hora;
			sufixo = "AM";
		}
		else {
			novaHora = hora - 12;
			sufixo = "PM";
		}
		
		String res = formataNumero(novaHora)+":"+formataNumero(minu)+":"+formataNumero(segu)+" "+sufixo;
		return res;
	}
	
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}
		else {
			return String.valueOf(num);  // retorno o valor numérico convertido para texto
		}
	}
}
