import java.applet.*;
import java.awt.*;
import java.util.*;

/* 
<applet code="DigitalClock.java" height=50 width=150>
</applet>
*/

public class DigitialClock extends Applet implements Runnable
{
String timeString="";
Thread clockThread;

	public void start()
	{
		clockThread = new Thread(this);
		clockThread.start();		
	}
	public void run()
	{
	Thread thisThread = Thread.currentThread();
		while(clockThread==thisThread)
		{
			try
			{
				Calendar cal = Calendar.getInstance();
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				int min = cal.get(Calendar.MINUTE);
				int sec = cal.get(Calendar.SECOND);
				timeString = hour+":"+min+":"+sec;
				repaint();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawString(timeString,50,25);
	}		
}