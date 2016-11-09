/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdowhile;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class TestDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Enter an int value (the programms exits if the input is 0):");
            data = input.nextInt();
            sum += data;
        }
        while(data!=0);
        System.out.println("the sum is"+sum);
    
    }
    
}
