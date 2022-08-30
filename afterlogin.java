import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class afterlogin extends JFrame implements ActionListener
{
    JButton back;
    JMenuItem newregistration;
    String id;
    afterlogin(String acctype,String id)
    {
       super("Profile Page");
       this.id=id;
       setVisible(true);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(new FlowLayout());
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("internal4.jpg"));
       Image i2= i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image= new JLabel(i3);
       add(image);

       JMenuBar mainmenu= new JMenuBar();
       mainmenu.setBackground(Color.WHITE);
       setJMenuBar(mainmenu);
       


       JMenu user= new JMenu("User");
       user.setForeground(Color.RED);
       user.setFont(new Font(Font.DIALOG,Font.BOLD,18));
      
       
       newregistration = new JMenuItem("New Registeration");
       newregistration.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       newregistration.setForeground(Color.RED);
       newregistration.addActionListener(this);
       user.add(newregistration);

       JMenuItem viewprofile= new JMenuItem("View Profile");
       viewprofile.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       viewprofile.setForeground(Color.RED);
       viewprofile.addActionListener(this);
       user.add(viewprofile);

       JMenuItem editprofile= new JMenuItem("Edit Profile");
       editprofile.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       editprofile.setForeground(Color.RED);
       editprofile.addActionListener(this);
       user.add(editprofile);


       JMenu buspassholder = new JMenu("Bus Pass holders");
       buspassholder.setForeground(new Color(6, 61, 250));
       buspassholder.setFont(new Font(Font.DIALOG,Font.BOLD,18));
       

       JMenuItem pendingrequest= new JMenuItem("Pending request");
       pendingrequest.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       pendingrequest.setForeground(new Color(6, 61, 250));
       pendingrequest.addActionListener(this);
       buspassholder.add(pendingrequest);

       JMenuItem viewall= new JMenuItem("view bus pass holders");
       viewall.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       viewall.setForeground(new Color(6, 61, 250));
       viewall.addActionListener(this);
       buspassholder.add(viewall);

       
       JMenu bill= new JMenu("Bill");
       bill.setFont(new Font(Font.DIALOG,Font.BOLD,18));
       bill.setForeground(Color.RED);
       

       JMenuItem paymenthistory= new JMenuItem("Payment History");
       paymenthistory.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
       paymenthistory.setForeground(Color.RED);
       paymenthistory.addActionListener(this);
       bill.add(paymenthistory);


       JMenu renew= new JMenu("Renew Card");
       renew.setForeground(new Color(6, 61, 250));
       renew.setFont(new Font(Font.DIALOG,Font.BOLD,18));
       renew.addActionListener(this);
       


       JMenu scan= new JMenu("scan QR");
       scan.setForeground(Color.RED);
       scan.setFont(new Font(Font.DIALOG,Font.BOLD,18));
       scan.addActionListener(this);
      
       if(acctype.equals("Admin"))
       {
        mainmenu.add(buspassholder);
       }
       else if(acctype.equals("Bus Pass Holder"))
       {
        mainmenu.add(user);
        mainmenu.add(bill);
        mainmenu.add(renew);
        mainmenu.add(scan);
       
       }
      
      
       
       back= new JButton("Back");
       back.setBackground(new Color(6,61,250));
       back.setForeground(Color.WHITE);
       back.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
       back.setBounds(1320,20,100,25);
       image.add(back);
       back.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae)
    {  
        String click=ae.getActionCommand();
        if(click.equals("New Registeration"))
       {
        new newcustomer("");
       }
       else if(click.equals("View Profile"))
       {
         new viewpass(id);
       }
       else if(click.equals("Edit Profile"))
       {
        
       }
       else if(click.equals("Pending request"))
       {
         new pendingrequest();
       }
       else if(click.equals("view bus pass holders"))
       {
        new displaypass();
       }
       else if(click.equals("Payment History"))
       {
       
       }
      
       else if(click.equals("Renew Card"))
       {
        
       }
       else if(click.equals("scan QR"))
       {
        
       }
       else if(click.equals("Back"))
       {
        setVisible(false);
        new login();
       }
       
    }

    public static void main(String args[]) {
        new afterlogin("","");
        
    }
}