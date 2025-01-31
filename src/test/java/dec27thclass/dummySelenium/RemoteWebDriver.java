package dec27thclass.dummySelenium;

public class RemoteWebDriver implements WebDriver {
    @Override
    public WebDriver get(String Url) {

        System.out.println("Launching the application for the URL");


        return this;
    }

    @Override
    public WebDriver getTitle() {

        System.out.println("Title of the wondow is ");

        return this;
    }

    @Override
    public WebDriver PageSource() {

        System.out.println("Pagesource of the browser is ");
        return this;
    }

    @Override
    public WebDriver getCurrentURL() {
        System.out.println("Current Url of the application is ");
        return this;

    }

    @Override
    public SearchContext findElement() {

        System.out.println("Finding the element of the class  ");
        return this;
    }

    @Override
    public SearchContext findElements() {
        return this;
    }
}
