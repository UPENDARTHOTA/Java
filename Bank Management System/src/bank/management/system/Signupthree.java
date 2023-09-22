 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signupthree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton cancel,submit;
    String formno;
    Signupthree( String formno){
        this.formno=formno;
        setLayout(null);
        
        JLabel l1=new JLabel("page 3 : Account details");
        l1.setFont(new Font("raleway", Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("raleway", Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.RED);
        r1.setBounds(100,180,200,20); 
        add(r1);
         
        r2=new JRadioButton("Fied deposit acoount");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.RED);
        r2.setBounds(350,180,200,20); 
        add(r2);
        
         
        r3=new JRadioButton("cuurent Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.RED);
        r3.setBounds(100,220,200,20); 
        add(r3);
        
         
        r4=new JRadioButton("Recurrin Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.RED);
        r4.setBounds(350,220,200,20); 
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        
                groupaccount.add(r1);
                 groupaccount.add(r2);
                  groupaccount.add(r3); 
                  groupaccount.add(r4);

        JLabel card=new JLabel("card-no");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("xxxx-xxxx-xxxx-4818");
        number.setFont(new Font("RALEWAY",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetails=new JLabel("Your 16 digit Card number ");
      carddetails.setFont(new Font("RALEWAY",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);
        
        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber=new JLabel("xxxx");
        pnumber.setFont(new Font("RALEWAY",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
         JLabel pindetails=new JLabel("Your 4 digit pin number ");
      pindetails.setFont(new Font("RALEWAY",Font.BOLD,12));
        pindetails.setBounds(100,390,200,20);
        add(pindetails);
        
        JLabel services=new JLabel("Services required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,200,30);
        add(services);
        
        
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.RED);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,20);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.RED);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,20);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.RED);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,20);
        add(c3);
        
        c4=new JCheckBox("Email and SMS Alert");
        c4.setBackground(Color.RED);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,20);
        add(c4);
        
        c5=new JCheckBox("Check Book");
        c5.setBackground(Color.RED);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,20);
        add(c5);
        
        c6=new JCheckBox("E-statement");
        c6.setBackground(Color.RED);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,20);
        add(c6);
        
         c7=new JCheckBox("I here by declare that the above entered details are correct as per my knowledge");
        c7.setBackground(Color.RED);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,680,650,20);
        add(c7);
        
        
        submit=new JButton("submit");
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,18));
        submit.setBounds(400,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
          
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLUE);
       cancel.setForeground(Color.WHITE);
      cancel.setFont(new Font("Raleway",Font.BOLD,18));
       cancel.setBounds(520,720,100,30);
       cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        getContentPane().setBackground(Color.YELLOW);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        
      }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit)
        {
            String accounttype=null;
            if(r1.isSelected()){
                accounttype="Savings Account";
            }else if(r2.isSelected()){
                accounttype="Fied deposit account"; 
            }else if(r3.isSelected()){
                accounttype="current account"; 
            }else if(r4.isSelected()){
                accounttype="Recurring Deposit account"; 
            }
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%9000000L)+5040936006000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM CARD";
            }
            else if(c2.isSelected()){
                facility=facility+"Intenet Banking";
            }else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+"Email sms alert";
            }else if(c5.isSelected()){
                facility=facility+"cheque Book";
            }else if(c6.isSelected()){
                facility=facility+"E-Statement";
            }
            
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is required");
                }else{
                    Conn conn=new Conn();
                    
                    String query1="insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    
                    
                    
                    JOptionPane.showMessageDialog(null,"cardnumber : " + cardnumber + "\n Pin :"+pinnumber);
                        setVisible(false);
                        new Deposit(pinnumber).setVisible(true);
                
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource()==cancel){
           setVisible(false);
           new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        
        new Signupthree("");
    }

}