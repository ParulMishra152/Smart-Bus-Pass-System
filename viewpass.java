import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class viewpass extends JFrame
{
    JLabel name,tfrom,tto,ntrips,uid;
    String id;
    viewpass(String id)
    {
      this.id=id;  
      setVisible(true);
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);

      JLabel heading = new JLabel("View Pass");
      heading.setBounds(520,2,900,100);
      heading.setForeground(new Color(242, 46, 118));
      heading.setFont(new Font("SansSerif",Font.BOLD,70));
      add(heading);

      JPanel p= new JPanel();
      p.setBounds(680,250,500,250);
      p.setBackground(new Color(145, 211, 237));
      p.setLayout(null);
      add(p);
      
      JLabel luid = new JLabel("UID :");
      luid.setBounds(20,10,80,20);
      luid.setForeground(Color.BLACK);
      luid.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(luid);
      uid= new JLabel("");
      uid.setBounds(190,10,80,20);
      uid.setForeground(Color.BLACK);
      uid.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(uid);

      JLabel lname = new JLabel("Name :");
      lname.setBounds(20,60,160,20);
      lname.setForeground(Color.BLACK);
      lname.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(lname);
      name = new JLabel("");
      name.setBounds(190,60,160,20);
      name.setForeground(Color.BLACK);
      name.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(name);

      JLabel lfrom = new JLabel("Traveling From :");
      lfrom.setBounds(20,110,160,20);
      lfrom.setForeground(Color.BLACK);
      lfrom.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(lfrom);
      tfrom = new JLabel("");
      tfrom.setBounds(190,110,160,20);
      tfrom.setForeground(Color.BLACK);
      tfrom.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(tfrom);

      JLabel lto = new JLabel("Travelling To :");
      lto.setBounds(20,160,160,20);
      lto.setForeground(Color.BLACK);
      lto.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(lto);
      tto = new JLabel("");
      tto.setBounds(190,160,160,20);
      tto.setForeground(Color.BLACK);
      tto.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(tto);

      JLabel ltrips = new JLabel("No of Trips :");
      ltrips.setBounds(20,210,160,20);
      ltrips.setForeground(Color.BLACK);
      ltrips.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(ltrips);
      ntrips = new JLabel("");
      ntrips.setBounds(190,210,160,20);
      ntrips.setForeground(Color.BLACK);
      ntrips.setFont(new Font("SansSerif",Font.BOLD,17));
      p.add(ntrips);

      try
      { 
        String uidnumber=id;
        conn c= new conn();
        ResultSet rs= c.s.executeQuery("Select * from customer where uidno='"+uidnumber+"'");
        while(rs.next())
        {
            name.setText(rs.getString("name"));
            tfrom.setText(rs.getString("frompoint"));
            tto.setText(rs.getString("topoint"));
            ntrips.setText(rs.getString("passduration"));
            uid.setText(rs.getString("uidno"));
        }
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }

public static void main(String[] args)
{
  new viewpass("");  
}
}
