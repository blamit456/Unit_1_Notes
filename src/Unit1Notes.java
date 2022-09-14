import java.util.Scanner;

public class Unit1Notes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your value for Pi");
        double myPiVal = keyboard.nextDouble();
        System.out.println("The value of Pi is "+ myPiVal);

        //clearing the buffer
        keyboard.nextLine();

        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("Your name is "+ name + ".");

        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("You are "+ age + " years old.");

        keyboard.nextLine();

        System.out.println("Why did Wyatt hate Mr. Black last year?");
        String answer = keyboard.nextLine();
        System.out.println("Wyatt hated Mr. Black because "+ answer + ", according to Wyatt.");
    }
}