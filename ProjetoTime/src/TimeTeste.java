import javax.swing.JOptionPane;

public class TimeTeste {
	public static void main(String[] args) {

		Time t = new Time();

		t.setTime(2, 8, 5);

		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
//		
//		JOptionPane.showMessageDialog(null, t.exibirHoraUniversal());
//		JOptionPane.showMessageDialog(null, t.exibirHoraPadrao());

		t.setTime(0, 10);

		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());

		t.setTime(22);

		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());

		t.setTime(12, 14, 54);

		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
