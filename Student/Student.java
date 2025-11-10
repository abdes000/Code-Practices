package Student;

import java.util.Scanner;

class StudentDetails {
    Scanner scanner = new Scanner(System.in);
    private String sid;
    private String sname;
    private String sdept;
    private int m1;
    private int m2;
    private int m3;
    private double sresult;

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public void setResult(double result) {
        this.sresult = result;
    }

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSdept() {
        return sdept;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public double getResult() {
        return sresult;
    }

    public StudentDetails(String id, String name, String dept, int marks1, int marks2, int marks3) {
        System.out.print("\nEnter the Student ID : ");
        id = scanner.nextLine();
        System.out.print("Enter the name : ");
        name = scanner.nextLine();
        System.out.print("Enter the department : ");
        dept = scanner.nextLine();
        System.out.print("Enter the marks of Subject 1 (out of 100): ");
        marks1 = scanner.nextInt();
        if (marks1 < 0 || marks1 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks1 = Math.max(0, Math.min(100, marks1));
        }

        System.out.print("Enter the marks of Subject 2 (out of 100): ");
        marks2 = scanner.nextInt();
        if (marks2 < 0 || marks2 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks2 = Math.max(0, Math.min(100, marks2));
        }

        System.out.print("Enter the marks of Subject 3 (out of 100): ");
        marks3 = scanner.nextInt();
        if (marks3 < 0 || marks3 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks3 = Math.max(0, Math.min(100, marks3));
        }
        scanner.nextLine();
        System.out.println("Assigning the values.................................................");
        this.sid = id;
        this.sname = name;
        this.sdept = dept;
        this.m1 = marks1;
        this.m2 = marks2;
        this.m3 = marks3;

        // Total marks = sum of all subjects
        // Maximum possible total = 300 (100 per subject)
        // Percentage = (total obtained / maximum possible) * 100
        double totalObtained = (double) (this.m1 + this.m2 + this.m3);
        double maxPossible = 300.0; // 3 subjects * 100 marks each
        double result = (totalObtained / maxPossible) * 100.0;

        // Ensure percentage is between 0 and 100
        this.sresult = Math.max(0.0, Math.min(100.0, result));
        setSid(sid);
        setSname(sname);
        setSdept(sdept);
        setM1(m1);
        setM2(m2);
        setM3(m3);
        setResult(sresult);

    }

    public StudentDetails() {
    }

    public void display() {
        System.out.println("\nStudent ID = " + getSid());
        System.out.println("Student Name = " + getSname());
        System.out.println("Student Department = " + getSdept());
        System.out.println("Student marks in subject1 = " + getM1());
        System.out.println("Student marks in subject2 = " + getM2());
        System.out.println("Student marks in subject3 = " + getM3());
        System.out.println("Percentage: " + getResult());
        if (sresult < 50.00) {
            System.out.println("FAIL!");
        } else {
            System.out.println("PASS!");
        }
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails(null, null, null, 0, 0, 0);
        student.display();
    }
}