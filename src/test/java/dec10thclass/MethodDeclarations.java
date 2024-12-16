package dec10thclass;

public class MethodDeclarations {

    //Method- block of code that performs a specific task
    //only static methods and variables can be called inside another static method
    //both static and non-static methods and varibales can be called inside another non-static method
    public static void main(String[] args) {

        //syntax of creating a method
        //accessmodifier returntype methodName(parameters if any)
        //accessmodifier --- defines scope /visibility of the method
        //1.public -method is accessible anywhere within the project
        //2.private - method is accessible anywhere within the class
        //3.protected - method is accessible anywhere within the package and outside of package via inheritance
        //4.default - method is accessible anywhere within the package

        //return type - output we are expecting from the method
        //it can be integer , string, double, boolean, float etc.. along with void

        //void means nothing but simply executes the line of the program

        //method name can be any name of your choice but please follow the rules used to declare the variables

        //display();

        //sum of two numbers (40,30)  ---> returns an integer---> we can print it by enclosing the methos with sysput
        System.out.println(sumOfTwoNumbers(40,30));


    }
    private void display(){
        System.out.println("displayed from private method");
    }


    //In the same class we cannot have same method with same set of arguments
    //but we can have same method name and different set of arguments
    //above concept is called as method overloading

    //difeerent set of arguments
    //1.different number of parameters
    //2.order of parameters
    //3.different datatypes for the parameters


    //different return type and different access modifier are not considered
    //as part of method overloading

    //why method overloading
    //1. code reusability
    //2. code readability
    //3.easy to remember method names

    //Method overloading comes under polymorphism in OOPS


     static int sumOfTwoNumbers(int a, int b){

        int c = a+b;
        //return keyword is used to send the desired output from the given method
        return c;
    }
    static int sumOfTwoNumbers(int a, int b, int c){

        int d = a+b+c;
        //return keyword is used to send the desired output from the given method
        return d;
    }
}
