import PracticeSet.PracticeSetSolutions;

public class Main {
    public static int addThreeNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        // How to print in Java
        System.out.println("Hello World");

        // How to use functions in Java
        int result = addThreeNumbers(1,2,3);
        System.out.println(result);

        // PercentageCalculator.calculatePercentage();

        // Practice set solutions
        // 1. Write a program to sum three numbers in Java.
        int sumOfGivenNumbers = PracticeSetSolutions.sumThreeNumbers(2,3,5); // 10
        System.out.println(sumOfGivenNumbers);

        // 2. Write a program to calculate CGPA using marks of three subjects
        double cgpa = PracticeSetSolutions.calculateCGPA(8,9,10);
        System.out.println(cgpa);

        // 3. Write a program to fetch username and greet the user
        // Greet format: Hello <name>, have a good day.
        System.out.println(PracticeSetSolutions.greet("Rishabh"));

        // 4. Write a java program to convert kilometers to miles
        System.out.println(PracticeSetSolutions.kmToMiles(10));

        // 5. Write a java program to check whether the number given is integer or not.
        PracticeSetSolutions.isInteger();
    }
}