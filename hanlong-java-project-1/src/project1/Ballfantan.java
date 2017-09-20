package project1;
import java.awt.*;
public class Ballfantan {
	public static void main(String args[]){
		Frame f=new Frame();
		f.setBackground(Color.pink);
		f.setSize(300, 400);
		Paint8 p=new Paint8();
		f.add(p);
		Thread t=new Thread(p);
		t.start();
		f.show();
		
	} 
}
class Paint8 extends Panel implements Runnable{
	int x=30;
	int y=30;
	int flag=0;
	public void paint(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 30, 30);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//定义标签方向功能
			if(flag==0){x++;y++;}
			if(flag==1){x--;y++;}
			if(flag==2){x--;y--;}
			if(flag==3){x++;y--;}
			//飞行(1墙的判断2姿势判断)
			if(x>250){if(flag==0){flag=1;}else flag=2;}
			if(x<0  ){if(flag==2){flag=3;}else flag=0;}
			if(y>330){if(flag==1){flag=2;}else flag=3;}
			if(y<0  ){if(flag==3){flag=0;}else flag=1;}
			try{Thread.sleep(20);
			}catch(Exception e){}
			repaint();
		}
	}
}
