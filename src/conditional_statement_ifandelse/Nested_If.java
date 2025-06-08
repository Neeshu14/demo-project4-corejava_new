package conditional_statement_ifandelse;

public class Nested_If {

    //write a code which can find even and odd numbers which is greater than 0.

    public static void main(String[] args) {

        int num=-1;

        if (num >0){
            if(num%2 ==0){
                System.out.println("Given number is Even Number....");
            }
            else {
                System.out.println("Given number is Odd Number....");
            }
        }else{
            System.out.println("Given number is not greater than 0....");
        }
    }

}
