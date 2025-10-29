// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<Integer> numbers = new ArrayList<>();

//         System.out.println("Enter numbers (enter 'done' to finish):");
//         while (scanner.hasNextInt()) {
//             numbers.add(scanner.nextInt());
//         }

//         System.out.println("You entered: " + numbers);
//         scanner.close();
//     }
// }

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers: ");
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        System.out.println("You entered: " + list);
        scan.close();
    }
}
/*
 * import java.util.Scanner;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * List<Integer> list = new ArrayList<>();
 * System.out.println("Enter numbers: ");
 * while (scan.hasNextLine()) {
 * list.add(scan.nextInt());
 * }
 * System.out.println("You entered: " + list);
 * scan.close();
 * }
 * }
 */