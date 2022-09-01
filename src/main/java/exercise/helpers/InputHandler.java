package exercise.helpers;

import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static int getLowerDate(){
        System.out.println("Provide the lower date");
        return scanner.nextInt();
    }

    public static int getHigherDate(){
        System.out.println("Provide the higher date");
        return scanner.nextInt();
    }

    public static String getFirstName(){
        System.out.println("Provide the actor/actress first name");
        return scanner.nextLine();
    }

    public static String getLastName(){
        System.out.println("Provide the actor/actress last name");
        return scanner.nextLine();
    }
}
