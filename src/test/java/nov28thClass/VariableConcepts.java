package nov28thClass;

public class VariableConcepts {
    public static void main(String[] args) {
        //variable: temporary storage of data and values

        // because scope of execution is during the execution time of the program
        //once the execution is completed then all the variables will be vanished or erased offin JVM

        //Rules to be followed for declaring a variable name
        // 1.It should always start with a small letter ( good pratice
       // 2.It should not start with any numbers or special characters
        // 3.Variable names should not have any white spaces between them(we can use underscore_ symbol instead of a white space
        //4. Variable names should not have any java keywords(57)

        //syntax of declaring a variable
        //datatype variable name

        //Java is a statically type language ----> we need to mention the data type explicitly
        //Along with java , C#, typescript
        //python, JS are dynamically typed languages ----> we need not mention any data to store the values

        //Different types of datatypes:
        //1.Primitive datatype: int, char, boolean, byte, short, long, float, double
        //2.Non-Primitive datatype: string,array, list etc........

        int a1; // accepts range of values from -2^31 to 2^31-1
        char b2; // accepts a simgle value like 'A', 'K', '4', '^', ' '
        long c3; // accepts range of values from -2^63 to 2^63-1
        double d4;// accepts upto 16 signifcant digits (16 decimal points)
        byte e5; //accepts a range of value from -128 to 127
        float f6; // accepts upto 5 signifcant digits (5 decimal points)
        boolean g7; // accepts true or false
        short h8;// accepts a range of values -32768 to 32768


        //Syntax of intializing a variable
        a1=-4925;
        b2='^';// always we need to writ within ' ' quotes
        c3=98235892L; // L is written at the end to indicate it is a long value
        d4=8.21125562;
        e5=-28;
        f6=9421.214f; // f is written at the end to indicate it is a float value
        g7=false;
        h8=5923;

        //-4925-94*5923-8.21125562
        //-4925-556762-8.21125562
        //-561695.21125562
        //Whenever we are using any character in any arthimetic operations , it will take the ASCII value of the character
        System.out.println(a1-b2*h8-d4);

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(e5);
        System.out.println(f6);
        System.out.println(g7);
        System.out.println(h8);
    }

}
