// import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Person person = new Person();
        // System.out.print("Enter your name: ");
        // String name = scan.nextLine();
        // scan.close();
        // person.setName("jhjk");
        System.out.println("Your name is: " + person.getName());
    }
}