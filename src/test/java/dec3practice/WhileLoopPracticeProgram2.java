package dec3practice;

import java.util.Scanner;

public class WhileLoopPracticeProgram2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i=0,j=i+1;

        //input a string
        System.out.println("Enter a String: ");
        String s1= scanner.next();

        s1=s1.toLowerCase();

        int[] frequency=new int[256];

        int length = s1.length();

        while(i<length){
            char currentchar= s1.charAt(i);
            frequency[currentchar]++;
            i++;

        }
        System.out.println("Character Frequencies: ");
        i=0;
        while(i<256){
            if(frequency[i]>0){
                System.out.println((char)i+ ":" +frequency[i]);
            }
            i++;
        }
        scanner.close();







           }
}
