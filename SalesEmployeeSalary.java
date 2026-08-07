import java.util.Scanner;

public class SalesEmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        double travelAllowance = basicSalary * 0.15;
        double medicalAllowance = basicSalary * 0.08;
        double performanceBonus = basicSalary * 0.10;
        double taxDeduction = basicSalary * 0.05;

        double totalEarnings = basicSalary + travelAllowance + medicalAllowance + performanceBonus;
        double finalSalary = totalEarnings - taxDeduction;

        System.out.printf("Travel Allowance: %.2f\n", travelAllowance);
        System.out.printf("Medical Allowance: %.2f\n", medicalAllowance);
        System.out.printf("Performance Bonus: %.2f\n", performanceBonus);
        System.out.printf("Tax Deduction: %.2f\n", taxDeduction);
        System.out.printf("Total Earnings: %.2f\n", totalEarnings);
        System.out.printf("Final Salary: %.2f\n", finalSalary);

        input.close();
    }
}

