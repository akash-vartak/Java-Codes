import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Mouse extends Applet implements MouseListener, MouseMotionListener
{
    int width, height;
    Vector listOfPositions;
    public void init()
    {
        width = getSize().width;
        height = getSize().height;
        setBackground( Color.black );
        listOfPositions = new Vector();
        addMouseListener( this );
        addMouseMotionListener( this );
     }

    public void mouseEntered( MouseEvent e )
    {
    }

    public void mouseExited( MouseEvent e )
    {
    }

    public void mouseClicked( MouseEvent e )
    {
    }

    public void mousePressed( MouseEvent e )
    {
    }

    public void mouseReleased( MouseEvent e )
    {
    }

    public void mouseMoved( MouseEvent e )
    {
        if ( listOfPositions.size() >= 50 )
        {
            listOfPositions.removeElementAt( 0 );
        }
        listOfPositions.addElement( new Point( e.getX(), e.getY() ) );
        repaint();
        e.consume();
    }

    public void mouseDragged( MouseEvent e )
    {
    }

    public void paint( Graphics g )
    {
        g.setColor( Color.blue );
        for ( int j = 1; j < listOfPositions.size(); ++j )
        {
            Point A = (Point)(listOfPositions.elementAt(j-1));
            Point B = (Point)(listOfPositions.elementAt(j));
            g.drawLine( A.x, A.y, B.x, B.y );
        }
    }
}