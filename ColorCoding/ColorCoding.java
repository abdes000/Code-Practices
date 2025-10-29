import java.util.Random;

class Color {
    Random random = new Random();
    //RGB
    void RGB() {
        int Red= random.nextInt(255);
        int Green = random.nextInt(255);
        int Blue = random.nextInt(255);
        Object RGB = "(" + Red + ", " + Blue + ", " + Green + ")";
        System.out.println("RGB: " + RGB);
    }
    //HEX
    void HEX() {
        Object[] hexchar = {'a', 'b', 'c', 'd', 'e', 'f', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int hex1 = random.nextInt(hexchar.length);
        int hex2 = random.nextInt(hexchar.length);
        int hex3 = random.nextInt(hexchar.length);
        int hex4 = random.nextInt(hexchar.length);
        int hex5 = random.nextInt(hexchar.length);
        int hex6 = random.nextInt(hexchar.length);
        Object r1 = hexchar[hex1];
        Object r2 = hexchar[hex2];
        Object g1 = hexchar[hex3];
        Object g2 = hexchar[hex4];
        Object b1 = hexchar[hex5];
        Object b2 = hexchar[hex6];
        System.out.println("HexColor: " + (r1) + (r2) + (g1) + (g2) + (b1) + (b2));
    }
}

public class ColorCoding {
    public static void main(String[] args){
        Color color = new Color();
        color.RGB();
        color.HEX();
    }
}
