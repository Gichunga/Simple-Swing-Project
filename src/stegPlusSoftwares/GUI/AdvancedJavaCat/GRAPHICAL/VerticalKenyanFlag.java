package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalKenyanFlag extends JFrame implements ActionListener
{
    public static final int HEIGHT = 400;
    public static final int WIDTH = 600;

    // declare private fields to be used
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel greenPanel;
    private JPanel blackPanel;

    public static void main(String [] args)
    {
        VerticalKenyanFlag gui = new VerticalKenyanFlag();
        gui.setVisible(true);
    }

    public VerticalKenyanFlag()
    {
        super("kenyan flag with vertical color alignment");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // create a larger panel that will hold all other components
        JPanel biggerPanel = new JPanel();
        biggerPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.setLayout(new GridLayout(1, 4));

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel();
        whitePanel .setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(greenPanel);

        blackPanel = new JPanel();
        blackPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(blackPanel);

        // add the biggerPanel that contains all the small panels to the BorderLayout
        // manager at position it at center
        add(biggerPanel, BorderLayout.CENTER);

        JButton buttonPanel = new JButton();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

    JButton redButton = new JButton("Red");
    redButton.setBackground(Color.RED);
    redButton.addActionListener(this);
    buttonPanel.add(redButton);

    JButton whiteButton = new JButton("White");
    whiteButton.setBackground(Color.WHITE);
    whiteButton.addActionListener(this);
    buttonPanel.add(whiteButton);

    JButton greenButton = new JButton("Green");
    greenButton.setBackground(Color.GREEN);
    greenButton.addActionListener(this);
    buttonPanel.add(greenButton);

    JButton blackButton = new JButton("Black");
    blackButton.setBackground(Color.BLACK);
    blackButton.addActionListener(this);
    buttonPanel.add(blackButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(Color.DARK_GRAY);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        // add the buttonPanel to the BorderLayout manager and position it to the bottom
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Red"))
            redPanel.setBackground(Color.RED);
        else if(buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if(buttonString.equals("Green"))
            greenPanel.setBackground(Color.GREEN);
        else if(buttonString.equals("Black"))
            blackPanel.setBackground(Color.BLACK);
        else if(buttonString.equals("Reset")) {
            redPanel.setBackground(Color.LIGHT_GRAY);
            whitePanel.setBackground(Color.LIGHT_GRAY);
            greenPanel.setBackground(Color.LIGHT_GRAY);
            blackPanel.setBackground(Color.LIGHT_GRAY);
        }
        else
            System.out.println("Unknown error happened!!!");
    }
}