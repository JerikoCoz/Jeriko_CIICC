import java.util.Scanner;

public class Task7 {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static float divide(int a, int b) {

        return (float) a/b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers separated with space: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();


        System.out.println("Sum: " + add(num, num1));
        System.out.println("Difference: " + subtract(num, num1));
        System.out.println("Product: " + multiply(num, num1));


        System.out.println(num1 == 0 ? "Sorry, " + num + " cannot be divided to 0" :"Quotient: " + (int) divide(num, num1));


    }
}
