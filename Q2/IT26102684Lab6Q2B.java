import java.util.Scanner;

public class IT26102684Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int number;
        String result = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            result = result + number + " ";
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(result);

        input.close();
    }
}