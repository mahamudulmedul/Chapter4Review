/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorinterger;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class FactorInterger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter an interger: ");
        int number = input.nextInt();
        System.out.println("The smallest factor of " + number + " is");

        int factor = 2;
        while (number != 0) {
            if (number % factor == 0) {
                number = number / factor;
                System.out.println(factor);
            } else {
                factor++;
            }
        }
    }

}
