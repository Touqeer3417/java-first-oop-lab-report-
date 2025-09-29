import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the "+ (i+1)+ " numbers");

            numbers[i] = input.nextInt();

        }
        for (int i : numbers) {
            System.out.println(i);
        }

        input.close();

    }
}
