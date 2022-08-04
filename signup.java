import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;



public class signup extends JFrame implements ActionListener
{  
   JButton back, create;
   signup()
   {
      getContentPane().setBackground(Color.BLACK);
      setBounds(0,0,1536,700);
      setVisible(true);
      setLayout(null);

      JPanel panel= new JPanel();
      panel.setBounds(330,90,700,500);
      panel.setBorder(new TitledBorder(new LineBorder(new Color(219, 25, 11),3),"Create Account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(219, 25, 11)));
      panel.setLayout(null);
      add(panel);

      JLabel createaccountas= new JLabel("Create Account As:");
      createaccountas.setFont(new Font("Tahoma", Font.BOLD,15));
      createaccountas.setForeground(Color.BLACK);
      createaccountas.setBounds(70,120,180,20);
      panel.add(createaccountas);
      Choice accounttype= new Choice();
      accounttype.add("Admin");
      accounttype.add("Bus Pass Holder");
      accounttype.setForeground(new Color(219, 25, 11));
      accounttype.setBounds(250,120,130,25);
      panel.add(accounttype);

      JLabel name= new JLabel("Name:");
      name.setFont(new Font("Tahoma", Font.BOLD,15));
      name.setForeground(Color.BLACK);
      name.setBounds(70,170,180,20);
      panel.add(name);
      JTextField entername= new JTextField();
      entername.setFont(new Font("Tahoma",Font.PLAIN,15));
      entername.setForeground(Color.BLACK);
      entername.setBounds(250,170,130,25);
      panel.add(entername);

      JLabel mobileno= new JLabel("Mobile no:");
      mobileno.setFont(new Font("Tahoma", Font.BOLD,15));
      mobileno.setForeground(Color.BLACK);
      mobileno.setBounds(70,220,180,20);
      panel.add(mobileno);
      JTextField entermobileno= new JTextField();
      entermobileno.setFont(new Font("Tahoma",Font.PLAIN,15));
      entermobileno.setForeground(Color.BLACK);
      entermobileno.setBounds(250,220,130,25);
      panel.add(entermobileno);

      JLabel email= new JLabel("Email ID");
      email.setFont(new Font("Tahoma", Font.BOLD,15));
      email.setForeground(Color.BLACK);
      email.setBounds(70,270,180,20);
      panel.add(email);
      JTextField enteremail= new JTextField();
      enteremail.setFont(new Font("Tahoma",Font.PLAIN,15));
      enteremail.setForeground(Color.BLACK);
      enteremail.setBounds(250,270,130,25);
      panel.add(enteremail);

      JLabel username= new JLabel("Username:");
      username.setFont(new Font("Tahoma", Font.BOLD,15));
      username.setForeground(Color.BLACK);
      username.setBounds(70,320,180,20);
      panel.add(username);
      JTextField enterusername= new JTextField();
      enterusername.setFont(new Font("Tahoma",Font.PLAIN,15));
      enterusername.setForeground(Color.BLACK);
      enterusername.setBounds(250,320,130,25);
      panel.add(enterusername);

      JLabel password= new JLabel("Password:");
      password.setFont(new Font("Tahoma", Font.BOLD,15));
      password.setForeground(Color.BLACK);
      password.setBounds(70,370,180,20);
      panel.add(password);
      JTextField enterpassword= new JTextField();
      enterpassword.setFont(new Font("Tahoma",Font.PLAIN,15));
      enterpassword.setForeground(Color.BLACK);
      enterpassword.setBounds(250,370,130,25);
      panel.add(enterpassword);


      create = new JButton("CREATE");
      create.setBackground(Color.BLACK);
      create.setBounds(90,430,100,25);
      create.setForeground(Color.WHITE);
      create.setFont(new Font("Tahoma", Font.BOLD,15));
      panel.add(create);
      create.addActionListener(this);

      back = new JButton("BACK");
      back.setBackground(Color.BLACK);
      back.setBounds(260,430,100,25);
      back.setForeground(Color.WHITE);
      back.setFont(new Font("Tahoma", Font.BOLD,15));
      panel.add(back);
      back.addActionListener(this);

      ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("signup.png"));
      Image i2= i1.getImage().getScaledInstance(260,380, Image.SCALE_DEFAULT);
      ImageIcon i3= new ImageIcon(i2);
      JLabel image= new JLabel(i3);
      image.setBounds(400,70,260,380);
      panel.add(image);

   } 
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==back)
       {
         setVisible(false);
         new login();
       }
   }
   public static void main(String args[])
    {
      new signup();
    }

}

