package nov29thpractice;

public class StringPractice18 {

    public static void main(String[] args) {

        String str = "abcdef";
        str=str.replace('a', 'A').substring(1,4);
        System.out.println(str);
    }
}
