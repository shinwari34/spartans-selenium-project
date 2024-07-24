package tek.CrossBrowsing_week1_day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {

    public static void main(String[] args) {

        //Open browser in Edge browser
       //  EdgeDriver driver = new EdgeDriver();
         FirefoxDriver driver= new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println(title);
        //driver.quit();
    }

}
