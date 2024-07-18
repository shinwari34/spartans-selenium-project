package tek_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    //Open Chrome Browser
    //And navigate to facebook.com
    //Push the activity to your repository

    public static void main( String[] args){

        ChromeDriver driver = new ChromeDriver();

        // to navigate to a url.
        driver.get("https://facebook.com");

        //to close browser entirely.
       // chromeDriver.quit();
    }
}
