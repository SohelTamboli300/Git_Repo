import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	void f1() {
		// 5*4*3*....
		int fact = 1, n = 5;

		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		System.out.print("factorial is:" + fact);
	}

	void Reverse() {
		String rev= "";
		String arr = "sohel";
		char ch;

		for (int i = 0; i < arr.length(); i++) {
			ch = arr.charAt(i);
			rev = ch+rev;
		}
		System.out.print(rev);
	}
	
	void spliteString()
	{
		String st1 = "this is to split";
		String[] sp = st1.split(" ");
		
		for(String a: sp)
		System.out.println(a);
		
		
	}

	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://www.amazon.in/"); //this is comment
		Amazon obj = new Amazon();
		obj.f1();
		obj.Reverse();
		obj.spliteString();
		System.out.print("hellow");
		System.out.print("this change from pro helloJavaGIT");
	}

}
