package scanner;

import java.util.Scanner;

public class TestScanner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our StuckHub Page!");

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your profession?");
        String profession = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Your name is "+name+". You are a "+age+" years old "+profession+".\nEnjoy our page!!");

    }

}
