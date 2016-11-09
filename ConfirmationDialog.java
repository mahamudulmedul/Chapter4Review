/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmationdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Medul
 */
public class ConfirmationDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        
        int option = JOptionPane.YES_OPTION;
        
        while(option == JOptionPane.YES_OPTION){
            String dataString = JOptionPane.showInputDialog("Enter Value");
            
            int data = Integer.parseInt(dataString);
            
            sum += data;
            
            option = JOptionPane.showConfirmDialog(null, "Contiue?");
        }
        JOptionPane.showMessageDialog(null, "The sum is "+sum);
    }
    
}
