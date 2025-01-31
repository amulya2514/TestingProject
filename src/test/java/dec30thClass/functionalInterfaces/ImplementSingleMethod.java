package dec30thClass.functionalInterfaces;

public class ImplementSingleMethod {

    public static void main(String[] args) {

        //Using Anonymus inner class
        //Here we are writing the actual code for implementation  in an anonymus class
        FunctionalInterfaceConcepts f4 = new FunctionalInterfaceConcepts() {
            @Override
            public void sample() {
                System.out.println("This is a sample method created in a; inner class");
            }
        };

        f4.sample();

        //Using Lamba expressions
        //Lambda expressions helps us in making the code more concise and readable
        //Lambda expression works only for functional interfaces

        //Lamda expressions for the methods which has no arguments and no return type
        FunctionalInterfaceConcepts f5 = () -> System.out.println("Method executed using Lambda expressions");
        f5.sample();

        f5 = () -> {
            int a = 40;
            int b = 15;
            System.out.println(((a + b)));
            System.out.println("Performing the code inside lambda expressions having multiple lines of data");

        };
        f5.sample();

        //Lambda Expressions with methods having parameters and no return type

        FunctionalInterfaceConceptswithParameters f6 = (a, b) -> System.out.println(a * b);
        f6.product(20, 40);

        //System.out.println((f6.product(20,40));

        // //Lambda Expressions with methods having parameters and  return type
        //Return keyword is not mandatpory if it is a single line of code

        FunctionalInterfaceConceptswithParametersAndReturnType f7 = (a,b) -> a+b;

        f7.sum(50,24);

        //return keyword in a lambda expression is used when multiple lines of code are written inside the body
        f7= (a,b) ->{

            a=a*b;
            b=a/b;

            return a+b;
        };

        System.out.println(f7.sum(4,2));


    }
}

