package dec31stpractice;

import java.util.ArrayList;

public class ListProgram1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i=0; i<12; i++){
            list.add(i);
        }

        System.out.println("Size: "+list.size());
    }
}
