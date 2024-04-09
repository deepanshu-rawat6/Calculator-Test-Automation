import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {
    public static void main(String args[]){
        try {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\Codes\\Calculator-Test-Automation\\Calculator-Test-Automation\\index.html");

        WebElement seven=driver.findElement(By.id("seven"));
        WebElement nine=driver.findElement(By.id("nine"));
        WebElement eq=driver.findElement(By.id("equal"));
        WebElement clear=driver.findElement(By.id("clear"));
        
        seven.click();
        Thread.sleep(1000);
        WebElement add=driver.findElement(By.id("add"));
        add.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000); 
        eq.click();
        System.out.println("Add");
        Thread.sleep(1000);
        clear.click();

        seven.click();
        Thread.sleep(1000);
        WebElement sub=driver.findElement(By.id("sub"));
        sub.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000); 
        eq.click();
        System.out.println("Subtraction");
        Thread.sleep(1000);
        clear.click();

        seven.click();
        Thread.sleep(1000);
        WebElement mul=driver.findElement(By.id("multi"));
        mul.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000); 
        eq.click();
        System.out.println("Multiplication");
        Thread.sleep(1000);
        clear.click();

        seven.click();
        Thread.sleep(1000);
        WebElement div=driver.findElement(By.id("divide"));
        div.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000); 
        eq.click();
        System.out.println("Division");
        Thread.sleep(1000);
        clear.click();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}
//nice
