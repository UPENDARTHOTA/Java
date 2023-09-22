package bank.management.system;
 import javax.swing.*;
 import java.awt.*;
 import java.util.*;
 import com.toedter.calendar.JDateChooser;
 import java.awt.event.*;
 import java.sql.*;
 
/**
 *
 * @author thota
 */
public class Signupone  extends JFrame implements ActionListener{
     long random;
     JTextField nameTextField,FnameTextField,MnameTextField,emailTextField,addTextField,cityTextField,stateTextField,pincodeTextField;
     JButton next;
     JRadioButton male,female,married,unmarried;
     JDateChooser datechooser; 
     

     Signupone(){
         setLayout(null);
         Random ram=new Random();
        random=Math.abs((ram.nextLong()%9000L)+1000L);
        
         
         JLabel formno=new JLabel("Application form no."+random);
           formno.setFont(new Font("Raleway",Font.BOLD,38));
           formno.setBounds(140,20,600,40);
           add(formno);
           
           JLabel PersonalDetails=new JLabel("Page1 Personal Details ");
           PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
           PersonalDetails.setBounds(290,80,400,30);
           add(PersonalDetails);
           
           JLabel Name=new JLabel("Name       : ");
           Name.setFont(new Font("Raleway",Font.BOLD,20));
           Name.setBounds(100,140,160,30);
           add(Name);
           
             nameTextField=new JTextField();
           nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
           nameTextField.setBounds(300,140,400,30);
           add(nameTextField);
           
           JLabel FName=new JLabel("Father's Name : ");
           FName.setFont(new Font("Raleway",Font.BOLD,20));
           FName.setBounds(100,190,200,30);
           add(FName);
           
            FnameTextField=new JTextField();
           FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
           FnameTextField.setBounds(300,190,400,30);
           add(FnameTextField);
           
           
           JLabel MName=new JLabel("Mother's Name : ");
           MName.setFont(new Font("Raleway",Font.BOLD,20));
           MName.setBounds(100,240,200,30);
           add(MName);
           
          MnameTextField=new JTextField();
           MnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
           MnameTextField.setBounds(300,240,400,30);
           add(MnameTextField);
           
           
           JLabel Dob=new JLabel("Date of Birth : ");
               Dob.setFont(new Font("Raleway",Font.BOLD,20));
           Dob.setBounds(100,290,200,30);
           add(Dob);
           
           
             datechooser=new JDateChooser();
           datechooser.setBounds(300,290,400,30);
           add(datechooser);
           
           
           JLabel gender=new JLabel("Select Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
     gender.setBounds(100,340,200,30);
           add(gender);
           
           male=new JRadioButton("Male");
           male.setBounds(300,340,60,30);
           male.setBackground(Color.GREEN);
           add(male);
           
              female=new JRadioButton("Female");
           female.setBounds(500,340,90,30);
            female.setBackground(Color.GREEN);
           add(female);
           
           ButtonGroup gendergroup=new ButtonGroup();
           gendergroup.add(male);
           gendergroup.add(female);
            
           
           
           JLabel email=new JLabel("email : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
          email.setBounds(100,390,200,30);
           add(email);
           
           emailTextField=new JTextField();
           emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
           emailTextField.setBounds(300,390,400,30);
           add(emailTextField);
           
           
           JLabel marital=new JLabel("marital status : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,440,200,30);
           add(marital);
           
           
             married=new JRadioButton("Married");
           married.setBounds(300,440,70,30);
           married.setBackground(Color.GREEN);
           add(married);
           
             unmarried=new JRadioButton("Unmarried");
           unmarried.setBounds(500,440,90,30);
            unmarried.setBackground(Color.GREEN);
           add(unmarried);
           
           ButtonGroup maritalgroup=new ButtonGroup();
           maritalgroup.add(married);
           maritalgroup.add(unmarried);
           
            
           
           
           
             JLabel address=new JLabel("Address: ");
       address.setFont(new Font("Raleway",Font.BOLD,20));
    address.setBounds(100,490,200,30);
           add(address);
           
             addTextField=new JTextField();
           addTextField.setFont(new Font("Raleway",Font.BOLD,14));
           addTextField.setBounds(300,490,400,30);
           add(addTextField);
           
           
             JLabel city=new JLabel("city: ");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,540,200,30);
           add(city);
           
             cityTextField=new JTextField();
           cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
           cityTextField.setBounds(300,540,400,30);
           add(cityTextField);
           
           
             JLabel state=new JLabel("State : ");
      state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(100,590,200,30);
           add(state);
           
            stateTextField=new JTextField();
           stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
           stateTextField.setBounds(300,590,400,30);
           add(stateTextField);
           
           
           
             JLabel pincode=new JLabel("Pincode : ");
      pincode.setFont(new Font("Raleway",Font.BOLD,20));
      pincode.setBounds(100,640,200,30);
           add(pincode);
           
           pincodeTextField=new JTextField();
           pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
           pincodeTextField.setBounds(300,640,400,30);
           add(pincodeTextField);
           
           
         next = new JButton("next");
           next.setBackground(Color.black);
           next.setForeground(Color.WHITE);
           next.setFont(new Font("Raleway",Font.BOLD,14));
           next.setBounds(620,690,80,30);
           next.addActionListener(this);
           add(next);
           
           
         
 
         getContentPane().setBackground(Color.GREEN);
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);
     
     }
     @Override
     public void actionPerformed (ActionEvent ae){
         String formno=""+random;
         String name=nameTextField.getText();
         String fname=FnameTextField.getText();
         String mname=MnameTextField.getText();
         String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
         String gender=null;
         if(male.isSelected()){
             gender="Male";
         }else if(female.isSelected()){
             gender="Female";
         }
         
         String email=emailTextField.getText();
         String marital=null;
         if(married.isSelected()){
             marital="married";
         }else if(unmarried.isSelected()){
marital="unmarried";         }
         
        String address=addTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pincodeTextField.getText();
        
        try{
            if(name.equals("")){
               JOptionPane.showMessageDialog(null,"name is required ");
              }else{
                Conn C=new Conn();
   
              //  String query="insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+mname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
               String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                
                    C.s.executeUpdate(q1);
                
                
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }
        }catch(Exception e){
             System.out.println(e);
             
 
        }     
     }
     
     public static void main(String args[]) {
        // TODO code application logic here
        new Signupone();
    } 
 
}
