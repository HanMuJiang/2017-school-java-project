package project1;

import java.awt.*;

public class Xingkong {
	/**
	 * Õ¹Ê¾ÐÇ¿Õ³ÌÐò
	 */
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setSize(1366, 768);
		f.setBackground(Color.BLACK);
		Paint p = new Paint();
		f.add(p);
		f.show();
	}
}

class Paint extends Panel {
	public void paint(Graphics g) {
		for (int i = 0; i < 300; i++) {
			// g.setColor(new
			// Color((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
			g.setColor(Color.white);
			g.drawString("*", (int) (Math.random() * 1366),
					(int) (Math.random() * 768));
		}
	}

}