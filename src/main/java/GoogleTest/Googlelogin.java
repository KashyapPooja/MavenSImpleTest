package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	String title = 	driver.getTitle();
	String URL = 	driver.getCurrentUrl();
	System.out.println("Title is " +title);
	System.out.println("URL is "+URL);

	}

}
