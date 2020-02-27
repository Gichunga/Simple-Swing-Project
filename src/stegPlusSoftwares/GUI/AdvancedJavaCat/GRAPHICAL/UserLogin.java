package stegPlusSoftwares.GUI.AdvancedJavaCat.GRAPHICAL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class UserLogin extends JFrame implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 150;
    public static final int NUM_OF_CHAR = 20;

    private JTextField name;
    private JPasswordField password;

    public static void main(String args[])
    {
        UserLogin gui = new UserLogin();
        gui.setVisible(true);
    }


    public UserLogin()
    {
        super("CSE 364 Account Login");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3,2));
        setBackground(Color.LIGHT_GRAY);



        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new BorderLayout());

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        name = new JTextField(NUM_OF_CHAR);
        namePanel.add(name, BorderLayout.EAST);
        JLabel nameLabel = new JLabel("Username:");
        namePanel.add(nameLabel, BorderLayout.WEST);
        add(namePanel);

        JPanel pwdPanel = new JPanel();
        pwdPanel.setLayout(new BorderLayout());
//    pwdPanel.setBackground(Color.BLUE);
        password = new JPasswordField(NUM_OF_CHAR);
        pwdPanel.add(password,BorderLayout.EAST);
        JLabel pwdLabel = new JLabel("Password:");
        pwdPanel.add(pwdLabel, BorderLayout.WEST);
        add(pwdPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
//    buttonPanel.setBackground(Color.GREEN);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        buttonPanel.add(loginButton);

        add(buttonPanel, BorderLayout.SOUTH);


    }


    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        PrintWriter outputStream = null;

        if (actionCommand.equals("Login")) {
            try {
                outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\stegPlus\\IdeaProjects\\MyProjects\\src\\stegPlusSoftwares\\GUI\\AdvancedJavaCat\\GRAPHICAL\\user_details.txt"));
            } catch (FileNotFoundException ex) {
                System.out.println("File could not be created");
            }

            String user_name = name.getText();
            //JLabel pwd1 = new JLabel();
            //add(pwd1);
            char[] pwd = password.getPassword();

            outputStream.println("Username: "+user_name+"\nPassword: "+pwd);
            //outputStream.println("password: "+pwd);

            //pwd1.setText(pwd.toString());
            outputStream.close();
        }
        else
            name.setText("unexpected error!!");
    }
}