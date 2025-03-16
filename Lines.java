import java.awt.*;
import java.applet.*;
/*<applet code="Lines" width=700 height=700></applet>*/
public class Lines extends Applet
{
	public void paint(Graphics g)
	{
		int x1=100;
		int x2=150;
		int y1=80;
		int y2=81;
		int v1=x2-x1;
		int v2=y2-y1;
		for (int i=1;i<=4;i++)
		{
			x1=x1+50;
			x2=x2+50;
			y1=y1+50;
			y2=y2+50;
			int slp=v2/v1;
			if(slp>=1)
			{
				int temp=x2;
				x2=x1;
				x1=x2;
				
			}
		g.drawLine(x1,y1,x2,y2);
		}
	}
}
			
		