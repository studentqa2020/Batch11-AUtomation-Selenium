package com.baselogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaLogin {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		WebElement allcookies =driver.findElement(By.xpath("(//*[@type='button'])[2]"));
		allcookies.click();		
		//sign btn
		//send email
		//send pass
		// click sign in
				
				

		
	}

}
