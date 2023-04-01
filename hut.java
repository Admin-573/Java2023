import java.applet.*;
import java.awt.*;

/*
<applet code="hut.class" height=300 width=300>
</applet>
*/

public class hut extends Applet
{
	public void paint(Graphics g)
	{	
		//Draw Top
		g.setColor(Color.red);
		int[] xPoints = {100,150,200};
		int[] yPoints = {100,50,100};
		g.fillPolygon(xPoints,yPoints,3);

		//Draw Wall
		g.setColor(Color.yellow);
		g.fillRect(100,100,100,80);
		
		//Draw Door
		g.setColor(Color.blue);
		g.fillRect(130,140,40,40);		
	}
}