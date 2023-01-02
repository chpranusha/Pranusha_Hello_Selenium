package testng_Suite1;

import org.openqa.selenium.devtools.v107.network.model.ReportingApiReport;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;





public class Module1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
		
	}
	@Test (groups = {"Smoke","Sanity"})
	
	public void test001() {
		System.out.println("This is Test 001");
		Assert.assertEquals(false, true);
		
		Reporter.log("I am Executing test case 001");
	}
	@Test
	public void test002() {
		System.out.println("This is Test 002");
	}
	@Test
	public void test003() {
		System.out.println("This is Test 003");
	}
	public void test004() {
		System.out.println("This is Test 004");
		Assert.assertEquals(false, true);
		
		Reporter.log("I am Executing test case 004");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}
	@DataProvider
	
	public Object [][] data001() {
		Object[][] data= {{"Pranusha","Pass001"},{"Anu","pass002"}};
		return data;
		
	}
	
	@Test (dataProvider = "data001")
	public void login(String username,String password) {
		System.out.println(username +" and"+ password);
	}
}
