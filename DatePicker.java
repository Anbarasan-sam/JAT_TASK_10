package jat_task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		driver =new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		nextMonthButton.click();        
		WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
		date22.click();	        
		WebElement datePickerField = driver.findElement(By.id("datepicker"));
		System.out.println("Selected Date: " + datePickerField.getAttribute("value"));
		WaitForFixTime(4000);	        
		driver.quit();
	}
	public static void WaitForFixTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
