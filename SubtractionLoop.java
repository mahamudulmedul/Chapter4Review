/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtractionloop;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class SubtractionLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NumberOfQuestion = 5;
        int correctcount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NumberOfQuestion) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number2;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + "-" + number2 + "?");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wrong\n" + number1 + "-" + number2 + "should be" + (number1 - number2));
            }
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctcount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }

}
