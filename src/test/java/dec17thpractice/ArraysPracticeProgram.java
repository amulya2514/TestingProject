package dec17thpractice;

import java.util.Arrays;

public class ArraysPracticeProgram {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        arr2[2]=10;

        //1,2,10,4
        System.out.println(Arrays.toString(arr1));

        System.out.println("**************************************");

        int[] arr ={1,2,3,4};
        for(int val: arr){
            val=val*2;
        }

        //2,4,6,8 wrong because val means its the copy of array element not  a referemce of the element in the array
        System.out.println(Arrays.toString(arr));

        System.out.println("*************************************************");

        int[] a1 ={1,2,3,4,5,6};

        for(int i=0, j=arr.length-1; i<j; i+=2,j-=2){

            int temp = a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
        }

        System.out.println(Arrays.toString(a1));

        System.out.println("******************************************");

        int[] a2={1,2,3,4};
        int[] prefixSum= new int[a2.length];

        System.out.println(Arrays.toString(prefixSum));

        prefixSum[0]=a2[0];
        System.out.println(Arrays.toString(prefixSum));

        for(int i=1;i<a2.length;i++){
            prefixSum[i]=prefixSum[i-1]+a2[i];
            //1+2
            //3+3
            //
        }

        System.out.println(Arrays.toString(prefixSum));

        System.out.println("**************************************************");


    }
}
