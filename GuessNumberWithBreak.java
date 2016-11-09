/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberwithbreak;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class GuessNumberWithBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = (int) (Math.random() * 101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Guess Number with 0 and 100");
        
        while(true){
            System.out.println("Enter Your guess");
            int guess = input.nextInt();
            
            if(guess == number){
                System.out.println("Yes, the number is "+number);
            break;
        }
        else if(guess > number)
            System.out.println("Your Guess too high");
            else
                System.out.println("Your Guess too low");
    }
    
}
}
