package bank.management.system;
  
import java.awt.*;
 import javax.swing.*;
import java.awt.event.*;


public class Pinchange extends JFrame implements ActionListener{
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    Pinchange(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel data=new JLabel("change pin");
        data.setForeground(Color.WHITE);
        data.setFont(new Font("System",Font.BOLD,16));
        data.setBounds(250,280,500,35);
        image.add(data);
        
        
         
        
         JLabel pindata=new JLabel("NEW PIN");
        pindata.setForeground(Color.WHITE);
        pindata.setFont(new Font("System",Font.BOLD,16));
        pindata.setBounds(165,320,180,25);
        image.add(pindata);
        
    pin=new  JPasswordField();
        pin.setFont(new Font("System",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        
         JLabel repindata=new JLabel("RE-ENTER PIN");
        repindata.setForeground(Color.WHITE);
        repindata.setFont(new Font("System",Font.BOLD,16));
        repindata.setBounds(165,360,180,25);
        image.add(repindata);
        
         repin=new  JPasswordField();
        repin.setFont(new Font("System",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
     change=new JButton("CHANGE");
        change.setBounds(355,450,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("BACK");
        back.setBounds(355,490,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
       }
public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"entered pin does not match");
                return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter pin");
                return;
            }
            
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-enter new pin");
                return;
            }
            Conn conn=new Conn();
            String query1="update bank set pin ='"+rpin+"' where pin='"+pinnumber+"' ";
           String query2="update login set pin ='"+rpin+"' where pin='"+pinnumber+"' ";
           String query3="update signupthree set pin ='"+rpin+"' where pin='"+pinnumber+"' ";
           
           
           conn.s.executeUpdate(query1);
           conn.s.executeUpdate(query2);
           conn.s.executeUpdate(query3);
           
          
           JOptionPane.showMessageDialog(null,"pin changed sccessfully");
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        
        
        }catch(Exception e){
            System.out.println(e);
        }
    }else{
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
        
    }
    
}
     public static void main(String args[]) {
        // TODO code application logic here
        new Pinchange("").setVisible(true);
    }
}
