package dec31stpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProgram3 {

    //Write a java program to merge two sorted lists into one sorted list without using collections.sort()
    //Example: Input: List1=[1,3,5], List2=[2,4,6], output=[1,2,3,4,5,6]

    public static List<Integer> mergedLists(List<Integer> list1,List<Integer> list2){

        List<Integer> mergedList =new ArrayList<>();

        int i=0, j=0;

        while(i<list1.size()&&j<list2.size()){

            if(list1.get(i)<=list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }else{
                mergedList.add(list2.get(j));
                j++;
            }

        }
        while(i< list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }

        while(j<list2.size()){
            mergedList.add(list2.get(j));
            j++;
        }

return mergedList;
    }

    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(1,3,5);
        List<Integer> list2=Arrays.asList(2,4,6);
        List<Integer> mergedList=mergedLists(list1,list2);
        System.out.println("MergedLists: " +mergedList);
    }
}
