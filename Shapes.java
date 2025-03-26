import java.awt.*;
import java.awt.Button;
import java.lang.*;
import java.applet.*;
import java.io.*;
/*<applet code="Shapes" width=500 height=500></applet>*/
public class Shapes extends Applet{
	int x,y,w,h;
    Button b1,b2,b3;
	public void init()
	{
		b1=new Button("Circle");
		b1.setBounds(60,110,30,50);
		add(b1);
		b2=new Button("Rectangle");
		b2.setBounds(140,190,30,50);
		add(b2);
		b3=new Button("Line");
		b3.setBounds(220,270,30,50);
		add(b3);
	}
}
		
		