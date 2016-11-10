package git_example;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc calc = new Calc();
        int a = input.nextInt();
        int b = input.nextInt();

        calc.add(a, b);
        calc.sub(a, b);
    }
}
