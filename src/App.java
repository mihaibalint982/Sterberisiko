import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    private String Patient;
    public static void main(String[] args) {

        String username = null;
        Console console = System.console();
        username = console.readLine("Please enter user name : ");
        System.out.println("You entered : " + username);


    }
}

/*
        // ====
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You entered : " + username);

        // ===== In Java 5, Java.util,Scanner is used for this purpose.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter user name : ");
        username = in.nextLine();
        System.out.println("You entered : " + username);


        // ====== Java 6
        Console console = System.console();
        username = console.readLine("Please enter user name : ");
        System.out.println("You entered : " + username);
 */
