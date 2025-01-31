package dec19thClass;

public class StringBufferConcepts {

    public static void main(String[] args) {

        //String Immutable
        //Security point of view because we store the passwords or any secret keys in the form of strings
        //it makes the strings threadsafe
        //it also prevents hackers from modifying the existing resource of data
        //From a performance point of view it seems to be slow compared to String Buffer and String Builder



        //Differemnce between String Buffer and String Builder
        //1,StringBuffer is synchronized whereas StingBuilder is not synchronized
        //2.Stringbuffer is slow in performance  whereas StringBuilder is fast in performance


        //String Buffer
        //Strig Buffer is a mutable version of strings
        //That means  for the same string object  we can modify, delete, edit for the same string object
        //syntax for creating a stringbuffer object
        //StringBuffer objname=new StringBuffer();

        StringBuffer sb1=new StringBuffer("Hello");

        System.out.println(sb1);

        sb1.append("World");

        System.out.println(sb1);

        sb1.append("New day in progress");

        System.out.println(sb1);

        //inserting the data at 5th index position
        sb1.insert(5,"java");

        System.out.println(sb1);

        //delete the character at 8th index position
        sb1.deleteCharAt(8);

        System.out.println(sb1);

        //How many characters does a string buffer hold
        //by default the capacity of StringBuffer is 16characters
        //If the capacity is exceeded it will increase the size by 1.5n 1.5th of original string
        sb1.capacity();

        System.out.println(sb1.capacity());

        //reverses the current string buffer
        System.out.println(sb1.reverse());

        //deletes the character from 8th index position to 15th index postion
        sb1.delete(8,15);

        System.out.println(sb1);

        System.out.println(sb1.reverse());

        //setting the length of string as 8 characters
        sb1.setLength(8);

        System.out.println(sb1);

        //replacing the values from one particular index position to another index postion
        System.out.println(sb1.replace(2,6,"Python"));

       // System.out.println(sb1);

        //Repeating the same string for 10 times
        //System.out.println(sb1.repeat("python",10));

        //converts the StringBuffer object to a string
        String s4=sb1.toString();

        System.out.println(s4);




    }

}
