package conditional_statement_ifandelse;

public class Nested_If_2 {

    //Find the tallest student among 2 students
    public static void main(String[] args) {

        int a=150;
        int b=170;
        int c=201;

        if (a>=b){
            if (a>=c){
                System.out.println("Student height with "+a +" is the tallest one");
            }
            else {
                System.out.println("Student height with "+c +" is the tallest one");
            }
        }else{
            if (b>=c){
                System.out.println("Student height with "+b +" is the tallest one");
            }else{
                System.out.println("Student height with "+c +" is the tallest one");
            }
        }

    }
}
