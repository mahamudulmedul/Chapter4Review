/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbreak;

/**
 *
 * @author Medul
 */
public class TestBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int number = 0;
        
        while(number < 10){
            number++;
            sum += number;
            if(sum >= 100)
               break;
        }
        System.out.println("the number is "+number);
        System.out.println("the sum is "+sum);
    }
    
}
