import java.util.Scanner;

public class WaterUsage {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter monthly water consumption (in kilolitres): ");
            int consumption = input.nextInt();
            
            if (consumption >= 0 && consumption <= 50) {
                System.out.println("Category: Economical");
            } else if (consumption >= 51 && consumption <= 100) {
                System.out.println("Category: Normal");
            } else if (consumption >= 101 && consumption <= 150) {
                System.out.println("Category: Excessive");
            } else if (consumption > 150) {
                System.out.println("Category: Critical");
            }
        }
    }
}
