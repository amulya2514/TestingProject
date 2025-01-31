package dec31stClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListConcepts {

    public static void main(String[] args) {

        //Collection is a framework that is used to modify, update and delete the records easily
        //Collection is an interface

        //Collection also works with the concept of Generics
        //works predominantly for dynamic set of data

        //List is a child interface of collection

        //List:
        //1.It is an interface
        //2.It allows duplicate values
        //3.It allows null values
        //4.It preserves the insertion order (FIFO), we can access the values based on index
        //5.It is implementedin the classes ---> ArrayList, LinkedList, Vector, Stack

        //syntax of creating a list:

        List<Integer> l1= new ArrayList<Integer>();

        l1.add(215); //adding the values to the list
        l1.add(42);
        l1.add(21556);
        l1.add(215);
        l1.add(null);
        l1.add(12325);

        //printing the values of the list

        System.out.println(l1);

        //size of the list

        System.out.println(l1.size());

        //checking if the given list is empty or not
        //returns true if the above condition is satisfied else it returns false

        System.out.println(l1.isEmpty());

        //checking if the list contains the given value or not
        //returns true if the above condition is satisfied else it returns false
        System.out.println(l1.contains(215));
        System.out.println(l1.contains(10024));
        //Object is the parent claSS OF all the classes in java
        System.out.println(l1.contains("Hello"));

        //adding value to the list at 5th index position

        l1.add(5,49821);

        System.out.println(l1);

        //adding the value to the list at the start
        l1.addFirst(2155566);//JDK21 onwards

        //adding the value to the list at the end
        l1.addLast(215216);//JDK21 onwards

        System.out.println(l1 );

        //removing the value from the list
        //removes the value from the list based on the index position

        l1.remove(6);

        System.out.println(l1);

        //removes the vlues from the list based on the provided value

        l1.remove(null);

        //removes the values at the start

        l1.removeFirst();//JDK21 onwards

        System.out.println(l1);

        //removes the value at the end
        l1.removeLast();//JDK21 onwards
        System.out.println(l1);

        //prints the value at the given index
        //5th index value
        //below line throws Index Out Of Bounds Exception, if the index is not present in the list
        try {
            System.out.println(l1.get(5));
        }
        catch(IndexOutOfBoundsException r5){
            System.out.println("Index is not present in the list");
        }

        System.out.println(l1.get(2));
        System.out.println(l1.get(1));

        //creating a sublist from the list
        //Includes the start index and excludes the end index
        List<Integer> l2 = l1.subList(1,4);//JDK21 onwards

        System.out.println(l2);
        System.out.println(l1);

        //prints the list in the reversed order
        System.out.println(l1.reversed());//JDK21 onwards

        //replacing the value at the given index
        //replaces the value at 3rd index by 490
        l1.set(3,490);

        System.out.println(l1);

        //clears all the values from the list

        l1.clear();

        System.out.println(l1);

        System.out.println(l1.isEmpty()); //true

        List<Integer> l4 = new ArrayList<Integer>();

        l4.add(4125215);
        l4.add(214);
        l4.add(21255);
        l4.add(9540);
        l4.add(212);

        //adding all the values of list l4 to l1
        //union of two lists
        l1.addAll(l4);

        //.equals function will check if the lists are equal or not in terms of values
        //both the lists are equal as l1 is empty and l1 contains all the values of l4
        System.out.println(l1.equals(l4)); //true

        //Retains the common values between two lists and stores it in L1
        //Intersection of two lists
        l1.retainAll(l4);

        System.out.println(l1);

        //Removes the common values of l4 stored in l1 and stores the remaining values in l1
        //Difference of two lists
        l1.removeAll(l4);

        //COnverting the list into an array

        Object[] arr=l4.toArray();

        for(Object o :arr){
            System.out.println(o);
        }

        //Converting list to an array with specific type

        //Throws ArrayStoreException if the type of the array is not matching with the type of the lisy

        Integer[] arrl = l4.toArray(new Integer[l4.size()]);

        System.out.println(Arrays.toString(arrl));

        //converting the list to a string

        System.out.println(l4.toString());

        //Remove the values in the list only when the condition is satisfied
        //Remove the values from the list if it is an odd number

        //Accepts an predicate interface as the argument as we are filtering the values based on the condition
        l4.removeIf(s -> s%2!=0);

        System.out.println(l4);

        //UnaryOperator interface is used to replace all the values in the list with given value
        //As we need to replace all the values with 0, we are using UnaryOperator Interface

        l4.replaceAll(s -> s+40);

        System.out.println(l4);

        //UnaryOperator Interface and BinaryOperator Interface are the child Interface of Functional Interface
        //which is primarily used in the modification of the values in the collections

        //Sort the values in the list
        Collections.sort(l4);//sorts the data in ascending order

        System.out.println(l4);

        Collections.shuffle(l4); //Shuffles the data in the list

        System.out.println(l4);

        //Swaps the values at the given indexes
        //Swap the value that is present at the 1st index with the value present at 2nd index
        Collections.swap(l4, 1,2);

        System.out.println(l4);

        System.out.println("****************************************************************");










    }

}
