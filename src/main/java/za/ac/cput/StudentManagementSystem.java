package za.ac.cput;

public class StudentManagementSystem {
    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent.createStudent()
                .setStudentId("240674774")
                .setName("Tebogo Pii")
                .setEmail("240674774@mycput.ac.za")
                .setDepartment("Information Technology")
                .setCreditHours(30)
                .setScholarshipAmount(50000.00)
                .create();

        GraduateStudent grad = new GraduateStudent.createStudent()
                .setStudentId("230990423")
                .setName("Amelia Hart")
                .setEmail("230990423@mycput.ac.za")
                .setDepartment("Information Technology")
                .setResearchAssistant(true)
                .setStipend(30000.00)
                .build();

        undergrad.displayDetails();
        grad.displayDetails();
    }
}
