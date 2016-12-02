/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingwhile1;

/**
 *
 * @author Medul
 */
public class UsingWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 0;
        while(Math.pow(n, 3) < 12000){
            n++;
        }
        System.out.println("The n is " + n);
        System.out.println("The n^3 is " + Math.pow(n-1, 3));
    }
    
}
