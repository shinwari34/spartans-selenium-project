package tek_intro;


import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

    public static void main( String [] args){

        //Open Browser Chrome Browser
        ChromeDriver driver = new ChromeDriver();

        //Use this Method to Maximize Browser
        driver.manage().window().maximize();

        //Navigate to a URL
        driver.get("https://google.com");

        //return String of Application title.
        String title = driver.getTitle();
        System.out.println(title);

        //to Close browser entirely.
       // chromeDriver.quit();






    }
}
