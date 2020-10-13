package ignou;

import java.applet.Applet;
import java.awt.Graphics;

public class drawCircle extends Applet {

	
		    int x=300,y=100,r=50;
		    public void paint(Graphics g)
		    {
		       
		        g.drawOval(x-r,y-r,100,100);
		        g.drawString("Circle",275,100);
		        
		   }
		

	}


