package conditional_statement_ifandelse;

public class Nested_If_3_CheckNationality {

    //write a code to check person City is Delhi if His nationality is Indian
    public static void main(String[] args) {


        String country="India";
        String state="Delhi";


        if(country=="India"){
            if (state=="Delhi") {
                System.out.println("Person City is Delhi..");
            }
            else {
                System.out.println("Person City is not Delhi..");
            }
        }else {
            System.out.println("Person Nationality is not Indain");
        }

    }

}
