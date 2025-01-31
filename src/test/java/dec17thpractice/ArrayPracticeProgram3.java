package dec17thpractice;

import java.util.Arrays;

public class ArrayPracticeProgram3 {

    //Write a method that rotates the elements in the array k positions to the right
    //Example:For input [1,2,3,4,5] and k=2, the output should be  (4,5,1,2,3)

    private static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    public static void rotateArray(int[] arr, int k){

        if(arr==null||arr.length==0||k<=0){
            return;
        }

        int n= arr.length;
        k=k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int k=2;

        rotateArray(arr,k);

        System.out.println(Arrays.toString(arr));
    }


}
