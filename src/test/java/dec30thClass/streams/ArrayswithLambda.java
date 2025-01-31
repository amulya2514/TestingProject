package dec30thClass.streams;

import java.util.Arrays;

public class ArrayswithLambda {

    public static void main(String[] args) {
         int a[]={4,2,5,2,51,25,5};

         //doubling the values present in the array
        //i-> a[i]*2 ---> replace each and every value of the array by multiplying by 2

        //UnaryOperator ---> Accepts only one input and returns the output
        Arrays.setAll(a,i -> a[i]*2);

        System.out.println(Arrays.toString(a));

        //parallel prefix
        //adding the values of array

        Arrays.parallelPrefix(a, (int x,int y) -> x+y);

        System.out.println(Arrays.toString(a));

        //Streams---> quick processing of data which helps us in performing a lazy evaluation
        //Streams are used to process data in a quick manner

        System.out.println("***********************************");
        //.forEach() ---> used to iterate over the data
        //.forEach() ----> follows the concept of Consumer Functional Interface

        Arrays.stream(a).forEach( s -> System.out.println(s));

        //Filtering the data
        System.out.println("**********************************");

        Arrays.stream(a).filter(s -> s>100).forEach(s -> System.out.print(s+" "));

        System.out.println("\n**********************************");

        //.filter() ---> used to filter data based on the condition
        //it follows the concept of predicate functional interface

        Arrays.stream(a).filter(s -> s>100 && s%2==0).forEach(s -> System.out.print(s+" "));

        System.out.println("\n*******************************************");

        //counting the number of elements in the array
        System.out.println(Arrays.stream(a).count());

        System.out.println("***************************************");

        //sum of the elements in the array
        //.reduce() ---- > It is used to perform operations on the data and return the result in the form of single value

        //System.out.println(Arrays.stream(a).reduce((x,y) -> x+y));


        //.ifpresent is used to print the value if the value is present
        //.ifpresent ---> follows the concept of consumer functional interface
        //.reduce ----> follows the concept of binaryoperator functional interface
        Arrays.stream(a).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));

        System.out.println("**********************************");

        //Max value in the array

        Arrays.stream(a).max().ifPresent(s -> System.out.println(s));

        System.out.println("******************************************");

        //Min value in the array

        Arrays.stream(a).min().ifPresent(s -> System.out.println(s));

        System.out.println("**************************************");

        Arrays.stream(a).average().ifPresent(s -> System.out.println(s));

        System.out.println("*********************************");

        //sum of the values in the array

        System.out.println(Arrays.stream(a).sum());

        System.out.println("*******************************************");

        //Distinct values in the array(find the values that are not repeated)
        Arrays.stream(a).distinct().forEach(s -> System.out.print(s));

        System.out.println("\n******************************************");








    }
}
