import java.util.Scanner;

import com.System.AppSystem;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // AppSystem system = new AppSystem();
        // system.displayMenu();
        print1();
        print2();
        scanner.close();
    }

    public static void print1() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
    }

    public static void print2() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
    }
}