package come.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.notepad.baseclass.BaseClass;
import com.qa.notepad.pages.LoginPage;

public class Loginpagetest extends BaseClass {
	LoginPage lp;
	Loginpagetest() throws IOException{
		super();
	}

	@BeforeTest
	void setUp() throws IOException {
		initialize();
		 lp = new LoginPage();
	}
	
	@Test
	void verifyLogin() {
		System.out.println(prop.getProperty("loginid"));
		System.out.println(prop.getProperty("password"));
		
		String title = lp.login(prop.getProperty("loginid"), prop.getProperty("password"));
		Assert.assertEquals(title, "(20+) Facebook");
	}
	
	@AfterTest
	void tearDown() {
		
	}








}
