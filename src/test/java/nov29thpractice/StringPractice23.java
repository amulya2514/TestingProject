package nov29thpractice;

public class StringPractice23 {
    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //
        for(int i=0;i<str.length();i+=5){
            System.out.println(str.charAt(i)+"");
        }
    }
}
