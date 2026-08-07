import java.util.Scanner;

import static java.lang.Math.*;
public class Task9 {
    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {

        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers separated with space: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        System.out.println("Sum: " +   add(num, num1));
        System.out.println("Difference: " +    subtract(num, num1));
        System.out.println("Product: " +   multiply(num, num1));
        System.out.println("Quotient: " +   divide(num, num1));


    }
}
