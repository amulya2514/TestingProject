package nov29thpractice;

public class StringPractice29 {

    public static void main(String[] args) {

        String str = "abcdefgh";
        String substr1=str.substring(2,5);
        String substr2="cde";
        System.out.println(substr1==substr2);
        System.out.println(substr1.equals(substr2));
    }
}
