import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Choice;
import java.awt.event.*;
import javax.swing.*;


public class login extends JFrame implements ActionListener{
    JButton login, cancel, signup;
    login()
    {   
        super("Login Page");
        getContentPane().setBackground(Color.BLACK);
        setBounds(0,0,1536,700);
        setVisible(true);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("internal.jpg"));
        Image i2= i1.getImage().getScaledInstance(1536, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        image.setLayout(null);
        image.setBounds(0,0,1536,700);

        JLabel heading= new JLabel("Renew Card");
        heading.setBounds(500,5,900,80);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("SansSerif",Font.BOLD,70));
        image.add(heading);

        JLabel uid= new JLabel("Unique ID: ");
        uid.setBounds(570,150,100,30);
        uid.setForeground(Color.WHITE);
        uid.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(uid);
        JTextField enteruid=new JTextField();
        enteruid.setBounds(670,150,180,30);
        enteruid.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(enteruid);

        JLabel password= new JLabel("Password: ");
        password.setBounds(570,210,100,30);
        password.setForeground(Color.WHITE);
        password.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(password);
        JTextField enterpassword=new JTextField();
        enterpassword.setBounds(670,210,180,30);
        enterpassword.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(enterpassword);

        JLabel logginginas= new JLabel("Logging in as: ");
        logginginas.setBounds(570,270,100,30);
        logginginas.setForeground(Color.WHITE);
        logginginas.setFont(new Font("SansSerif",Font.BOLD,13));
        image.add(logginginas);
        Choice logging = new Choice();
        logging.add("Admin");
        logging.add("Bus Pass holder");
        logging.setBounds(670,270,180,40);
        logging.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(logging);

    
        login= new JButton("Login");
        login.setBounds(600,360,100,30);
        image.add(login);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("SansSerif",Font.BOLD,17));
        login.addActionListener(this);

        cancel= new JButton("Cancel");
        cancel.setBounds(720,360,100,30);
        image.add(cancel);
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("SansSerif",Font.BOLD,17));
        cancel.addActionListener(this);
        
        JLabel newuser = new JLabel("New User?");
        newuser.setBounds(570,460,100,30);
        newuser.setFont(new Font("SansSerif",Font.BOLD,17));
        newuser.setForeground(Color.WHITE);
        image.add(newuser);
        signup= new JButton("Signup");
        signup.setBounds(690,460,100,30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.WHITE);
        signup.setFont(new Font("SansSerif",Font.BOLD,17));
        image.add(signup);
        signup.addActionListener(this);

    
    }

    public void actionPerformed(ActionEvent ae)
     { 
       if(ae.getSource()== login)
       {
         
       }
       else if(ae.getSource()==signup)
       {
         setVisible(false);
         new signup();
       }
       else if(ae.getSource()==cancel)
       {
         setVisible(false);
       }
     }
    public static void main(String args[]) 
    {
      new login();
        
    }
}

