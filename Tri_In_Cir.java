import java.applet.*;
import java.awt.*;

/*
<applet code="Tri_In_Cir.java" height=300 width=300>
</applet>
*/

public class Tri_In_Cir extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.magenta);
		g.fillOval(85,45,120,80);

		g.setColor(Color.blue);
		int[] xPoints={100,150,200};
		int[] yPoints={100,50,100};
		g.fillPolygon(xPoints,yPoints,3);
		
	}
}