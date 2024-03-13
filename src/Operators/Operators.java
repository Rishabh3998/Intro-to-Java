package Operators;

import java.util.Scanner;

public class Operators {
    public static void additions () {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Using addition + operator
        int addition = num1 + num2;
        System.out.println(addition);
    }
}
