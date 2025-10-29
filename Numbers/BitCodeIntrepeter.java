import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitCodeIntrepeter {
    public static void main(String[] Numbers) {
        // Scanner class
        Scanner scan = new Scanner(System.in);

        // Number Memory
        // Creating a storage which consists of numbers
        List<Long> dynamicList = new ArrayList<>();
        System.out.println("Enter numbers: ");
        while (scan.hasNextInt()) {
            long addList = scan.nextLong();
            if (addList == 0)
                break;
            dynamicList.add(addList);
        }
        // Object[] staticList = new Object[dynamicList.size()];
        // dynamicList.toArray(staticList);
        // for(Object obj : staticList){
        // Object myObject = (Object)obj;
        // }
        long[] staticList = dynamicList.stream().mapToLong(Long::longValue).toArray();
        String printList = Arrays.toString(staticList);
        System.out.println("\n Your entered numbers are (this is not from loop): " + printList);
        System.out.println("Your entered numbers are: ");
        for (long List : staticList) {
            for (int i = 0; i < staticList.length; i++) {
                System.out.println(i + ". " + List);
                }
        }

        // choices
        List<Integer> dynamicChoices = new ArrayList<>();
        System.out.println("Choices: " + "(0 to " + (staticList.length - 1) + ")");

        System.out.println("Enter choices (type -1 to finish):");
        while (scan.hasNextInt()) {
            int choice = scan.nextInt();
            if (choice == 0)
                break; // Sentinel value to stop input
            dynamicChoices.add(choice);
        }

        int[] staticChoices = dynamicChoices.stream().mapToInt(Integer::intValue).toArray();
        // String printChoices = Arrays.toString(staticChoices);
        System.out.println("\n Your choices are: ");
        for (int Choices : staticChoices) {
            System.out.println(Choices);
        }
        scan.close();

        // Variables
        long num1 = staticList[staticChoices[0]];
        long num2 = staticList[staticChoices[1]];
        String code1 = Long.toBinaryString(num1);
        String code2 = Long.toBinaryString(num2);
        int value1 = Integer.parseInt(code1, 2);
        int value2 = Integer.parseInt(code2, 2);

        // 16-bit unsigned integer
        System.out.println("16-bit unsigned integers: ");
        System.out.println("Code1: " + value1);
        System.out.println("Code2: " + value2);

        // 16-bit signed integer(2's complement)
        short sValue1 = (short) value1;
        short sValue2 = (short) value2;
        System.out.println("\n16-bit signed Integers");
        System.out.println("Code1: " + sValue1);
        System.out.println("Code2: " + sValue2);

        // Two 8-bit unsigned integers
        int high1 = (value1 >> 8) & 0xFF;
        int low1 = (value1) & 0xFF;
        int high2 = (value2 >> 8) & 0xFF;
        int low2 = (value2) & 0xFF;
        System.out.println("\n 8-bit unsigned integers: ");
        System.out.println("Code1: high= " + high1 + ", low= " + low1);
        System.out.println("Code2: high= " + high2 + ", low= " + low2);

        // Two 8 bit signed integers
        byte bHigh1 = (byte) high1;
        byte bLow1 = (byte) low1;
        byte bHigh2 = (byte) high2;
        byte bLow2 = (byte) low2;
        System.out.println("\n Two 8-bit signed integers: ");
        System.out.println("Code1: high= " + bHigh1 + ", low= " + bLow1);
        System.out.println("Code2: high= " + bHigh2 + ", low= " + bLow2);

        // 16-bit unicode character
        char c1 = (char) value1;
        char c2 = (char) value2;
        System.out.println("\n 16-bit unicode characters: ");
        System.out.println("Code1: " + c1);
        System.out.println("Code2: " + c2);

        // Two 8-bit 150-8859-1 characters
        char chigh1 = (char) high1;
        char chLow1 = (char) low1;
        char chigh2 = (char) high2;
        char chLow2 = (char) low2;
        System.out.println("\n Two 8-bit 180-8859-1 characters:");
        System.out.println("Code1: high= " + chigh1 + ", low= " + chLow1);
        System.out.println("Code2: high= " + chigh2 + ", low= " + chLow2);

        // Binary to Decimal (fixed)
        String binary1 = "0000000000101010";
        String binary2 = "1000000000101010";
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        System.out.println("Decimal1: " + decimal1);
        System.out.println("Decimal2: " + decimal2);
    }
}
