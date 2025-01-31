package dec17thpractice;

public class ArrayProgram7 {

    //Given an array containing n-1 distinct numbers in the range of 1-n, write a java method to
    //findMissingNumber(int[] arr) to find missing number
    //Example:For input[3,7,1,2,8,4,5], where the range is 1-8, the output should be 6.

    public static int findMissingNumber(int[] arr){

        int n= arr.length+1;

        int expectedSum=n*n+1/2;

        int actualSum=0;
        for(int num:arr){
            actualSum=num+actualSum;

        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] array = {3,7,1,2,8,4,5};
        int missingNumber = findMissingNumber(array);

        System.out.println("Missing Number is: " +missingNumber);
    }
}
