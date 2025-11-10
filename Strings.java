class StringCase {
    class UpperCase
    {
        String ToUpperCase(String text) {
            String object = text.toUpperCase();
            return object;
        }
    }

    class LowerCase 
    {
        String ToLowerCase(String text) {
            String object = text.toLowerCase();
            return object;
        }
    }
}

public class Strings {
    public static void main(String[] args) {
        StringCase stringCase = new StringCase();
        StringCase.LowerCase lowerCase = stringCase.new LowerCase();
        StringCase.UpperCase upperCase = stringCase.new UpperCase();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Lower Case Letters: " + lowerCase.ToLowerCase(letters));
        System.out.println("Upper Case Letters: " + upperCase.ToUpperCase(letters));

        
    }
}