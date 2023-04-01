import java.applet.*;
import java.awt.*;

/*
<applet code="hut1.java" height=300 width=300>
</applet>
*/

public class hut1 extends Applet
{
 public void paint(Graphics g)
 {
	setBackground(Color.pink);
	g.setColor(Color.red);
	int[] xPoints={100,150,200};
	int[] yPoints={100,50,100};
	g.fillPolygon(xPoints,yPoints,3);

	g.setColor(Color.yellow);
	g.fillRect(100,100,100,80);
	
	g.setColor(Color.blue);
	g.fillRect(130,140,40,40);
	
 }
}