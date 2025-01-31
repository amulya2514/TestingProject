package dec31stpractice;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.List;

public class ListProgram5 {

    //Write a Java Program to find all pairs of consecutiveelements in a list that have the same difference

            //Example: Input: [3,5,7,9,11,2,4],
    //output:[(3,5)(5,7)(7,9)(9,11)]

    /*public static void main(String[] args) {
        List<Integer> input= Arrays.asList(3,5,7,9,11,2,4);

        int low=0;
        int high= input.size()-1;
        int difference=2;

        while(low<=high){
            if(input.get(high)-input.get(low)>difference){
                high--;

            }else if(input.get(high)-input.get(low)<difference){
                low++;
            }else if(input.get(high)-input.get(low)==difference){
                System.out.println("Pair: "+input.get(low)+","+input.get(high));
                low++;
                high--;
            }

        }

    }*/
}
