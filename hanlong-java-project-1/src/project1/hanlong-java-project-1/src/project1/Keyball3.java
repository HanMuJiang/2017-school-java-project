package project1;
import java.awt.*;
import java.awt.event.*;
public class Keyball3 {
	public static void main(){
		Frame f=new Frame();
		f.setSize(300, 400);
		Paint3 p=new Paint3();
		f.add(p);
		f.show();
	}
}

class Paint3 extends Panel implements KeyListener {
	int x=30;
	int y=30;
	public void paint(Graphics g){
		g.fillOval(x, y, 30, 30);
	}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==37){
			x-=5;
		}
		if(){}
		
		repaint();
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
}
