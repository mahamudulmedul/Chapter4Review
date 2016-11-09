/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Medul
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final int numberOfPrime = 10;
       final int numberOfPrimePerLine = 2;
       int count = 0;
       int number = 2;
       
        System.out.println("The first 50 prime numbers are\n");
        
        while(count < numberOfPrime){
            boolean IsPrime = true;
            
            for(int divisor = 2; divisor <= number / 2;divisor++){
                if(number % divisor == 0)
                    IsPrime = false;
                break;
            }
        
        if(IsPrime){
            count++;
            if(count % numberOfPrimePerLine == 0){
                System.out.println(number);
            }
            else
                System.out.print(number + " ");
        }
        number++;
    }
    
}
}

