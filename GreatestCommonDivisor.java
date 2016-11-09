/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestcommondivisor;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Interger:");
        int n1 = input.nextInt();
        System.out.println("Enter second interger:");
        int n2 = input.nextInt();
        
        int gcd = 1;
        int k = 2;
        while (k<=n1&&k<=n2){
            if(n1%k==0&&n2%k==0)
                gcd = k;
            k++;
        }
        System.out.println("the greatest common divisor " + n1 + " and " + n2 + " is " + gcd);
    }
    
}
