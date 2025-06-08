package loop_practice;

public class Even_Number {
    public static void main(String[] args) {
        // Write a program to Print Even Number B/w 1 to 100 Using all Loop

        //Using For Loop

        for (int i=1;i<=100;i++){
            if (i%2 ==0){
                System.out.println("Even Number are..."+i);
            }
        }

        // Using While
        int j=1;
        while(j<=100){
            if (j% 2 ==0){
                System.out.println("Using While Even Number are.."+j);
            }
            j++;
        }

        //Using Do while
        int k=1;
        do {
            if (k % 2 == 0) {
                System.out.println("Using Do while..." + k);
            }
            k++;
        }
            while (k <= 100) ;


    }
}
