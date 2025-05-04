package variable_project;

import javax.sound.midi.Soundbank;

public class VariableManipulation {

    public static void main(String[] args) {
        int a=60;
        int b= 38;

        int sum =a+b;
        System.out.println("Sum of  a and b : "+sum);

        int sub = a-b;
        System.out.println("Subtraction of  a and b : "+sub);

        int multiply =a*b;
        System.out.println("Multiplication of a and b : "+multiply);

        double divide =(double) a/b;
        System.out.println("Division of a and b is : "+divide   );

        // Use String Datatype
        String firstName= "Neeshu";
        String lastName= " Bhadauriya";

        String fullName=firstName+lastName;
        System.out.println("My Name is : "+fullName);

        int number=10;
        number++;

        System.out.println("Number is : "+number);
        number--;

        System.out.println("After decrement Number now : "+number);


    }
}
