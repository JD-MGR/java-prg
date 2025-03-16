import java.awt.*;
import java.applet.*;
/*<applet code ="Ellipses" width=500 height=500>Circle</applet>*/
public class Ellipses extends Applet
{
	public void paint(Graphics g)
	{
		int i=0;
		int x=20;
		int y=50;
		do
		{
	
		for(int j=0;j<3;j++)
		{
			x=x+30;
			y=y+30;
		}
		g.setColor(Color.BLUE);
		g.fillOval(x,y,25,25);
		}while(i<=3);
	}
}