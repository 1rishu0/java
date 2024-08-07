/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package painting;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */
//create the class for the frame
class myframe extends Frame {
//    create 2 integer reference

    int x=10, y=10;
//    create constructor for the automation of the frame

    myframe() {
//        call the super class  for the heading
        super("Painting");
//        add the mousemotionlistener event in frame
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
//                set the coordinates of the mouse to x and y whenever the mouse moved
                x=me.getX();
                y=me.getY();
//                recall the paint method this is also present in container
                repaint();
            }
        });
//        close the window 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
//    there is always a paint method present in a container and here it have a parameter
//    which is graphics class and we have to override that method
    public void paint(Graphics g)
    {
//        set the color of the oval
        g.setColor(Color.BLUE);
        
//        draw the oval with the help of graphics class
//        g.drawOval(x, y,50,50);

//        you can also fill the circle with color
//        g.fillOval(x, y,50,50);

//        set the font with fonttype , fontstyle and fontsize
        g.setFont(new Font("Serif",Font.BOLD,30));
//        draw the string instead of oval
        g.drawString("Hello", x, y);
    }
}

public class Painting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of the class myframe
        myframe mf = new myframe();
//        set the size of myframe
        mf.setSize(700, 800);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }

}
