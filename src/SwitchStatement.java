//Osman D
import javax.swing.JOptionPane;



public class SwitchStatement {
        
        //this class will demonstrate the use of switch statements with Java
        
        
        public static void main(String[] args){
        
        String input_ = "\tHello " + "\n" + "Options you can choose from" + "\n"
                 + "1. Message1\n" + "2. Message2\n" + "3. Quit Program\n";
        
        
        int meniu = GetData.getInt(input_);
        
            switch(meniu){

            case 1:
                JOptionPane.showMessageDialog(null, "Hi there", "Switch", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Welcome to my demonstration", "Switch", JOptionPane.INFORMATION_MESSAGE);
            break;
            default:
                System.exit(0);
            break;
            
                }
        
        
        }
        
        
        
        
        
        
        
        
        
        
    
}
