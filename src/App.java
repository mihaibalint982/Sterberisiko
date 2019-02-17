import com.spengermed.hbgm.Patient;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = null;
        int age = 0;
        int height = 0;
        float meanHGS = 0;

        System.out.print("Please enter user name : ");
        name = in.nextLine();
        System.out.print(name + " please enter age: ");
        age = Integer.parseInt(in.nextLine());
        System.out.print(name + " please enter hight: ");
        height = Integer.parseInt(in.nextLine());
        System.out.print(name + " please enter meanHGS: ");
        meanHGS = Float.parseFloat(in.nextLine());

        Patient p = new Patient(name, age, height, meanHGS);
        System.out.println("risk: " + p.getRisk());
    }
}
