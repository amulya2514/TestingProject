package dec31stpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProgram2 {

    public static List<Integer> shiftRight(List<Integer> list, int k){

        if(list==null||list.isEmpty()||k==0){
            return list;
        }
        int n = list.size();
        k=k%n;

        List<Integer> part1= list.subList(n-k,n);
        List<Integer> part2=list.subList(0,n-k);

        List<Integer> result = new ArrayList<>();

        result.addAll(part1);
        result.addAll(part2);

        return result;

    }

    public static void main(String[] args) {

        //Write a java program that shifts all elements of a list to the right by k
        //positions. the elements that go out of boundsshould wrap around the start
        //of the list
         //Example:
        //Input: [1,2,3,4,5], k=2,
        //Output :[4,5,1,2,3]

        List<Integer> input = Arrays.asList(1,2,3,4,5);

        List<Integer> output = shiftRight(input,2);

        System.out.println("Shifted List: " +output);
    }
}
