import java.util.Scanner;

public class QualityControl {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= 8; i++) {
                System.out.print("Enter weight for package " + i + ": ");
                double weight = scanner.nextDouble();

                if (weight == 0) {
                    continue;
                }

                if (weight > 100) {
                    break;
                }

                System.out.println("Package weight recorded: " + weight + " kg");
            }
        }
    }
}

