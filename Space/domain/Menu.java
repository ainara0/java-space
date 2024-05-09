package Space.domain;

import java.util.Scanner;

public class Menu {
    public static void welcomeMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("------------------------------Java Space Simulator------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("------------------------------------Welcome-------------------------------------");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("|0| Exit");
        System.out.println("|1| Start new simulation");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        switch (choice) {
            case 0 -> {}
            case 1 -> {mainMenu();}
            default -> {System.out.println("Invalid input. Please try again.");}
        }
    }
    public static void mainMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("------------------------------Java Space Simulator------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------------------Simulator menu---------------------------------");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("|0| Go back");
        System.out.println("|1| Manage lifeforms");
        System.out.println("|2| Manage celestial bodies");
        System.out.println("|3| Manage tools");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        switch (choice) {
            case 0 -> {}
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
        }
    }
}
