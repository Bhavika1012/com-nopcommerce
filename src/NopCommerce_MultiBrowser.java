import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerce_MultiBrowser {
    static String browser = "Edge"; //Creating a static variable that will determine which browser needs to open
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2%20F"; //storing URL in baseUrl
    static WebDriver driver; //storing the browser WebDriver in "driver"

    public static void main(String[] args) {
        //if else loop
        if (browser.equalsIgnoreCase("Chrome")) { //setting up chrome driver
            driver = new ChromeDriver(); //open the link in chrome
        } else if (browser.equalsIgnoreCase("Firefox")) { //setting up firefox driver
            driver = new FirefoxDriver(); //open the link in Firefox
        } else if (browser.equalsIgnoreCase("Edge")) { //setting up edge driver
            driver = new EdgeDriver(); //open the link in Edge
        } else {
            System.out.println("Invalid browser"); //if neither then print this statement
        }
        driver.get(baseUrl); //open the link in chosen browser

        //Printing the title of the page
        String title = driver.getTitle(); //Store in String title
        System.out.println(title);

        //Getting the current URL using driver.get method with a print statement.
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Getting the page source using driver.get method with a print statement.
        System.out.println("Page source is: " + driver.getPageSource());

        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com"); //Finding the element by ID and then entering email with sendKeys
        driver.findElement(By.id("Password")).sendKeys("abc123"); //Finding the element by ID and then entering password with sendKeys
        driver.close(); //Close browser

    }
}
