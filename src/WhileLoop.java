//Osman D
import javax.swing.JOptionPane;


public class WhileLoop {
    
    
    //this program demonstrates the do while loop in action
    // it will maintain a program running untill user inputs
    // to quit the program
    public static void main(String[] args){
    boolean quits = false;
    do{
        
        String meniu = "While Loop Demo\n" + "Select a choice\n" + "1.Message1\n" + 
                "2.Message2\n" + "3.QUIT";
        
        int menu1 = GetData.getInt(meniu);
        
        switch(menu1){
        
        
            case 1:
                JOptionPane.showMessageDialog(null, "For Demonstration Only \n"
                        +"You have selected Option 1!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "For Demonstration Only \n"
                        +"You have selected Option 2!", "Hi there!", JOptionPane.INFORMATION_MESSAGE);
            break;
            
            case 3:
                quits = true;
            break;
            
            default:
                break;
                   
        
        }
        }while(!quits);
    
            }
    
    
}
