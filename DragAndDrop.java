package jat_task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//step 1 select iframe.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//step2 select select sourceElement and targetElement 
		WebElement sourceElement =driver.findElement(By.xpath("//div[@id='draggable']"));	
		WebElement targetElement =driver.findElement(By.xpath("//div[@id='droppable']"));
		String targetColor = targetElement.getCssValue("background-color");
		String targetText = targetElement.getText();
		WaitForFixTime(4000);
		//Actions for mouse actions
		Actions actions = new Actions(driver); 
		actions.dragAndDrop(sourceElement, targetElement).perform();
		String targetColor1 = targetElement.getCssValue("background-color");
		if(targetColor1.equals(targetColor)) {
			System.out.println("The current target color is  :: "+targetColor1);
		}else

			System.out.println("Target color is ACHIVED successfuly" );

		String targetText1 = targetElement.getText();
		System.out.println("Target Text is :: " + targetText);
		if(targetText1.equals("Dropped!")) {
			System.out.println("The current target text is  :: "+targetText1);
		}else

			System.out.println("Target text is successfuly updated to :: "+targetText1);


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
