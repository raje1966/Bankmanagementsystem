package bank.management.system;

    import java.awt.Color;
    import java.awt.Font;
    import javax.swing.*;
    import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
   
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
    
    SignupTwo(String formno)
    {
     
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
              
        
        JLabel additionalDetails = new JLabel("PAGE 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
     
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christain", "Others"};
        
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
     
                       
        JLabel fname= new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCategory [] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
             
        JLabel jincome = new JLabel("Income:");
        jincome.setFont(new Font("Raleway", Font.BOLD, 20));
        jincome.setBounds(100, 240, 200, 30);
        add(jincome);
        
        String incomeCategory [] = {"null", "<1,50,000,", "<2,50,000", "<5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        
            
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        
        String educationValues [] = {"non-Graduate", "Graduate,", "PostGraduate", "Doctorate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
                             
        
        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway", Font.BOLD, 20));
        occu.setBounds(100, 390, 200, 30);
        add(occu);
        
        String occupationValues[] = {"Salaried", "Self-Employed,", "Businessman", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
             
                
        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);
     
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
     
        JLabel saadhar = new JLabel("Aadhar:");
        saadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        saadhar.setBounds(100, 490, 200, 30);
        add(saadhar);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
     
                
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        syes = new JRadioButton("Yes");       
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        
        eyes = new JRadioButton("Yes");        
        eyes.setBounds(300, 590, 200, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
     
     
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
            
     public void actionPerformed(ActionEvent ae) 
     {
        
         String sreligion = (String)religion.getSelectedItem();
         String scategory = (String)category.getSelectedItem();
         String sincome = (String)income.getSelectedItem();
         String seducation = (String)education.getSelectedItem();
         String soccupation = (String)occupation.getSelectedItem();
         
         
         
         String seniorcitizen = null;
         if(syes.isSelected()) 
         {
             seniorcitizen = "Yes";
             
         } else if (sno.isSelected()) 
         {
             seniorcitizen = "No";
             
         }
         
         
         
         String existingaccount = null;
         
         if (eyes.isSelected()) 
         {
             existingaccount = "Yes";
             
         } else if (eno.isSelected())
         {
             existingaccount = "No";
             
         } 
         
         String span = pan.getText();
         String saadhar = aadhar.getText();
      
         
         try  
         {
             
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+existingaccount+"', '"+seniorcitizen+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new signupThree(formno).setVisible(true);
                 
         } catch (Exception e)
         
         {
             System.out.println(e);
         }
         
     }      
    
    public static void main(String[] args) {
        
        new SignupTwo("");
                
    }
    
}

