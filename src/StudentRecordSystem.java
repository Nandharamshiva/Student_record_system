import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Record System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(studentList, scanner);
                    break;
                case 2:
                    displayStudentRecords(studentList);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(ArrayList<Student> studentList, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        Student student = new Student(name, id, grade);
        studentList.add(student);

        System.out.println("Student added successfully.");
    }

    private static void displayStudentRecords(ArrayList<Student> studentList) {
        System.out.println("\nStudent Records:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}