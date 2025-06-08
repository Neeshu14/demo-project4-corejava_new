package array_;

public class Student_Array {


    public static void main(String[] args) {

        String name[]={"Neeshu","Rahul","Teena","Tanu","Abhi"};


        //Using For Loop
        for (int i=0;i<5;i++){

            System.out.println("Printing Name :"+name[i]);
        }

        //Using while Loop
        int j=0;
        while (j<5){
            System.out.println("While Loop :"+name[j]);
            j++;
        }

        int a=0;
        do {
            System.out.println("Do while Loop :"+name[a]);
            a++;
        }while (a<5);
    }
}
