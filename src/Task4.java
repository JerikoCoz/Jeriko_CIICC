import  java.util.*;
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        StringBuilder strb = new StringBuilder(word).reverse();
         String str = strb.toString();

        if (word.equals(str)) {
            System.out.println("The input string is a palindrome.");
        }else{
            System.out.println("The input string is not a palindrome.");

        }




    }
}
