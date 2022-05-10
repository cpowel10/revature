package day6;

public class Demo1 {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());//NullPointerException
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }

        System.out.println("Thanks for using the program");
    }
}
