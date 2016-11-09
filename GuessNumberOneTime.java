/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberonetime;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class GuessNumberOneTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = (int) (Math.random()*101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("guess a magic number 0 to 100:");
        
        int guess = -1;
        
        while(guess!=number){
        System.out.println("Enter your guess:");
        guess = input.nextInt();
        if(guess == number)
            System.out.println("yes the number is "+number);
        else if(guess>number)
            System.out.println("your guess is too high");
        else
            System.out.println("your guess is too low");
    }
    
}
}
