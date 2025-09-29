
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("The number is  " + number);

        input.nextLine();
        System.out.println("Enter the String");
        String text = input.nextLine();
        System.out.println("The String  is  " + text);

        System.out.println("Enter  single word  ");
        String str1 = input.next();
        System.out.println(" string is  " + str1);

        input.close();

    }
}
