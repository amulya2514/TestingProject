package nov29thpractice;

public class StringPractice7 {

    public static void main(String[] args) {

        String str="immutable";
        //able.mmu.immut.lmmut
        str=str.substring(5).concat(str.substring(1,4).concat(str.substring(0,5))).replace('i', 'l');;

        System.out.println("Final String is: " +str);
    }
}
