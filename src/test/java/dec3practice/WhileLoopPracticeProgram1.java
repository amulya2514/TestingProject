package dec3practice;

import java.util.Scanner;

public class WhileLoopPracticeProgram1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input sentence from a user
        System.out.println("Enter a statement: ");
        String statement = scanner.nextLine();



        String words[] = statement.split(" ");
        String reversedstatement = "";

        int i=0;

        while(i<words.length) {

            String word = words[i];
            String reversedword = "";

            int j = word.length() - 1;
            while (j >= 0) {

                reversedword = reversedword + word.charAt(j);
                j--;
            }

            reversedstatement = reversedstatement+reversedword + " ";
            i++;
        }
            System.out.println("Reversed Statement: " +reversedstatement);

                   }
        //System.out.println("Reversed Statement: " +reversedstatement);

        //scanner.close();
    }

