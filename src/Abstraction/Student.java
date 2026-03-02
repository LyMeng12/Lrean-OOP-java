package Abstraction;

public class Student extends Person {

    private String name;
    private boolean isPresent;
    private double score;
    private String grade;

    public Student(String name) {
        this.name = name;
    }
    @Override
    void markAttendance(boolean present) {
        this.isPresent = present;
    }

    @Override
    void calculateGrade(double score) {
        this.score = score;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    @Override
    void printReport() {
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name       : " + name);
        System.out.println("Attendance : " + (isPresent ? "Present" : "Absent"));
        System.out.println("Score      : " + score);
        System.out.println("Grade      : " + grade);
    }
}
