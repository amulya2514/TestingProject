package nov29thpractice;

public class StingPractice4 {
    public static void main(String[] args) {

        String str="Concatenate";
        //catena.0nca.con
        //catenoncco
        str= str.substring(3,8).concat(str.substring(1,4)).concat(str.substring(0,2));
        System.out.println("The final string is: " +str);

    }
}
