package dec17thpractice;

public class ArrayPracticeProgram8 {

   // Write a java method that returns all unique pairs of elements in the array that sum up to a given
    //target sum.
    //Example: For input arr=[1,2,3,4,5] and targetsum=6, the output should be [(1,5),(2,4),(3,3)]

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=6;

        int low=0;
        int high = arr.length-1;
        while(low<high){

            if(arr[low]+arr[high]>sum){
                high--;
            }else if(arr[low]+arr[high]<sum){
                low++;
            }else if(arr[low]+arr[high]==sum){
                System.out.println("pair: "+arr[low]+","+arr[high]);
                low++;
                high--;
            }
        }
    }

}
