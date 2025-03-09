package come.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.notepad.baseclass.BaseClass;
import com.qa.notepad.pages.LoginPage;
import com.qa.notepad.utils.GetExcelData;

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
	
//	@Test
//	void verifyLogin() {
//		System.out.println(prop.getProperty("loginid"));
//		System.out.println(prop.getProperty("password"));
//		
//		String title = lp.login(prop.getProperty("loginid"), prop.getProperty("password"));
//		Assert.assertEquals(title, "(20+) Facebook");
//	}
	
	@DataProvider()
	Object[][] readDataFromExcel() throws IOException {
		Object[][] dataprovider = GetExcelData.getExcelData();
		return dataprovider;
	}
	
	@Test(dataProvider="readDataFromExcel")
	void verifydataDriverLogin(String loginid, String passwrod) {
		System.out.println(loginid +""+ passwrod); //sdsd
	}
	
	@AfterTest
	void tearDown() {
		
	}








}
