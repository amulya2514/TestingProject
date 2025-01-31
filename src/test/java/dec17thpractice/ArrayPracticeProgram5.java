package dec17thpractice;

import java.util.Arrays;

public class ArrayPracticeProgram5 {

    //Write a Java program to remove all non-alphabetic characters from string in an array

    public static String[] cleanedStrings(String[] arr){

        if(arr==null||arr.length==0){
            return arr;
        }
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=null){
                arr[i]=arr[i].replaceAll("[^a-zA-z]","");
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        String[] arr = {"Hello123","Java@code!","123456","Alphabets&*Only"};

        String[] cleanedArray=cleanedStrings(arr);

        System.out.println("CleanedArray: "+Arrays.toString(cleanedArray));
    }
}
