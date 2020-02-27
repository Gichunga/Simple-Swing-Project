package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examprep extends JFrame  {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;



    public void Examprep()
    {
        setTitle("Exam Java Revision");
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        JTextField t = new JTextField("Lets see the default location borderLayout");
        add(t, BorderLayout.SOUTH);

    }
    public static void main(String [] args) {
        Examprep gui = new Examprep();
        gui.setVisible(true);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String buttonString = e.getActionCommand();
//        if(buttonString.equals("clickMe")){
//            buttonPanel.setBackground(Color.GREEN);
//        }
    }

