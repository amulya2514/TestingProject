package dec11thClass;

//default value for a string or any non primitive datatype is null
//default value for a double - 0.0 boolean - false
//integer/short/byte/long = 0  char = emptyspace
class Cars{

    private String name;
    private double price;
    private String model;

    public void displayCarDetails(){

        System.out.println("Name is: " +name);
        System.out.println("Price is: " +price);
        System.out.println("Model is: " +model);


    }
}

public class ConstructorConcepts {

    public static void main(String[] args) {

        Cars c1 = new Cars();

        /*c1.name = "BMW";
        c1.price= 5000000;
        c1.model= "X1";*/

        c1.displayCarDetails();


    }
}
