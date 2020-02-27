package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeBColor extends JFrame implements ActionListener
{
    public static int WIDTH = 500;
    public static int HEIGHT = 200;
    private JPanel largerPanel;
    private JLabel label1;
    private  boolean isColored = false;

    public static void main(String args [])
    {

        ChangeBColor gui = new ChangeBColor();
        gui.setVisible(true);
    }


    public ChangeBColor()
    {
        super("Change Background Color Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,1));

        largerPanel = new JPanel();
        largerPanel.setBackground(Color.PINK);
        biggerPanel.add(largerPanel);

        label1 = new JLabel("click the button to change the background color");
        add(label1);
        largerPanel.add(label1, BorderLayout.WEST);

        add(biggerPanel, BorderLayout.CENTER);

        // create a panel that will hold all the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

//        create a button object named changeColor, then add it to the button panel
        JButton changeColor = new JButton("change color");
        changeColor.addActionListener(this);
        buttonPanel.add(changeColor);

        // add button panel to the borderLayout in the upper position
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // implement the interface ActionListener
    public void actionPerformed (ActionEvent e)
    {
        String buttonString = e.getActionCommand();

         if(buttonString.equals("change color") && !isColored) {
            largerPanel.setBackground(Color.BLACK);
            label1.setForeground(Color.WHITE);
            isColored = true;
        }else if(buttonString.equals("change color") && isColored){
             largerPanel.setBackground(Color.PINK);
             label1.setForeground(Color.BLACK);
             isColored = false;
         }
        else
            System.out.println("Unknown error");
    }
}