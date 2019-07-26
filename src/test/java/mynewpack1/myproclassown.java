package mynewpack1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class myproclassown 
{
	WebDriver driver=null;
	@When("Open TestMeApp")
	public void aa()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	}
	
   @And("Enter username {word}")
	public void a(String a)
	{
		
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.name("userName")).sendKeys(a);
	}
	@And("Enter Password {word}")
	public void z(String o) throws InterruptedException
	{
		
		driver.findElement(By.name("firstName")).sendKeys("Archana");
		driver.findElement(By.name("lastName")).sendKeys("Gopi");
		driver.findElement(By.name("password")).sendKeys(o);
		driver.findElement(By.name("confirmPassword")).sendKeys(o);
		List<WebElement> gender=driver.findElements(By.name("gender"));
		gender.get(1).click();
		driver.findElement(By.name("emailAddress")).sendKeys("archu@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("9876543231");
		driver.findElement(By.name("dob")).sendKeys("09/08/1997");
		driver.findElement(By.name("address")).sendKeys("abcdefghij");
		WebElement security=driver.findElement(By.name("securityQuestion"));
		Select s=new Select(security);
		s.selectByIndex(2);
		driver.findElement(By.name("answer")).sendKeys("caspy");
		driver.findElement(By.name("Submit")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/header/div/b/a")).click();
	   //driver.findElement(By.xpath("html/body/header/div/b/a")).click();
	
		
		
	}
	@And("Enter username new {word}")
		public void b(String z)
	{
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(z);
	}
	@And("Enter password new {word}")
	public void y(String y) throws InterruptedException
	{
		driver.findElement(By.name("password")).sendKeys(y);
		driver.findElement(By.name("Login")).click();
		Thread.sleep(1000);
		
	}
	@And("Click search {word}")
	public void find_ele(String search) throws InterruptedException 
	{
		WebElement sea=driver.findElement(By.name("products"));
		Actions a=new Actions(driver);
		a.sendKeys(sea,search).build().perform();
	    Thread.sleep(1000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
		
		
	}
	@And("Add to card")
	public void cart()
	{
		int len=driver.findElements(By.linkText("Cart")).size();
		if(len==0)
		{
			System.out.println("Add product to cart");
		}
		
	}
		
	}

