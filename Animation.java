/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animation;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */
//create class for the handling of frame and for animation implement runnable interface
class myframe extends Frame implements Runnable {
//    create 2 reference of integer for the coordinates

    int x, y;
//    create 2 more reference of integer name translation x and y because moving of an object in an animation is called translation
    int tx, ty;
//    create constructor for the automation of the frame

    myframe() {
//        call the super class for the headline
        super("Animation");
//        set the value of x and y to 100
        x = 100;
        y = 100;
//        now set the value of tx and ty to 1
        tx = 1;
        ty = 1;
//        make the object of the thread class for the animation inside the frame
        Thread t = new Thread(this);
//        now start the thread
        t.start();
//        add window listener for the closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
//        override the paint method for the oval 

    public void paint(Graphics g) {

        g.setColor(Color.BLUE);

        g.fillOval(x, y, 50, 50);
    }
//        initiate the run method for the animation or thread movement

    public void run() {
//            make a while loop that continue till infinity
        while (true) {
//                increment the x till it reach border 
            x += tx;
            y += ty;
//make condition if oval  touch right border means x greater than 700 and if oval touch left border which is 0 then make it fall backward by decrement by -1 
            if (x < 0 || x > 550) {
                tx = tx * -1;
            }
//                same goes for this condition that goes for the above
            if (y < 25 || y > 650) {
                ty = ty * -1;
            }
//                repaint the oval to the frame
            repaint();
//                try to make a delay in the oval speed , so for that we apply thread.sleep
            try {
                Thread.sleep(3);
            } catch (Exception e) {
            }

        }

    }
}

public class Animation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of the frame
        myframe mf = new myframe();
//        set the size of the frame
        mf.setSize(600, 700);
//        set the visiblity of the frame
        mf.setVisible(true);
    }

}
