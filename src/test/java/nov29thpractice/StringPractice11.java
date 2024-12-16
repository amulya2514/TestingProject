package nov29thpractice;

public class StringPractice11 {
    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int randomindex=(int)(Math.random()*str.length());
        System.out.println(str.charAt(randomindex));
    }
}
