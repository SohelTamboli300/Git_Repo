import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.out.println("welcome to java");
		
		//System.setProperty("webdriver.chrome.driver", null)
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,\"reset\")]")).click();
		
		Hello obj = new Hello();
		String username = obj.getData(driver);
		driver.findElement(By.xpath("//button[contains(@class,\"go\")]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("sohel");
		driver.findElement(By.cssSelector("input[name*='inputPassword']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@class='checkbox-container'] /span/input[@id='chkboxOne']")).click();
		driver.findElement(By.cssSelector("span input[id='chkboxTwo']")).click();
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
		//driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("rahul shety");
		
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
		//System.out.println(username);
		List<WebElement>  elements = (List<WebElement>) driver.findElements(By.xpath("h2"));
		 
		
		
		
		
	}
	
	public String getData(WebDriver driver)
	{
		String str=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String ar[]=str.split("'");
		String ar1[] = ar[1].split(str);
		String expt=ar1[0];
		//System.out.println(ar1[1]);
		Assert.assertEquals(expt,"rahulshettyacademy");
		return expt;
	}

}
