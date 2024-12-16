package nov29thpractice;

public class StringPractice5 {

    public static void main(String[] args) {

        String str = "HelloJava";
        int index = str.indexOf("java")-1;
        System.out.println(str.substring(index));
    }
}
