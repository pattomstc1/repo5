package orangehrm1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\XIT-8\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 driver.findElement(By.name("username")).sendKeys("Admin");
			 driver.findElement(By.name("password")).sendKeys("admin123");
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
		     driver.findElement(By.name("firstName")).sendKeys("Veena");
		     driver.findElement(By.name("middleName")).sendKeys("V");
		     driver.findElement(By.name("lastName")).sendKeys("Nair");
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		     
		     
			 
		

	}

}
