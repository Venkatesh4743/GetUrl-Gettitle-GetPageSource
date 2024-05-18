package GetUrlGetPageSourceGettitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrlGetPageSourceGettitle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.google.com/");
		
		//GETURL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//GETTITLE
		String title = driver.getTitle();
		System.out.println(title);
		
		//PAGESOURCE
		String pageSource = driver.getPageSource();	
		System.out.println(pageSource);
		
		driver.quit();
	}

}
