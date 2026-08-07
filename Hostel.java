public class Hostel {
    private String roomNumber;
    private String studentName;
    private String blockName;
    private double monthlyFees;

    public Hostel(final String roomNumber, final String studentName, final String blockName, final double monthlyFees) {
        this.roomNumber = roomNumber;
        this.studentName = studentName;
        this.blockName = blockName;
        this.monthlyFees = monthlyFees;
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Block Name: " + blockName);
        System.out.println("Monthly Fees: rs" + monthlyFees);
    }

    public static void main(String[] args) {
        Hostel student = new Hostel("104-A", "Ashesh", "North Block", 5500.00);
        student.display();
    }
}

