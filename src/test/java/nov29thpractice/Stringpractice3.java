package nov29thpractice;

public class Stringpractice3 {
    public static void main(String[] args) {
        String str1="HelloWorld";
        //World
        String str2=str1.substring(5);
        String str3="World";

        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
    }
}
