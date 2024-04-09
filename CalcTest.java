import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("./Calculator-Test-Automation/index.html");
        WebElement textBox=driver.findElement(By.id("result"));

        int number1=30, number2=5;
        WebElement eq=driver.findElement(By.id("equal"));
        
        textBox.sendKeys(Integer.toString(number1));
        WebElement add=driver.findElement(By.id("add"));
        add.click();
        textBox.sendKeys(Integer.toString(number2));
        eq.click();

        textBox.sendKeys(Integer.toString(number1));        
        WebElement sub=driver.findElement(By.id("sub"));
        sub.click();
        textBox.sendKeys(Integer.toString(number2));
        eq.click();

        textBox.sendKeys(Integer.toString(number1));        
        WebElement multi=driver.findElement(By.id("multi"));
        multi.click();
        textBox.sendKeys(Integer.toString(number2));
        eq.click();

        textBox.sendKeys(Integer.toString(number1));        
        WebElement div=driver.findElement(By.id("divide"));
        div.click();
        textBox.sendKeys(Integer.toString(number2));
        eq.click();
    }
}
