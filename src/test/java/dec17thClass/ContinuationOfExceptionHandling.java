package dec17thClass;

import dec16thclass.BuilderPattern;

public class ContinuationOfExceptionHandling {

    public static void main(String[] args) {

        try
        {
            BuilderPattern b1 = null;
            b1.main(args);
            Integer.parseInt("2021.421125");
                    }
        catch (NumberFormatException e4)
        {
           // System.out.println("NumberFormatException Occured");


            //syntax of throwing your own exception
            //throw new <Exception Class> (message you want to display)
            //System.out.println("Number Format Exception occured");
            throw new NumberFormatException("Please check the data that you are trying to convert");
           // System.out.println("Another line of code under execution");


        }

        catch(NullPointerException e4){

            throw new NullPointerException("Do not perform any operations on null objects");
        }

        System.out.println("Another line of code for execution");

    }
}
