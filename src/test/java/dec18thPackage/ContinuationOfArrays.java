package dec18thPackage;

import java.util.Arrays;

public class ContinuationOfArrays {
    public static void main(String[] args) {

        //passing the values directly to the array

        int ages[] = {50,42,10,62,23,70,23,12};

        //sorts the array in ascending order
        Arrays.sort(ages);

        //print the minimum value in the array
        System.out.println(ages[0]);

        //prints the maximum value of the array
        System.out.println(ages.length-1);

        int a1[]={40,50,32,2,25,23};

        Arrays.sort(a1);

        //prints the index position of the first mismatched element
        //sorting of arrays is not rquired
        System.out.println(Arrays.mismatch(ages,a1));

        int a2[]={40,50,32,2,24,22};

        System.out.println(Arrays.mismatch(a1,a2));
    }
}
