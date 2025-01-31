package dec27thclass.dummySelenium;

public interface WebDriver extends SearchContext {

    WebDriver get(String Url); //Launch the application

    WebDriver getTitle();

    WebDriver PageSource();

    WebDriver getCurrentURL();
}
