import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce_Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Setting up chrome browser
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2"); //opening the url

        System.out.println("The title of the page is: " + driver.getTitle()); //Printing the title of the page
        //Getting the current URL using driver.get method with a print statement.
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Getting the page source using driver.get method with a print statement.
        System.out.println("Page source is: " + driver.getPageSource());

        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com"); //Finding the element by ID and then entering email with sendKeys
        driver.findElement(By.id("Password")).sendKeys("abc123"); //Finding the element by ID and then entering password with sendKeys
        driver.close(); //close browser
    }
}
