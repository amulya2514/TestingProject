package dec3practice;

import java.util.Scanner;

public class RemoveDuplicateCharactersfromaString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1= scanner.nextLine();

        char c[]=s1.toCharArray();

        int i=0, j=i+1;

        while(i<c.length&&j<c.length){
            if(c[i]==c[j]){

                s1=s1.replace(c[i], '0');

            }
            i++;
          j++;
        }

        System.out.println("String after remoing duplicates: " +s1);
    }


}
