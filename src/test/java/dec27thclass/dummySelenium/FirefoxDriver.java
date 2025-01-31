package dec27thclass.dummySelenium;

public class FirefoxDriver extends RemoteWebDriver {

    public FirefoxDriver get(String Url){
        System.out.println("Launching the application from Firefoxbrowser");

        return this;
    }
}
