/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tution;

/**
 *
 * @author Medul
 */
public class Tution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        double t = 10000;
        double temp = 0;

        System.out.println("Year          Tution");
        while (i <= 10) {
            t = (t * .05) + t;
            System.out.printf(i + "             %.2f\n", t);
            i++;
            if (i <= 4) {
                temp = temp + t;
            }
        }
        System.out.println("Total Cost Of Four Years:" + temp);
    }

}
