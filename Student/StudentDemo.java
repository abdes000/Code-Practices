package Student;

import java.util.Scanner;
import java.security.SecureRandom;

//InnerStudentDemoDetails
interface InnerStudentDemoDetails {
    String generate(int length);
}

// AlphanumericGenerator
class AlphanumericGenerator implements InnerStudentDemoDetails {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private final SecureRandom random = new SecureRandom();

    @Override
    public String generate(int length) {
        if (length <= 0)
            throw new IllegalArgumentException("Length must be positive.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(CHARS.length()));
        }
        return stringBuilder.toString();
    }
}

// Password Generator
class PasswordGenerator implements InnerStudentDemoDetails {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*()-_+={}[]|/?<>,.:;/";
    SecureRandom random = new SecureRandom();

    @Override
    public String generate(int length) {
        if (length < 6)
            throw new IllegalArgumentException("Password length must be at least 6");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }
        return stringBuilder.toString();
    }
}

// HexColorGenerator
class HexColorGenerator implements InnerStudentDemoDetails {
    private static final String HEX = "0123456789ABCDEF";
    private final SecureRandom random = new SecureRandom();

    @Override
    public String generate(int length) {
        if (length != 6)
            throw new IllegalArgumentException("Hex color must be 6 characters");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(HEX.charAt(random.nextInt(HEX.length())));
        }
        return stringBuilder.toString();
    }
}

// PronounceableWordGenerator
class PronounceableWordGenerator implements InnerStudentDemoDetails {
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "aeiou";
    private final SecureRandom random = new SecureRandom();

    @Override
    public String generate(int syllables) {
        if (syllables <= 0)
            throw new IllegalArgumentException("Syllables must be atleast 1");
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < syllables; i++) {
            word.append(CONSONANTS.charAt(random.nextInt(CONSONANTS.length())));
            word.append(VOWELS.charAt(random.nextInt(VOWELS.length())));
        }
        return word.toString();
    }
}

// StudentDemoDetails
class StudentDemoDetails {
    Scanner scanner = new Scanner(System.in);
    // Data
    private String sid;
    private String sname;
    private String sdept;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;
    private int m6;
    private int m7;
    private int m8;

    private double sresult;

    // SETTERS
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

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

    public void setM6(int m6) {
        this.m6 = m6;
    }

    public void setM7(int m7) {
        this.m7 = m7;
    }

    public void setM8(int m8) {
        this.m8 = m8;
    }

    public void setResult(double result) {
        this.sresult = result;
    }

    // GETTERS
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

    public int getM4() {
        return m4;
    }

    public int getM5() {
        return m5;
    }

    public int getM6() {
        return m6;
    }

    public int getM7() {
        return m7;
    }

    public int getM8() {
        return m8;
    }

    public double getResult() {
        return sresult;
    }

    // StudentDemoDetails Constructor
    public StudentDemoDetails(String id, String name, String dept, int marks1, int marks2, int marks3, int marks4,
            int marks5, int marks6, int marks7, int marks8) {
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

        System.out.print("Enter the marks of Subject 4 (out of 100): ");
        marks4 = scanner.nextInt();
        if (marks4 < 0 || marks4 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks4 = Math.max(0, Math.min(100, marks4));
        }
        System.out.print("Enter the marks of Subject 5 (out of 100): ");
        marks5 = scanner.nextInt();
        if (marks5 < 0 || marks5 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks5 = Math.max(0, Math.min(100, marks5));
        }
        System.out.print("Enter the marks of Subject 6 (out of 100): ");
        marks6 = scanner.nextInt();
        if (marks6 < 0 || marks6 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks6 = Math.max(0, Math.min(100, marks6));
        }
        System.out.print("Enter the marks of Subject 7 (out of 100): ");
        marks7 = scanner.nextInt();
        if (marks7 < 0 || marks7 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks7 = Math.max(0, Math.min(100, marks7));
        }
        System.out.print("Enter the marks of Subject 8 (out of 100): ");
        marks8 = scanner.nextInt();
        if (marks8 < 0 || marks8 > 100) {
            System.out.println("Error: Marks should be between 0 and 100");
            marks8 = Math.max(0, Math.min(100, marks8));
        }
        scanner.nextLine();
        System.out.println("Assigning the values.................................................");
        this.sid = id;
        this.sname = name;
        this.sdept = dept;
        this.m1 = marks1;
        this.m2 = marks2;
        this.m3 = marks3;
        this.m4 = marks4;
        this.m5 = marks5;
        this.m6 = marks6;
        this.m7 = marks7;
        this.m8 = marks8;

        // Total marks = sum of all subjects
        // Maximum possible total = 300 (100 per subject)
        // Percentage = (total obtained / maximum possible) * 100
        double totalObtained = (double) (this.m1 + this.m2 + this.m3 + this.m4 + this.m5 + this.m6 + this.m7 + this.m8);
        double maxPossible = 800.0; // 3 subjects * 100 marks each
        double result = (totalObtained / maxPossible) * 100.0;

        // Ensure percentage is between 0 and 100
        this.sresult = Math.max(0.0, Math.min(100.0, result));
        setSid(sid);
        setSname(sname);
        setSdept(sdept);
        setM1(m1);
        setM2(m2);
        setM3(m3);
        setM4(m4);
        setM5(m5);
        setM6(m6);
        setM7(m7);
        setM8(m8);
        setResult(sresult);

    }

    // Empty StudentDemoDetails Constructor
    public StudentDemoDetails() {
    }

    // Display the details
    public void display() {
        System.out.println("\nStudent ID = " + getSid());
        System.out.println("Student Name = " + getSname());
        System.out.println("Student Department = " + getSdept());
        System.out.println("Student marks in subject1 = " + getM1());
        System.out.println("Student marks in subject2 = " + getM2());
        System.out.println("Student marks in subject3 = " + getM3());
        System.out.println("Student marks in subject4 = " + getM4());
        System.out.println("Student marks in subject5 = " + getM5());
        System.out.println("Student marks in subject6 = " + getM6());
        System.out.println("Student marks in subject7 = " + getM7());
        System.out.println("Student marks in subject8 = " + getM8());
        System.out.println("Percentage: " + getResult());
        if (sresult < 50.00) {
            System.out.println("FAIL!");
        } else {
            System.out.println("PASS!");
        }
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails(null, null, null, 0, 0, 0);
        student.display();
    }
}