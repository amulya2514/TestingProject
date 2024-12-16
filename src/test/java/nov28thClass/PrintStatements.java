package nov28thClass;


public class PrintStatements {

    public static void main(String[] args) {

        //prinln statement prints the data onto the console and moves the cursor to the next line
        //Hello World on console and cursor will move and blink on to the next line

        //50-400-600
        //-350-600
        //-950
        System.out.println(50-400-20*30);

        //(50-30)*20-400-(37-40-(500-3))
        //(50-30)*20-400-(-3-497)
        //20*20-400+500
        //400-400+500
        System.out.println((50-30)*20-400-(37-40-(500-30/10)));

        System.out.print("The above number is an Integer");

        System.out.println("This is my third line of data");

        System.out.println("**********************************************************************");

        //40-50*60-1
        //40-3000-1
        //-2960-1
        //Integers decimal values will not be considered
        //When we divide integer with an integer without any decima;l we have to consider

        //+ symbol is used to join the sentence with the number
        System.out.println("Number generated to be is:"+(40-50*60-70/60));

        //STR---> String templates
        //\{} ---> add the values in the curly braces
        //System.out.println(STR."Number generated to be is:" \{40-50*60-70/60});

        //To print any sort of error messages - output will be printed inred color
        //serr followed by enter is shorcut  to generate System.error.println()
        System.err.println("Error message occured");

    }
}
