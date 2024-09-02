/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingspinner;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */
//make class to handle the swing jframe
class myframe extends JFrame
{
//  make the reference of classes jlist,jcombobox,2 jspinner, jtextfield  
    JList jl;
    JComboBox jcb;
    JSpinner js1,js2;
    JTextField jtf;
//    make constructor for the automation of jframe
    myframe()
    {
//        call super class for the headline
        super("Spinner Demo");
//        make the array of string for countries, months , days
        String countries[]={"India","US","UK","Canada","Australia"};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        above string is data and when we see the data it is called view and the activites in the model is called controller , so it just like MVC model-view-control
        jcb=new JComboBox(countries);
        jl=new JList(months);
        jtf=new JTextField(15);
//        make object of class jscrollpane to hold the jlist
        JScrollPane jsp=new JScrollPane(jl);
//        make the object of jspinner with spinnernumbermodel class as parameter with having initial value , where to start , where to end , increment no.
        js1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
//        make object of jspinner class with spinnerlistmodel class as parameter with days array string
        js2=new JSpinner(new SpinnerListModel(days));
//        set the layout of jframe to flowlayout
        setLayout(new FlowLayout());
//        add jcombobox,2 jspinner, jtextfield , jscrollpane to the jframe
        add(jcb);
        add(js1);
        add(js2);
        add(jsp);
        add(jtf);
//        add actionlistener to jcombobox to add the selected item in jtextfield
        jcb.addActionListener((ActionEvent ae)->{
            jtf.setText(jcb.getSelectedItem().toString());
        });
//        add listselectionlistener to jlist to add selected value to jtextfield
        jl.addListSelectionListener((ListSelectionEvent lse)->{
            jtf.setText(jl.getSelectedValue().toString());
        });
//        add changelistener to jspinner to add the given value to jtextfield        
        js1.addChangeListener((ChangeEvent ce)->{
            jtf.setText(js1.getValue().toString());
        });
        js2.addChangeListener((ChangeEvent ce)->{
            jtf.setText(js2.getValue().toString());
        });
    }   
    
}
public class Swingspinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make object of inherited class of jframe 
        myframe mf=new myframe();
//        set the size of jframe
        mf.setSize(300,300);
//        set the visiblity of myframe to true
        mf.setVisible(true);
//        set the default operation of close to exitonclose
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
