package com.qa.notepad.baseclass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

public BaseClass() throws IOException {
	FileInputStream file = new FileInputStream("E:\\B1java\\Notepadpractice\\src\\main\\java\\com\\qa\\notepad\\config\\configelements.txt");
	prop = new Properties();
	prop.load(file);
	System.out.println(prop.getProperty("url"));
}



public void initialize(){
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(prop.getProperty("url"));
}



}
