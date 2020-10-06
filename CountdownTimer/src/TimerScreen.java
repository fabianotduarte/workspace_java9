import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerScreen extends JFrame implements MouseListener, Runnable, KeyListener {

	private int time;
	private JLabel label;
	private Thread thread;

	public TimerScreen(int time) {
		this.time = time;
		this.setSize(320, 240);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Timer!");

		this.setLayout(null);

		label = new JLabel();
		label.setBounds(130, 20, 250, 200);
		label.setText(String.valueOf(time));
		getContentPane().add(label);
		label.setFont(new Font("Arial", 0, 32));

		addMouseListener(this);
		addKeyListener(this);

		thread = new Thread(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o timer!");
		//thread.start();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("PAssando o ponteiro do mouse dentro da janela");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Mouse saiu da janela...");
	}

	public void run() {
		while (time > 0) {
			time--;
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				System.out.println("Deu ruim!");
			}
			label.setText(String.valueOf(time));
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Codigo da tecla pressionada :"+e.getExtendedKeyCode());
		if (e.getExtendedKeyCode() == 10) { // tem que apertar ENTER
			thread.start();
		}
		else if (e.getExtendedKeyCode() == 27) {
			System.exit(0);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
