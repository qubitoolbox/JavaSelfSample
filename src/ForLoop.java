//Osman D
import javax.swing.JOptionPane;


public class ForLoop {
    
    //create vector
    int[] ofArrayJ = {4,3,2,1,0,-1};
    //create 2D array
    int[][] ofArrayMM = {{4,3,2,1,0,-1},{4,3,2,1,0,-1}};
    
    
    //creates a for loop that goes through every elemnt
    void outPut(){
        
        for (int i = 0; i < ofArrayJ.length; i++) {
            
            JOptionPane.showMessageDialog(null, ofArrayJ[i], "Array Content", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    //creates a for loop that loops through every element in array
    void outPut2D(){
    
    
        for (int i = 0; i< ofArrayMM.length; i++){
        
            for(int j = 0; j < ofArrayMM[i].length; j++){
            
                JOptionPane.showMessageDialog(null, ofArrayMM[i][j], "2D Array Content", JOptionPane.INFORMATION_MESSAGE);
            
            }
        
        }
        
    }
    
    public static void main(String[] args){
        
        //creates new object of ForLoop class
        ForLoop fl = new ForLoop();
        fl.outPut(); //calls mutator
        
        JOptionPane.showMessageDialog(null, "Okay now the next round of ouput", "2D Array", JOptionPane.INFORMATION_MESSAGE);
        
        fl.outPut2D();
        
        
        
    }
    
    
    
}
