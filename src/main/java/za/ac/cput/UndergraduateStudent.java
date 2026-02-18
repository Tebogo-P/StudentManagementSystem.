package za.ac.cput;

public class UndergraduateStudent extends Student {

    protected double creditHours;
    protected double scholarshipAmount;

    private UndergraduateStudent(createStudent createStudent) {
        this.studentId = createStudent.studentId;
        this.name = createStudent.name;
        this.email = createStudent.email;
        this.department = createStudent.department;
        this.creditHours = createStudent.creditHours;
        this.scholarshipAmount = createStudent.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return (creditHours * 2750.00) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: R" + scholarshipAmount);
        System.out.println("Total Tuition Due: R" + calculateTuition());
    }

    public static class createStudent {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private double creditHours;
        private double scholarshipAmount;

        public createStudent setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public createStudent setName(String name) {
            this.name = name;
            return this;
        }

        public createStudent setEmail(String email) {
            this.email = email;
            return this;
        }

        public createStudent setDepartment(String department) {
            this.department = department;
            return this;
        }

        public createStudent setCreditHours(double creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public createStudent setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}