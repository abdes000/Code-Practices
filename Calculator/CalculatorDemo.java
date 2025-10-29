import java.util.Scanner;
public class CalculatorDemo {
    void Calculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Calculator-------");
        System.out.println("The available operation are: ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplaction");
        System.out.println("4. Division");
        System.out.print("Enter the choice (select the number): ");
        int choice = scan.nextInt();
        System.out.println("Enter the two numbers: ");
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        scan.close();
        Addition add = new Addition();
        Substraction diff = new Substraction();
        Multiplication prod = new Multiplication();
        Division div = new Division();

        switch (choice) {
            case 1:
                int sum = add.add(num1, num2);
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int difference = diff.difference(num1, num2);
                System.out.println("Difference: " + difference);
                break;
            case 3:
                int product = prod.multiply(num1, num2);
                System.out.println("Product: " + product);
                break;

            case 4:
                int division = div.div(num1, num2);
                System.out.println("Division: " + division);
                break;
        }

    }
}