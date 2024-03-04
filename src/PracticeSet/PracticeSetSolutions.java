package PracticeSet;

import java.util.Scanner;

public class PracticeSetSolutions {
    public static int sumThreeNumbers (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double calculateCGPA (double subject1, double subject2, double subject3) {
        return ((subject1 + subject2 + subject3) / 30) * 10;
    }

    public static String greet (String name) {
        return "Hello " + name + ", have a good day";
    }

    public static double kmToMiles (double kilometers) {
        // 1 km = 0.62137119
        return kilometers * 0.62137119;
    }

    public static void isInteger () {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
