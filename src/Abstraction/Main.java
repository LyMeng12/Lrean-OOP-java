package Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        System.out.print("Is student present? (true/false): ");
        boolean attendance = scanner.nextBoolean();
        student.markAttendance(attendance);

        System.out.print("Enter student score: ");
        double score = scanner.nextDouble();
        student.calculateGrade(score);

        student.printReport();
    }
}
