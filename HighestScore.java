/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestscore;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class HighestScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfStudent;
        double score;
        double highestScore = 0.0;
        String name;
        String sName = " ";
        int i;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Student: ");
        numberOfStudent = input.nextInt();
        
        for(i = 0 ; i < numberOfStudent ; i++){
            System.out.println("Enter Student Name: ");
            name = input.next();
            System.out.println("Enter Student Score: ");
            score = input.nextDouble();
            
            if(score > highestScore){
                highestScore = score;
                sName = name;
            }
        }
        System.out.println("Highest Score " + " Highest Score " + " By " + sName);
    }
    
}
