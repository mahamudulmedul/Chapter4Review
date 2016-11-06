/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class MathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = (int) (Math.random() * 10);

        int num = n % 9;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter two number:");
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
        //int answer = input.nextInt();
//        int number1 = 0;
//        int number2 = 0;
        if (num == 0) {
            System.out.println(num + "+" + num + "=" + (num + num));
        }

        if (num == 1) {
            System.out.println(+num + "-" + num + "=" + (num - num));
        }

        if (num == 2) {
            System.out.println(+num + "*" + num + "*" + (num * num));
        }
        if (num == 3) {
            System.out.println(+num + "/" + num + "/" + (num / num));
        }

        if (num == 4) {
            System.out.println(+num + "%" + num + "%" + (num % num));
        }
        if (num == 5) {
            System.out.println(+num + "<" + num + "<" + (num < num));
        }
        if (num == 6) {
            System.out.println(+num + "<=" + num + "<=" + (num <= num));
        }
        if (num == 7) {
            System.out.println(+num + ">" + num + ">" + (num > num));
        }
//         if(num==8){
//             System.out.println(+num+"=>"+num+"=>"+(num=>num));
//         }
//        
    }

}
