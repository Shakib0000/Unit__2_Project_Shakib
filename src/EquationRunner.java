import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome!\nEnter your first coordinate point: ");
        String input1 = s.nextLine();
        System.out.println("Enter your second coordinate point: ");
        String input2 = s.nextLine();

        LinearEquation linearEquation = new LinearEquation(input1, input2);
        System.out.println(linearEquation);

        System.out.println("Enter a third x-value: ");
        String input3 = s.nextLine();
        System.out.println("Solved coordinate point is: " + linearEquation.calculateCorrespondingPoint(Integer.parseInt(input3)));
    }
}