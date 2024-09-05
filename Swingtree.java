/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingtree;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.tree.*;
/**
 *
 * @author RISHAB
 */
//make the class to handle the jframe
class myframe extends JFrame
{
//    make the reference of jtree and jlabel
    JTree tree;
    JLabel l;
//    make the constructor for the automation of jframe
    myframe()
    {
//        call the super class for the headline
        super("Tree Demo");
//        make the object of the defaultmutabletreenode class which carry the all the objects of teh jtree and after the end jtree will add this class by itself
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\myjava");
//        file is class which is used to handle the operation of the input and output of the file thus we make the object of file class to handle the file
        File f=new File("C:\\myjava");
//        make a loop with access each file with the file with the help of file.listfiles 
        for(File x:f.listFiles())
        {
//            make condition if the within file have the directory or not
            if(x.isDirectory())
            {
//                if yes then make full operationalise access of that file by making separate jtree and then add it with the main jtree
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
//                make the loop for the accessing of the file that inside the within file
                for(File s:x.listFiles())
                {
//                    add the name of each file in the temp with then eventually added to the root
                    temp.add(new DefaultMutableTreeNode(s.getName()));
                }
//                add the temp jtree to the main root jtree
                root.add(temp); 
            }
            else{
//                if above condition is false then simple get the name of the within file and add it to the jtree
            root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
//        now make the object for the jtree class with having root as a parameter
        tree=new JTree(root);
//        make the object of the jlabel class
        l=new JLabel("No File Selected");
//        make the object of the handler class for the handling of event listeners
        handler h=new handler();
//        now add the eventlistener to the jtree for the operation to function
        tree.addTreeSelectionListener(h);
//        add the jtree to the jscrollpane class which is used for the scrollbar and have tree as the parameter for the simplification
        JScrollPane p=new JScrollPane(tree);
//        add jscrollpane and jlabel to the jframe with its positioned marked
        add(p,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);
    }
//    make the class to handle the event listeners
    class handler implements TreeSelectionListener
    {
//        override the valuechanged method which work when you click the name of the name then it performed
        public void valueChanged(TreeSelectionEvent e) {
//        after click the file name set the text of the jlabel to that file's path name
           l.setText(e.getPath().toString());
        }
        
    }
}
public class Swingtree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object for the inherited class of jframe 
        myframe mf=new myframe();
//        set the size of jframe
        mf.setSize(500,300);
//        set the visiblity of the jframe to true
        mf.setVisible(true);
//        set the operation of the deafault close to exit on close which is the method of jframe itself
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
