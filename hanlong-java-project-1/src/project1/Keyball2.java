package project1;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyball2 {
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setSize(300, 400);
		Paint0 p = new Paint0();
		f.add(p);
		f.addKeyListener(p);
		p.addKeyListener(p);
		f.show();
	}
}

class Paint0 extends Panel implements KeyListener {
	int x = 30;
	int y = 30;

	public void paint(Graphics g) {
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 37) {
			x--;
		}
		if (e.getKeyCode() == 38) {
			y--;
		}
		if (e.getKeyCode() == 39) {
			x++;
		}
		if (e.getKeyCode() == 40) {
			y++;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}