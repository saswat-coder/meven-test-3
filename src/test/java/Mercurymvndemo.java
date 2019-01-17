import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Mercurymvndemo {
	
	public WebDriver driver;
	
  @Test(priority=1)
  public void Maximize() {
	  System.out.println("changes in local driver");
	  System.out.println("git to local");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void Loginwithvaliddetalis()
  {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  driver.findElement(By.partialLinkText("SIGN-OFF")).click();
  }
  @BeforeSuite
  public void Open_browser() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium data\\chromedriver_win32(1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  
  }

  @BeforeTest
  public void Enter_Application() {
	  driver.get("http://newtours.demoaut.com/mercurysignon.php");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
