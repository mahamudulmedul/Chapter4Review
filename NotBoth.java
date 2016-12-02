/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notboth;

/**
 *
 * @author Medul
 */
public class NotBoth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int count = 0;
        for (i = 100; i <= 200; i++) {
            if (count < 10) 
                if (i % 5 == 0 ^ i % 6 == 0) {
                    System.out.println(i + "");
                    count++;
                }

                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }

    }

