package nov29thpractice;

public class StringPractice22 {

    public static void main(String[] args) {

        String str = "Mississippi";
        // 11- miiippi
        int count = str.length()-str.replace("s","").length();
        System.out.println(count);
    }
}
