import java.util.Scanner;
public class ExtendedArithmeticOps{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two a numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        System.out.println("Square: " +(number1*number1));
        System.out.println("Cube: " +(number1*number1*number1));
        scanner.close();
    }
}
