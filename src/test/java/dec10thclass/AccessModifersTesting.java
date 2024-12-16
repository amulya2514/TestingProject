package dec10thclass;

public class AccessModifersTesting {

    public static void main(String[] args) {

        //below line will throw an error because we are calling a private method that is present in another class
        //which cannot be accessed
        //MethodDeclarations.display();

        //below line does not throw an error because we are calling a default method from another class
        //that is present in the same package
        MethodDeclarations.sumOfTwoNumbers(40,1024);


    }
}
