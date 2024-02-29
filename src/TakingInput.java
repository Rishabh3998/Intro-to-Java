import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 to 100");
//        int num1 = sc.nextInt();
//        float num1f = sc.nextFloat();
//        System.out.println("Please enter one more number within the same range");
//        int num2 = sc.nextInt();
//        float num2f = sc.nextFloat();
//        int sum = num1 + num2;
//        System.out.println(sum);

        System.out.println("Enter a sentence");
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
