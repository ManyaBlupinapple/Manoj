package Test;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Withoutupcasting {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=WebDriverManager.chromedriver().create();
	
		driver.get("https://www.google.com/");
		//Thread.sleep(200000);
	}

}
