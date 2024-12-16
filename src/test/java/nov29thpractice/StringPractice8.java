package nov29thpractice;

public class StringPractice8 {

    public static void main(String[] args) {

        String str = "abababa";
        //System.out.println(+str.length());
        //7-1
        int count = str.length()-str.replaceAll("aba", "").length();
        System.out.println(count);
    }
}
