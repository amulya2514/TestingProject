package nov29thClass;

public class StringConcepts {

    public static void main(String[] args) {
        //String is a sequence of characters
        String s2= " This is my first string that iam working on";

        System.out.println(s2);

        //prints the number of characters present in the string
        System.out.println(s2.length());

        s2="       ";
        //Check if the given string is blank or not
        //returns true if the string is blank or else false
        System.out.println(s2.isBlank());//JDK11

        s2="";
        //Check if the given string is blank or not
        //returns true if the string is blank or else false
        System.out.println(s2.isEmpty());// true because it does not have a single character
        System.out.println(s2.isBlank());//true --- because there are no values here

    }
}
