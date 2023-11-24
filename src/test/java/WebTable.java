import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("C:\\java p\\Assignment6\\src\\test\\java\\WebTablePage\\SampleApplnWT.html");
		driver.manage().window().maximize();
		
		String path=Selectcheckbox("invarius","Preserve");
		driver.findElement(By.xpath(path)).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	public static String Selectcheckbox(String input1, String input2) {
		
		String Case = input2;
		String UpdatedInput = null;
		
		switch (Case) {
		case "Preserve":
			UpdatedInput= "2";
			 break;
		case "Destroy":
			UpdatedInput="1";
			break;
		
		}
		
		String xpath = "(//tr/th[contains(text(),'"+input1+"')]//parent::tr//following::input)["+UpdatedInput+"]";
		return xpath;
		
	}
	
}
