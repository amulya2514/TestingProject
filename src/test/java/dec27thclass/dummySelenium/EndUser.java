package dec27thclass.dummySelenium;

public class EndUser {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();

        driver.get("Sample Data");

        System.out.println(driver.getTitle());

        driver = new ChromiumDriver();

        driver.get("Sample data from chromium browser");
        System.out.println(driver.getTitle());

    }

    //TopDown Approach
    //Parent class can access the child class methods and variables
    //We are creating an object of the child class and calling methods of the parent class

    //BottomUp Approach
    //It is not possible in JAVA



}
