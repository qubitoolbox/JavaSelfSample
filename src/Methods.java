

/**
 *
 * @author Osman D
 */
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
public class Methods {
    
    
    // create 1D array for testing
    String[] strArr = {"Testing", "Testing2", "Testing3"};
    
    String getStringArray(){
       
        return strArr.toString(); // of course this doesnt work. Requires looping
    
    }
    
    public static void main(String[] args){
    
        Methods m = new Methods();
        JOptionPane.showMessageDialog(null, m.getStringArray(), "", JOptionPane.INFORMATION_MESSAGE);
        
    
    }
    
    
    
    
    
}
