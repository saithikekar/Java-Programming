package Projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class calculator {
        public static void main(String[] args){
        // Declare Comstants 
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100 ;

        // Taking Inputs from the User
        Scanner scanner = new Scanner(System.in);
        int principalAmount = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        byte years = 0;
        int numberOfPayments = 0;

        while (true) {

            System.out.print("Enter the Principal Amount: ");
            principalAmount = scanner.nextInt();
            if (principalAmount >= 1000 && principalAmount<= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Enter the Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest>=1 && annualInterest<=30){
                monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the value between 1 and 30");   
        }
        
        while (true) {
            System.out.print("Enter the Period of Loan [Years]: ");
            years = scanner.nextByte();
            if (years>=1 && years <=30) {
                numberOfPayments = years*MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the Years between 1 and 30");   
        }

        double mortgage = principalAmount*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + formattedMortgage);

    }

    
}
