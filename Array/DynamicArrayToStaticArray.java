import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayToStaticArray {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        String[] staticArray1 = new String[fruits.size()];
        fruits.toArray(staticArray1);
        System.out.println(Arrays.toString(staticArray1));
        String[] staticArray2 = fruits.toArray(String[]::new);
        System.out.println(Arrays.toString(staticArray2));
    }
}
