package dec17thpractice;

import java.util.Arrays;

public class ArrayPraticeProgram4 {

    //Write a java method that finds the maximum product that can be obtained by multiplying any two integers
           // in the array.
       // Example: For input [1,20,-5,3,-6] the output should be 30 (from -5 and-6)

    public static int findMaxProduct(int[] arr){

        if(arr==null||arr.length<2){
            throw new IllegalArgumentException("Array must have atleast 2digits");

        }
        //intitialize variables to track 2 largest and smallest numbers
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;

        //Traverse array to find 2largest and smallest numbers

        for(int num:arr){
            //update the Largest numbers
            if(num>max1){
                max2=max1;
                max1=num;
            }else if(num>max2){
                max2=num;
            }
            //Update the smallest numbers
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }

        return Math.max(max1*max2,min1*min2);
    }

    public static void main(String[] args) {

        int[] arr = {1,20,-5,3,-6};
        int result= findMaxProduct(arr);

        System.out.println(result);
    }

}
