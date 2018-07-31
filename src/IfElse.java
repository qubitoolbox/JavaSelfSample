//Osman D
import javax.swing.JOptionPane;

public class IfElse {
    //showcasing how if else statements work
    public static void main(String[] args){
    
    
        String firstname = "Osman";
        String middlename = "Danilo";
        String lastname = "Morales";
        String lastname1 = "Mena";
        
        boolean end1 = false;
        
        // prompt the user what name they would like to display
        String meniu = "HI! and welcome to my Program\n" + "Theres only four "
                + "choices available" + "\n" + "\n" + "1. Display My first name\n"
                +"2. Display My Middle Name\n" + "3.Display My Last Name\n" + 
                "4. Display my Other Last Name\n" + "5. Quit\n";
        
        System.out.println(meniu);
        
        
        
        
        do{
            
            
            if (meniu.equals("1")) {
                
                JOptionPane.showMessageDialog(null, "My first name is: " + firstname, "Hello",JOptionPane.INFORMATION_MESSAGE );
                
            }
            else if(meniu.equals("2")){
            
                JOptionPane.showMessageDialog(null, "My middle name is: " + middlename, "Hello",JOptionPane.INFORMATION_MESSAGE );
            
            }else if(meniu.equals("3")){
            
                JOptionPane.showMessageDialog(null, "My Last name is: " + lastname, "Hello",JOptionPane.INFORMATION_MESSAGE );
            
            }else if(meniu.equals("4")){
            
                JOptionPane.showMessageDialog(null, "My other last name is: " + lastname1, "Hello",JOptionPane.INFORMATION_MESSAGE );
            
            
            }else if(meniu.equals("5")){
            
            
                end1 = true;
            
            }
           
        }while(!end1);
        
        
        
        }
    
    
    }
    
    
    
    
    

