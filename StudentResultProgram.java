import java.util.Scanner;

public class StudentResultProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter three marks (out of 100): ");
        double m1 = input.nextDouble();
        double m2 = input.nextDouble();
        double m3 = input.nextDouble();
        double total = m1 + m2 + m3;
        double percentage = total / 3;        
        boolean passedAllSubjects = (m1 >= 40 && m2 >= 40 && m3 >= 40);
        String result = (percentage >= 40 && passedAllSubjects) ? "Pass" : "Fail";
        System.out.println("\n--- Student Result ---");
        System.out.println("Student Name: " + name);
        System.out.printf("Percentage: %.2f%% - Result: %s\n", percentage, result);
        input.close();
    }
}