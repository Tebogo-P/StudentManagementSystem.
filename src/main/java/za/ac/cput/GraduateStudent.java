package za.ac.cput;

public class GraduateStudent extends Student {

    protected boolean researchAssistant;
    protected double stipend;
    private static final double tuition = 60000.00;

    private GraduateStudent(createStudent student) {
        this.studentId = student.studentId;
        this.name = student.name;
        this.email = student.email;
        this.department = student.department;
        this.researchAssistant = student.researchAssistant;
        this.stipend = student.stipend;
    }

    @Override
    public double calculateTuition() {
        double total = tuition - stipend;
        return Math.max(total, 0);
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: R" + stipend);
        System.out.println("Total Tuition Due: R" + calculateTuition());
    }

    public static class createStudent {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

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

        public createStudent setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public createStudent setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}