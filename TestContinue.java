/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontinue;

/**
 *
 * @author Medul
 */
public class TestContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        int sum = 0;
        
        while(number < 20){
            number++;
            if(number == 10 || number == 11)
                continue;
                sum += number;
        }
        System.out.println("the sum is "+sum);
    }
    
}
