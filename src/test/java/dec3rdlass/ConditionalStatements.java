package dec3rdlass;

public class ConditionalStatements {

    public static void main(String[] args) {
        //conditional statement
        //running the   code based on the condition

        int a =10;
        // == (value present on left side is same as value present on right side)

        //if takes true or false values only
        //if (condition to be checked)

        if(a==10)//if true
            System.out.println("Value of a is 10");

        a=15;
        if(a==10)
            System.out.println("Value of a is 10");

        //syntax of if-else
        //if(condition to be checked)
        //block of code
        //else
        //block of code

        a=15;
        if(a==10)
            System.out.println("Value of a is 10");
            else
            System.out.println("Value of a is not 10");

            a=40-20*300-(32-20-34);

            //% ---> remainder of a number
        if(a%2==0)
            System.out.println("a is divisible by 2");
        else
            System.out.println("a is not divisible by 2");

        //Self assignment operation ---> updated value can be stored in same variable
        //a+ 356-76719
        //a+76363 //-5938+76363
        a=a+356-239*321;

        if(a%3==0)
            System.out.println(" a is divisble by 3");
        else
            System.out.println("a is not divisible by 3");

        int b=40;
        int c=30;

        if(a%3==0 && c%5==0);



    }

}
