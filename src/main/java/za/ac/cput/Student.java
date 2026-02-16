package za.ac.cput;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Type: " + getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }
}