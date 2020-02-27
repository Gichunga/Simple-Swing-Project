package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.file.LinkOption;

public class UserAccount extends JFrame implements ActionListener{

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 300;

    private JTextField username;
    private JTextField email;
    private JTextField password;
    private JTextArea description;
    public static void main(String [] args)
    {
        UserAccount gui = new UserAccount();
        gui.setVisible(true);
    }
    public UserAccount()
    {
        super("User Account Implementation");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Menu Bar definition
        JMenuBar bar = new JMenuBar();
        JMenu homeMenu = new JMenu("Home");
        JMenuItem sellLand = new JMenuItem("land sale");
        homeMenu.add(sellLand);
        homeMenu.addSeparator();
        JMenu directions = new JMenu("Get and Set Land Location");
        JMenuItem directionsAdd = new JMenuItem("Add direction");
        directions.add(directionsAdd);
        JMenuItem directionsRemove = new JMenuItem("Add direction");
        directions.add(directionsRemove);
        homeMenu.add(directions);
        bar.add(homeMenu);

        JMenu profileMenu = new JMenu("Profile Settings");
        bar.add(profileMenu);

        JMenu contactMenu = new JMenu("Contact Us");
        bar.add(contactMenu);

        setJMenuBar(bar);

        //user details
        JPanel userDetailsPanel = new JPanel();
        userDetailsPanel.setBorder(new TitledBorder("Enter User Details"));
        userDetailsPanel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Username: ");
        userDetailsPanel.add(nameLabel);
        username = new JTextField("Enter username");
        userDetailsPanel.add(username);

        JLabel emailLabel = new JLabel("Email: ");
        userDetailsPanel.add(emailLabel);
        email = new JTextField("Enter email in the correct format");
        userDetailsPanel.add(email);

        JLabel pwdLabel = new JLabel("Password: ");
        userDetailsPanel.add(pwdLabel);
        password = new JPasswordField();
        userDetailsPanel.add(password);

        JButton loginSubmit = new JButton("SUBMIT");
        loginSubmit.setBackground(Color.MAGENTA);
        loginSubmit.addActionListener(this);
        userDetailsPanel.add(loginSubmit);

        add(userDetailsPanel, BorderLayout.CENTER);

        JPanel reviewPanel = new JPanel();
        reviewPanel.setLayout(new GridLayout(4, 1));

//        JLabel optional = new JLabel("Sample Review Survey *(Optional)");
//        reviewPanel.add(optional);
//
//        JPanel radioPanel = new JPanel();
//        radioPanel.setLayout(new GridLayout(2, 1));
//
//        JLabel radio = new JLabel("Please tell us more about you");
//        radioPanel.add(radio);
//
//        ButtonGroup grp1 = new ButtonGroup();
//        JRadioButton btn1 = new JRadioButton("Male");
//        JRadioButton btn2 = new JRadioButton("Female");
//        grp1.add(btn1);
//        grp1.add(btn2);
//        //radioPanel.add(grp1);




    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
