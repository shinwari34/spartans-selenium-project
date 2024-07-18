package tek_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    //Open Chrome Browser
    //And navigate to facebook.com
    //Push the activity to your repository

    public static void main( String [] args){

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://facebook.com");


    }
}
