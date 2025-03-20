import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*<applet code="ArcLines" width=600 height=600></applet>*/
public class ArcLines extends Applet{
	public void paint(Graphics g)
	{
		int x1=20;
		int y1=80;
		int x2=560;
		int y2=81;
		g.drawLine(x1,y1,x2,y2);
		int a1=21;
	   	int b1=81;
      	int a2=22;
		int b2=160;
        g.drawLine(a1,b1,a2,b2);
		int x=460;
		int y=100;
		int width=200;
		int length=120;
		int startAngle=90;
		int arcAngle=100;
		g.drawArc(x,y,width,length,startAngle,arcAngle);
		int n1=560;
		int p1=80;
		int n2=561;
		int p2=99;
		g.drawLine(n1,p1,n2,p2);
		int j1=20;
		int k1=160;
		int j2=460;
		int k2=168;
		g.drawLine(j1,k1,j2,k2);
		
	}
}