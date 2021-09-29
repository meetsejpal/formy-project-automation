import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meetsejpal/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();

        WebElement option = driver.findElement(By.id("autocomplete"));
        option.click();

        driver.quit();
    }
}
