package dec10thclass.subpackages;

import dec10thclass.MethodDeclarations;

import java.lang.reflect.Method;

public class AccessClass {

    public static void main(String[] args) {

        //Below line will throw an error because we are trying to acces a default method that is present
        // in another class and another pcakage
        //MethodDeclarations.sumOfTwoNumbers(40,12432);

        MethodDeclarations.main(args);
    }
}
