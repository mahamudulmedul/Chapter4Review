/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelvalue;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class SentinelValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an int value (the programms exits if the input is 0):");
        int data = input.nextInt();
        
        int sum = 0;
        while(data != 0){
            sum += data;
            System.out.println("Enter an int value (the programms exits if the input is 0):");
            data =input.nextInt();
        }
        System.out.println("The sum is "+sum);
    }
    
}
