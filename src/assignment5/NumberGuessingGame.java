package assignment5;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(50) + 1;
        System.out.println("Doan so ngau nhien tu 1 den 50: ");
        int number = 0;
        while(number != randomnumber) {
            System.out.println("Enter guess number: ");
            number = scanner.nextInt();
            if(number < randomnumber) {
                System.out.println("Your number is lower");
            } else{
                System.out.println("Your number is higher");
            }
        }
        System.out.println("Your number correctly !");
    }
    
}
