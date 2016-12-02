/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilogramstopounds;

import java.text.DecimalFormat;

/**
 *
 * @author Medul
 */
public class KilogramsToPounds {

    /**
     * @param args the command line arguments
     */
   // @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kilograms      Pounds           Pounds         Kilograms");

        

        int i, j;
        double m, n;
        for (i = 1, j = 20; i <= 199; i = i + 2, j = j + 5) {
            m = i * 2.2;
            n = j / 2.2;

            System.out.println(i + "\t\t" + m+ "\t\t" + j + "\t\t" + n);
            System.out.println(i+"\t\t"+j+"\t\t");
        }
    }

}
