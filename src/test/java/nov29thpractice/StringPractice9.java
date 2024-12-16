package nov29thpractice;

public class StringPractice9 {

    public static void main(String[] args) {

        String str = "abcdefgh";
        //cdefg.gh.
        //cdXfggh
        //YdXfggh
        //cdefgh
        str=str.substring(2,6).concat(str.substring(6));
                //.replace('e','X').replace('c','Y'));
        System.out.println( "Final String is: " +str);
    }
}
