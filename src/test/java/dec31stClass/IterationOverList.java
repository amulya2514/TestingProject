package dec31stClass;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class IterationOverList {

    public static void main(String[] args) {
        Integer a4[]={4,125,12,125,6};

        //convert the array into list
      List<Integer> l2= Arrays.asList(a4);

      //Iterating the list using for loop

        System.out.println("*****************************************");

        System.out.println("Iterate over using for loop");
        for(int i=0; i<l2.size();i++){
            System.out.println(l2.get(i ));
        }

        System.out.println("Iterate over using for-each loop");
        //Iterating the list using for -each loop  ---> Enhanced version of for loop

        for(Integer i:l2){//Read an individual Integer from the list and store it in the value
            System.out.println(i);
        }


    }
}
