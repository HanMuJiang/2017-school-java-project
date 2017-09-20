package project1;

import java.awt.*;

public class Xiaxue {
	/**
	 * 制作一个动画效果 展示雪花飘落场景
	 **/
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setBackground(Color.white);
		f.setSize(1366, 768);
		Paint01 p = new Paint01();
		f.add(p);
		Thread t = new Thread(p);
		t.start();
		f.show();
	}
}

class Paint01 extends Panel implements Runnable {
	int x[] = new int[300];
	int y[] = new int[300];

	public Paint01() {
		for (int i = 0; i < 300; i++) {
			x[i] = (int) (Math.random() * 1366);
			y[i] = (int) (Math.random() * 768);
		}
	}

	public void paint(Graphics g) {

		// g.setColor(new
		// Color((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
		// g.setColor(Color.ORANGE);
		for (int i = 0; i < 300; i++) {
			g.setColor(new Color((int) (Math.random() * 100), (int) (Math
					.random() * 100), (int) (Math.random() * 100)));
			g.drawString("*", x[i], y[i]);
		}
	}

	public void run() {

		while (true) {
			try {
				for (int i = 0; i < 300; i++) {
					y[i]++;
					if (y[i] > 768) {
						y[i] = 0;
					}
				}
				Thread.sleep(10);
			} catch (Exception e) {
			}
			repaint();
		}
	}
}