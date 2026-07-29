import java.util.*;
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <Integer> l = new ArrayList<>();

        System.out.print("Enter 3 numbers separated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        l.add(num1);
        l.add(num2);
        l.add(num3);


        if(l.get(0) == l.get(1) && l.get(0) == l.get(2)) {
            System.out.println("All numbers are equal");
        }else{
            System.out.println("The largest number is: " + Collections.max(l));
        }





    }
}
