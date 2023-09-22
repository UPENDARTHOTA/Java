
 package bank.management.system;
 import javax.swing.*;
 import java.awt.*;
  
 
 import java.awt.event.*;
  
 
 
public class Signuptwo  extends JFrame implements ActionListener{
   
     JTextField aadhar,pan;
     JButton next;
     JRadioButton syes,sno ,eyes,eno;
     
     JComboBox religion,occupation,category,education,income;
String formno;
     Signuptwo( String formno){
         setLayout(null);
         this.formno=formno;
          
        
         setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
          
         
         
           
           JLabel additionalDetails=new JLabel("Additional details ");
           additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
           additionalDetails.setBounds(290,80,400,30);
           add(additionalDetails);
           
           JLabel Name=new JLabel("Religion  : ");
           Name.setFont(new Font("Raleway",Font.BOLD,20));
           Name.setBounds(100,140,160,30);
           add(Name);
           
           String valreligion[]={"Choose","Hindu","Muslim","Christian","Sikh","Other"};
             religion=new JComboBox(valreligion);
           religion.setBounds(300,140,400,30);
           religion.setBackground(Color.GREEN);
           add(religion);
           
           
           
           
             
           
           JLabel FName=new JLabel("Category ");
           FName.setFont(new Font("Raleway",Font.BOLD,20));
           FName.setBounds(100,190,200,30);
           add(FName);
           
            String valcategory[]= {"select category","general","bc","oc","sc","st"};
           category=new JComboBox(valcategory);
           category.setBounds(300,190,400,30);
           category.setBackground(Color.GREEN);
           add(category);
             
           
           
           JLabel MName=new JLabel("Income ");
           MName.setFont(new Font("Raleway",Font.BOLD,20));
           MName.setBounds(100,240,200,30);
           add(MName);
           
            String valincome[]= {"select ","Null",">50000",">100000",">200000",">500000"};
          income=new JComboBox(valincome);
           income.setBounds(300,240,400,30);
          income.setBackground(Color.GREEN);
           add(income);
             
           
           
           JLabel Dob=new JLabel("Education ");
               Dob.setFont(new Font("Raleway",Font.BOLD,20));
           Dob.setBounds(100,290,200,30);
           add(Dob);
           JLabel gender=new JLabel("Qualification  ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
     gender.setBounds(100,310,200,30);
           add(gender);
           
           
            String valeducation[]= {"Non-Graduatiion ","10 pass","Intermediate","Graduation","Post Graduation","Phd"};
            education=new JComboBox(valeducation);
        education.setBounds(300,300,400,30);
         education.setBackground(Color.GREEN);
           add(education);
          
            
           
           
           JLabel email=new JLabel("Occupation");
        email.setFont(new Font("Raleway",Font.BOLD,20));
          email.setBounds(100,350,200,30);
           add(email);
           
           String valoccupation[]= {"salaried ","self-employed","waged","business"," Sgtudent","Retired"};
           occupation=new JComboBox(valoccupation);
       occupation.setBounds(300,350,400,30);
      occupation.setBackground(Color.GREEN);
           add(occupation);
           
           
           JLabel paddress=new JLabel("PAN number ");
       paddress.setFont(new Font("Raleway",Font.BOLD,20));
    paddress.setBounds(100,400,200,30);
           add(paddress);
           
             pan=new JTextField();
           pan.setFont(new Font("Raleway",Font.BOLD,14));
         pan.setBounds(300,400,400,30);
           add(pan);
           
            
           
           
           
             JLabel address=new JLabel("Aadhar number ");
       address.setFont(new Font("Raleway",Font.BOLD,20));
    address.setBounds(100,450,200,30);
           add(address);
           
             aadhar=new JTextField();
           aadhar.setFont(new Font("Raleway",Font.BOLD,14));
           aadhar.setBounds(300,450,400,30);
           add(aadhar);
           
           
             JLabel city=new JLabel("Senior citezen: ");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,500,200,30);
           add(city);
           
          syes=new JRadioButton("Yes");
           syes.setBounds(300,500,200,30);
         syes.setBackground(Color.GREEN);
           add(syes);
           
             sno= new JRadioButton("no");
         sno.setBounds(500,500,200,30);
         sno.setBackground(Color.GREEN);
           add( sno);
           
           ButtonGroup maritalgroup=new ButtonGroup();
           maritalgroup.add(syes);
           maritalgroup.add(sno);
           
           
           
             
           
           
             JLabel state=new JLabel("Eisting account");
      state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(100,550,200,30);
           add(state);
           
           eyes=new JRadioButton("Yes");
           eyes.setBounds(300,550,200,30);
         eyes.setBackground(Color.GREEN);
           add(eyes);
           
             eno= new JRadioButton("no");
         eno.setBounds(500,550,200,30);
         eno.setBackground(Color.GREEN);
           add( eno);
           
           ButtonGroup account=new ButtonGroup();
           account.add(syes);
        account.add(sno);
           
     
           
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
     public void actionPerformed (ActionEvent ae){
         
                  
         String sreligion=(String)religion.getSelectedItem();
          String scategory=(String)category.getSelectedItem();
           String sincome=(String)income.getSelectedItem();
            String seducation=(String)education.getSelectedItem();
             String soccupation=(String)occupation.getSelectedItem();
         String seniorcitizen =  null;
         if(syes.isSelected()){
             seniorcitizen="yes";
         }else if(sno.isSelected())
         {
             seniorcitizen="no";
         }
         
        
         String eistingaccount=null;
         if(eyes.isSelected()){
             eistingaccount="yes";
         }else if(eno.isSelected()){
            eistingaccount="no";         }
         
        String span=pan.getText();
        String saadhar=aadhar.getText();
        try{
             
                Conn c=new Conn();
   
              //  String query="insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+mname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
               String q2 = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+eistingaccount+"')";
                
                c.s.executeUpdate(q2);
                
                setVisible(false);
              new Signupthree(formno).setVisible(true);
            
        }catch(Exception e){
             System.out.println(e);
             
 
        }     
     }
     
     public static void main(String args[]) {
        // TODO code application logic here
        new Signuptwo("");
    } 
 
}
