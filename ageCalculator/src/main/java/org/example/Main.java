package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner;
        int age;
        int yearsToCentury;

        scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        yearsToCentury = 100 - age;
        System.out.println("You have " + yearsToCentury + " years left until you turn 100 years old!");
    }
}
