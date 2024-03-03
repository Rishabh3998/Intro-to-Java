package CBSEBoardPercentage;
import java.util.Scanner;

public class PercentageCalculator {
    public static void calculatePercentage () {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextInt();
        double second = sc.nextInt();
        double third = sc.nextInt();
        double fourth = sc.nextInt();
        double fifth = sc.nextInt();

        int totalMarks = 500;
        double totalScoredMarks = first + second + third + fourth + fifth;

        double percentage = (totalScoredMarks / totalMarks) * 100;
        System.out.println(percentage);
    }
}
