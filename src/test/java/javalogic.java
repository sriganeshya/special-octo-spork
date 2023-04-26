import java.util.Scanner;

public class javalogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if (age >= 18 && age <= 25) {
            System.out.println("Your age is in the range of 18 to 25.");
        } else {
            System.out.println("Your age is not in the range of 18 to 25.");
        }
    }
}
