import java.util.Scanner;

class Person {
    Scanner in = new Scanner(System.in);
    private String name = in.nextLine();

    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }

}