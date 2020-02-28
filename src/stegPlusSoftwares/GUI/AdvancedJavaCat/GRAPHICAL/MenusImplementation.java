package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MenusImplementation extends JFrame implements ActionListener {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;
    private JMenuBar menuBar;
    private JMenu csOption, csCourses;
    private JMenuItem netSec, softDev, CEng, discrete, calculus, statistics;
    private JPanel textArea;
    private JTextArea text;
    //private Image exit_icon;
    //private Image newimg;
    private boolean isColored;

    public static void main(String [] args)
    {
        MenusImplementation gui = new MenusImplementation();
        gui.setVisible(true);
    }

    public MenusImplementation()
    {
        super("BCS 366(LAB 1a):Menus, Icons,TextArea");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a menu bar
        menuBar = new JMenuBar();

        // create a csCourses menu
        csCourses = new JMenu("CS Core Courses");
        csCourses.addActionListener(this);
        menuBar.add(csCourses);

        // create a csOption menu
        csOption = new JMenu("Cs Options");
        csOption.addActionListener(this);
        menuBar.add(csOption);

        // add the menu bar to the JFrame
        //setJMenuBar(menuBar);
        add(menuBar, BorderLayout.NORTH);


        // Creating the csOption menu items
        netSec = new JMenuItem("Network and Security");
        netSec.setActionCommand("netSec");
        netSec.addActionListener(this);
        csOption.add(netSec);

        softDev = new JMenuItem("Software and Development");
        softDev.setActionCommand("softdev");
        softDev.addActionListener(this);
        csOption.add(softDev);

        CEng = new JMenuItem("Computer Engineering");
        CEng.setActionCommand("CEng");
        CEng.addActionListener(this);
        csOption.add(CEng);


        // creating the csCourses menu items
        discrete = new JMenuItem("Discrete structures");
        discrete.setActionCommand("discrete");
        discrete.addActionListener(this);
        csCourses.add(discrete);

        calculus = new JMenuItem("Calculus");
        calculus.setActionCommand("calculus");
        calculus.addActionListener(this);
        csCourses.add(calculus);

        statistics = new JMenuItem("Statistics");
        statistics.setActionCommand("statistics");
        statistics.addActionListener(this);
        csCourses.add(statistics);

        //Creating a text area Panel
        textArea = new JPanel();
        textArea.setBackground(Color.WHITE);
        textArea.setLayout(new FlowLayout());

        //creating the text area
        text = new JTextArea("Clicked option shown here...\n", 8,10);
        text.setLineWrap(true);
        text.setEditable(false);
        textArea.add(text); // add the text area to the text area panel

        // add the text area to JFrame
        add(textArea, BorderLayout.EAST);


        // Creating the buttons panel and setting their layouts
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new GridLayout(1,2));

        // get an icon location, store it in a variable and resize it to fit in the buttons panel
        ImageIcon icon =  new ImageIcon("C:\\Users\\stegPlus\\IdeaProjects\\MyProjects\\src\\stegPlusSoftwares\\GUI\\AdvancedJavaCat\\GRAPHICAL\\exit.jpeg");
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(50,30, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);


        // create an exit button with an icon
        JButton exitButton = new JButton("exit");
        exitButton.setIcon(icon);
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);


        // button to toggle the background color from white to cyan and vice versa
        JButton changeColorBtn = new JButton("TOGGLE BACKGROUND COLOR");
        changeColorBtn.addActionListener(this);
        buttonPanel.add(changeColorBtn);

        add(buttonPanel, BorderLayout.SOUTH);
    }


// the action listener
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String buttonString = e.getActionCommand(); // variable to listen for events fired

        // change the text area background color to cyan if color-toggle button is clicked and isClicked evaluates to true
        if(buttonString.equals("TOGGLE BACKGROUND COLOR") && isColored) {
            text.setBackground(Color.CYAN);
            isColored = false;
        }
        // listening for button click when isColored condition is false
        else if(buttonString.equals("TOGGLE BACKGROUND COLOR") && !isColored)
        {
            text.setBackground(Color.WHITE);
            isColored = true;
        }

        // for each menu-item click, add a short description to the text area field
        else if (buttonString.equals("discrete"))
        {
            text.setText("");
            text.append("Discrete Mathematics:\n\n");
            text.append("a branch of computer science and mathematics that deals with graph theory and Combinatorics");
        }
        else if(buttonString.equals("calculus")) {
            text.setText("");
            text.append("Calculus:\n\n");
            text.append("Any formal system in which symbolic expressions are manipulated according to fixed rules");
        }
        else if (buttonString.equals("statistics"))
        {
            text.setText("");
            text.append("Statistics\n\n");
            text.append("concerned with data collection, presentation, analysis and presentation");
        }
        else if (buttonString.equals("netSec"))
        {

            text.setText("");
            text.append("Network and security:\n\n");
            text.append("deals with the security on a network");
        }
        else if (buttonString.equals("softdev"))
        {
            text.setText("");
            text.append("Software Development:\n\n");
            text.append("a branch that deals with the development of software programs");
        }
        else if (buttonString.equals("CEng"))
        {
            text.setText("");
            text.append("Computer Engineering:\n\n");
            text.append("a branch of engineering that deals with design and application of computers");
        }
        //exit iff the exit-button is clicked
        else if (buttonString.equals("exit"))
            System.exit(0);
    }
}
