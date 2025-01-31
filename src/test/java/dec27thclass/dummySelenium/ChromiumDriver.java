package dec27thclass.dummySelenium;

public class ChromiumDriver extends RemoteWebDriver{


    @Override
    public ChromiumDriver get(String Url){
        System.out.println("Launching the application using Chromium Binary");

        return this;
    }
}
