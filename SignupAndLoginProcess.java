package jat_task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupAndLoginProcess {
	static WebDriver driver;
	
	public static void main(String[] args) {
		myLogin();
	}
	public static void registerAcc() {
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		WebElement myElementname = driver.findElement(By.xpath("//input[@id='name']"));
		myElementname.sendKeys("Anbarasan");
		myElementname.sendKeys(Keys.ENTER);
		
		WebElement myElementEmail = driver.findElement(By.xpath("//input[@id='email']"));
		myElementEmail.sendKeys("anbarasanguvi@gmail.com");
		myElementEmail.sendKeys(Keys.ENTER);
		
		WebElement myElementpass = driver.findElement(By.xpath("//input[@id='password']"));
		myElementpass.sendKeys("GuviPass@123");
		myElementpass.sendKeys(Keys.ENTER);
		
		WebElement myElementnum = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		myElementnum.sendKeys("9876543210");
		myElementnum.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		WaitForFixTime(5000);
		
		WebElement profileDrpDwn = driver.findElement(By.xpath("//select[@id='profileDrpDwn']"));
		profileDrpDwn.click();
		WebElement lookingForCarrier = driver.findElement(By.xpath("//option[contains(text(),'Looking for a career')]"));
		lookingForCarrier.click();
		
		WebElement degreeDrpDwn = driver.findElement(By.xpath("//select[@id='degreeDrpDwn']"));
		degreeDrpDwn.click();
		WebElement degreeQali = driver.findElement(By.xpath("//option[@value='B.E. / B.Tech. EEE']"));
		degreeQali.click();
	
		WebElement yearOfPassing = driver.findElement(By.xpath("//input[@id='year']"));
		yearOfPassing.sendKeys("2023");
		
		driver.findElement(By.xpath("//a[@id='details-btn']")).click();
		driver.close();
	}
	public static void myLogin() {
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		WebElement myEmail = driver.findElement(By.xpath("//input[@id='email']"));
		myEmail.sendKeys("anbarasanguvi@gmail.com");
		myEmail.sendKeys(Keys.ENTER);
		
		WebElement myPass = driver.findElement(By.xpath("//input[@id='password']"));
		myPass.sendKeys("GuviPass@123");
		myPass.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		
		
		
	}
	public static void WaitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
