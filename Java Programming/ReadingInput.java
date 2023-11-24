import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        // Chaining Multiple Methods
        String name = scanner.nextLine().trim();
        System.out.println("Your Name is " + name);
    }
    
}
