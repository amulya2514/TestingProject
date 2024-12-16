package nov29thpractice;

public class StringPractice13 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "null";
        //Java-null
        String result = String.join("-",str1,str2);
        System.out.println(result);
    }
}
