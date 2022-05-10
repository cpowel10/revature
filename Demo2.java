package day6;

import day2.Demo;

public class Demo2 {
    public void display(){
        try {
            int marks[] = new int[-4]; //NegativeArrayException
            System.out.println(marks[10]); //ArrayIndexOutOfBoundsException
            System.out.println(1/0); //Arithmetic Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array cannot be accessed beyond its size");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Array size cannot be negative");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("closing operation");
        }
        System.out.println("Method completed");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();
        System.out.println("Thanks for using the program");
    }
}
