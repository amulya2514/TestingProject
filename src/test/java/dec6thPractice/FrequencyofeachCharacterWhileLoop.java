package dec6thPractice;

public class FrequencyofeachCharacterWhileLoop {

    public static void main(String[] args) {

        String s1 = "Amulya";
        String s2=s1.toLowerCase();
        char ch[] = s2.toCharArray();
        char charToBeCounted = 'a';
        int count = 0;

        //char charToBeCounted1 = charToBeCounted;
        //int i=0;
        for (int i = 0; i <= ch.length; i++) {
            while (ch[i] == charToBeCounted) {
                count++;
                //System.out.println(count);
            }

            System.out.println(charToBeCounted+ " " +count);

        }
    }
}
