import java.applet.*;
import java.awt.*;
import java.lang.Math;
import java.awt.Font;
public class DrawingWithColor extends Applet
{
    int width, height;
    int N = 40;
    Color[] spectrum;
    public void init()
    {
        width = getSize().width;
        height = getSize().height;
        setBackground( Color.black );
        spectrum = new Color[ N ];


        for ( int i = 0; i < N; ++i )
        {
            spectrum[i] = new Color( Color.HSBtoRGB(i/(float)N,1,1) );
        }
    }

    public void paint( Graphics g )
    {
        int radius = width / 3;
        for ( int i = 0; i < N; ++i )
        {
            double angle = 2*Math.PI*i/(double)N;
            int x = (int)( radius*Math.sin(angle) );
            int y = (int)( radius*Math.cos(angle) );
            Font myFont = new Font("Monotype Corsiva", Font.ITALIC, 19);
            g.setColor( spectrum[ i ] );
            g.setFont(myFont);
            g.drawString( "  AKASH  ", width/2+x, height/2+y );
        }
    }
}

/*
<applet code="DrawingWithColor.class" CodeBase="" width=300 height=400></applet>
*/