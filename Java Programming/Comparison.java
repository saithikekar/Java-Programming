import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

        if(number%5==0)
            System.out.print("The Number is Divisible by 5");

        else 
            System.out.print("Not Divisble by 5");

    }
    
}
