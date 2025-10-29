public class NumberConversion {
    public static void main(String[] args) {
    int decimal = 999;
    String hexadecimal = "1234";
    String binary = "1000000";
    String decimalToBinary = Integer.toBinaryString(decimal).toUpperCase();
    String decimalToHexadecimal = Integer.toHexString(decimal).toUpperCase();
    int binaryToDecimal = Integer.parseInt(binary, 2);
    String binaryToHexadecimal = Integer.toHexString(binaryToDecimal).toUpperCase();
    int hexadecimalToDecimal = Integer.parseInt(hexadecimal, 16);
    String hexadecimalToBinary = Integer.toBinaryString(hexadecimalToDecimal);
    System.out.println("For decimal: " + decimal);
    System.out.println("Decimal: " + decimal);
    System.out.println("Hexadecimal: " + decimalToHexadecimal);
    System.out.println("Binary: " + decimalToBinary);
    System.out.println("For binary: " + binary);
    System.out.println("Binary: " + binary);
    System.out.println("Decimal: " + binaryToDecimal);
    System.out.println("Hexadecimal: " + binaryToHexadecimal);
    System.out.println("For Hexadecimal: " + hexadecimal);
    System.out.println("Hexadecimal: " + hexadecimal);
    System.out.println("Binary: " + hexadecimalToBinary);
    System.out.println("Decimal: " + hexadecimalToDecimal);
    
    }
}
