package git_example;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadz a i b");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Suma: " + (a + b));
    }
}
