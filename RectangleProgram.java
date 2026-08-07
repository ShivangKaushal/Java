import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = input.nextDouble();

        System.out.print("Enter breadth: ");
        double b = input.nextDouble();

        double area = l * b;
        double perimeter = 2 * (l + b);

        System.out.printf("Area of Rectangle: %.2f\n", area);
        System.out.printf("Perimeter of Rectangle: %.2f\n", perimeter);

        input.close();
    }
}