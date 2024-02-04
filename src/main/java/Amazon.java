import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void  main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/homepage.html?_encoding=UTF8&ref_=navm_accountmenu_re_signout&path=%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_accountmenu_re_signout&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=navm_accountmenu_signout&");
		//this is comment
	}

}
