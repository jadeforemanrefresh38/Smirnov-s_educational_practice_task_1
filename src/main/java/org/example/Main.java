package org.example;
import java.util.Scanner;

public class Main {
    public static String ageMeter(int age) {

        if (age >= 0 && age < 18) {
            return "Ты ребенок";
        }
        else if (age >= 18 && age <= 35) {
            return "Ты молод и полон сил";
        }
        else {
            return "Ты старик";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напиши свой возраст и я скажу тебе кто ты: ");
        int age = scanner.nextInt();
        System.out.println(ageMeter(age));
    }
}