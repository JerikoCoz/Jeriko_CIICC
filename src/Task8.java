import java.util.Scanner;

public class Task8 {
    static int triangularSum(int... userInput){
        int comulativeSum = 0;
        for (int i = 0; i < userInput.length; i++) {
            int parameterSum = 0;
            int currentElement = userInput[i];
            while(currentElement > 0){

                parameterSum+=currentElement;


                currentElement--;
            }
            comulativeSum+=parameterSum;
            System.out.println("Parameter " + userInput[i] + ":" + "sum = " + parameterSum + ", " + "comulative sum = " + comulativeSum);

        }
     return comulativeSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers separated by space: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Total sum: " +triangularSum(num, num1, num2));




    }
}
