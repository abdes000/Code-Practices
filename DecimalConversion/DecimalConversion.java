import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number(1-10000): ");
        int decimal = scan.nextInt();

        if(decimal < 0 || decimal > 10000){
            System.out.println("Invaalid input. Enter a number between 1 and 10000");
        } else {
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary Representation: "+ binary);
        }
    }
}
