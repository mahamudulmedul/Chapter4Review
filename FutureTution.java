/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretution;

/**
 *
 * @author Medul
 */
public class FutureTution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tution = 10000;
        int year = 1;
        while(tution < 20000){
            tution = tution * 1.07;
            year ++;
            
        }
        System.out.println("tution will be double in "+ year + " year");
    }
    
}
