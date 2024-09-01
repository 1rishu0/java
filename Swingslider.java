/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingslider;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
/**
 *
 * @author RISHAB
 */
//make the class to handle the swing jframe
class myframe extends JFrame
{
//    make the reference of class jslider,jprogressbar,and 2 jpanel
    JSlider js;
    JProgressBar jpb;
    JPanel p1,p2;
//    make a variable to store the value of size of the oval
    int w=50;
//    make the constructor for the automation of the jframe
    myframe()
    {
//        make the object of class jslider with minimum mark , maximum mark and initial point 
        js=new JSlider(0,100,50);
//        set the majortickspacing to 10 and minortickspacing to 1
        js.setMajorTickSpacing(10);
        js.setMinorTickSpacing(1);
//        set the paintticks to true
        js.setPaintTicks(true);
//        set the paintlabels to true
        js.setPaintLabels(true);
//        make the object of the class jprogressbar
        jpb=new JProgressBar();
//        set the string of the jprogessbar means initil show of the bar
        jpb.setString("50%");
//        set the stringpainted to true 
        jpb.setStringPainted(true);
//        set the indeterminate to true or false because it show the bar moving like progress is going on
        jpb.setIndeterminate(false);
//        make object of jpanel class with the method of paintcomponent to draw oval
        p1=new JPanel(){
          public void paintComponent(Graphics g)
          {
              g.drawOval(200,200,w,w);
          }
        };
//        make new object of jpanel to hold the jprogressbar
        p2=new JPanel();
//        add jprogressbar to jpanel
        p2.add(jpb);
//        add the object to jframe with direction 
        add(js,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
//        add changelistener to jslider to update the jprogressbar and change the size of the oval
        js.addChangeListener(new ChangeListener(){
//            override the methdo statechanged with changeevent as parameter
            public void stateChanged(ChangeEvent e) {
//              store the value that get from jslider in w
                w=js.getValue();
//              repaint the jpanel p1
                p1.repaint();
//               set the string of jprogressbar to w
                jpb.setString(w+"%");
//                set the string painted to true of jprogressbar , this will paint the string to the bar
                jpb.setStringPainted(true);
//               set the vlaue of jprogressbar to w
                jpb.setValue(w);
            }
            
        });
    }
}
public class Swingslider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the oject of the inherited class of jframe
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(500,500);
//        set the visiblity of myframe to true
        mf.setVisible(true);
//        set the default operation of close to exitonclose
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
