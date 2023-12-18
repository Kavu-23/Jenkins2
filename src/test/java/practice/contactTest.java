package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contactTest {

	@Test
	public void  test1()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
	 
		System.out.println("HI");	
	  

	}

}
