package tek_intro;


import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

    public static void main( String [] args){


        ChromeDriver chromeDriver = new ChromeDriver();

        // use this method to maximize browser
        //ChromeDriver.manage().window().maximize();


        chromeDriver.get("Https://google.com");

        String title = chromeDriver.getTitle();
        System.out.println(title);

    }
}
