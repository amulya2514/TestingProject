package dec13thclass;



public class TernaryOperator {

    public static void main(String[] args) {

        //Ternary Operator
        //short hand of if else condition
        //we cannot use any System.out.println concept in ternary operator

        int a=40;

        if (a%2==0){
            System.out.println("Even number");
        }else{

            System.out.println("Odd Number");

        }

        //syntax:
        //(condition)?(true block):(false block)
        //if the condition is true, then true block will be executed
        //condition false , then false block will be executed

        String result=(a%2==0)?"Even Number":"Odd Number";

        System.out.println(result);

        //Ternary operator is used in a situation where we have one condition to validate

        int b=50;

        String result1 = (a>b)?"a is greater than b":"b is greater than a";

        System.out.println(result1);

        int b1=100;
        int c= 200;

        int d= (b>c) ? ((a>b)?a:b) : b-c;


    }




}
