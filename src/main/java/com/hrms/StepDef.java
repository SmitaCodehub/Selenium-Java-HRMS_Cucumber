package com.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
		public WebDriver driver;
		@Given ("^Open Application$")
		public void openBrowser() {
	//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
//	2. enter url
	driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		}
	
//	3. Verify title
	@When ("^Verify Title$")
 public void verifyTitle() throws Exception {
	
System.out.println(driver.getTitle());
if(driver.getTitle().equals("OrangeHRM"))
{
	System.out.println(driver.getTitle() +" Matched");
}
else {
	System.out.println(driver.getTitle() +" Expected");
}
Thread.sleep(2000);
 }
//4. Login
	@When ("^Type username and password and click on Login button$")
   public void loginAplication() throws Exception {
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//5. enter password
driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");

//	6.Click on Login Button

driver.findElement(By.name("Submit")).click();
Thread.sleep(1000);
 
   }

	@When ("^Click on Logout$")
public void logoutApplication() throws Exception
{
Thread.sleep(3000);
//8.click on logout
driver.findElement(By.id("welcome")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Logout")).click();

   }
@Then ("^Close Application$")
public void closeApplication() throws Exception {
Thread.sleep(2000);
driver.close();
}
}
