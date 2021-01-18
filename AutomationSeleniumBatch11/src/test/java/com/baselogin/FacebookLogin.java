package com.baselogin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.manager.MasterPageFactory;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class FacebookLogin {
	
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfigValue("URL"));//config
		//1st picture
		ScreenShot.getScreenShot(driver, "Home Page");
		MasterPageFactory pf = new MasterPageFactory();
		WebElement email =pf.getEmail();
		//>>here
		new HighLighter().getHighlighter(driver, email);
		email.sendKeys(BaseConfig.getConfigValue("user"));//config
		WebElement password =driver.findElement(By.xpath("//*[@id='pass']"));
		//Highlight pass
		new HighLighter().getHighlighter(driver, password);
		password.sendKeys(BaseConfig.getConfigValue("pass"));//crime config file
		WebElement loginBtn =driver.findElement(By.xpath("//*[@name='login']"));
		//Highlight button
		new HighLighter().getHighlighter(driver, loginBtn);
		//2nd picture
		ScreenShot.getScreenShot(driver, "Login page");
		loginBtn.submit();
		
		ScreenShot.getScreenShot(driver, "After Login done");
	}
}
