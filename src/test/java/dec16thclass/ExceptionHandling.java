package dec16thclass;

public class ExceptionHandling {

    public static void main(String[] args) {

        //Exception HAndling : Handling errors at the runtime
        //Compile Time Exception: it occurs during the time of coding, it will throw
        //syntactical error stating that please handle this exception
        //RUn time exception: it occurs during execution of code

        //Examples of compile time exeption:
        //1.InterrupteedException
        //2.FileNotFoundException
        //3.IOException....

        //Examples of RunTimeException:
        //1.NullPointerException
        //2.StringIndexOutOfBoundException
        //3.NoSuchElementException

        // Thread.Sleep() compileTimeException


        //Syntax of try-catch block
        //try
        //{
             //block of code which is prone to throwing an error
        //Catch(Exact exception to be handled)
        //{
             //block of code to handle the error
        //}

        try{
            System.out.println(10/0);

            BankingSite s1=null;
            s1.login();
            //when we divide any decimal number by zero result is infinity
            //when we divide any integer by zero it will provide arithmetic exception
            System.out.println(10.5/0);// error occured at this line it will not execute
            //any subsequent code after this line

            System.out.println("This is my first program");
        }
        catch(ArithmeticException e10)
        {
            System.out.println("ArithmeticException occured");
        }
        // for a single try block we can have n numb er of catch blocks
        catch(NullPointerException e7){
            System.out.println("Operation performed on null objects");


        }
        //Exception is parent of  all parent class of all different kinds of exceptions
        catch(Exception e6){
            //prints the eXact reason of printstracktrace
            //e6.printStrackTrace();
        }
        System.out.println("Executing another line of code");


    }
}
