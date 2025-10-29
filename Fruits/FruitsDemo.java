import java.util.Scanner;

public class FruitsDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a fruit:");
        System.out.println("1. Apple");
        System.out.println("2. Banana");
        System.out.println("3. Mango");
        System.out.print("Enter the choice: ");
        int fruitChoice = scan.nextInt();
        scan.close();
        switch (fruitChoice) {
            case 1:
                Apple apple = new Apple();
                apple.fruits();
                apple.appleColor();
                break;
            case 2:
                Banana banana = new Banana();
                banana.fruits();
                banana.bananaColor();
                break;
            case 3:
                Mango mango = new Mango();
                mango.fruits();
                mango.mangoColor();
                break;
        }
    }
}
