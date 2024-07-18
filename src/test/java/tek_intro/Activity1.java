package tek_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main( String[] args){

        // to navigate to a url.
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://facebook.com");

        //to close browser entirely.
       // chromeDriver.quit();
    }
}
