package com.EndtoEndTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		
		String productName="IPHONE 13 PRO";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("Theja@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Thejaswini$123");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

		for (WebElement product : products) {

			if (product.getText().contains(productName)) {

				product.findElement(By.cssSelector(".card-body button:last-of-type")).click();
			}
		}

		/*
		 * WebElement prod = products.stream().filter(product->
		 * product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).
		 * findFirst().orElse(null);
		 * prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		 * 
		 */
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));

		for (WebElement cartproduct : cartproducts) {

			
			if (cartproduct.getText().contains(productName)) {
				Assert.assertTrue(true);

				System.out.println(cartproduct.getText());
				driver.findElement(By.xpath("(//*[@class='cartSection removeWrap']/button)[1]")).click();

          	}
    	}
	
				Actions a = new Actions(driver);
				a.sendKeys(driver.findElement(By.xpath("//*[@placeholder='Select Country']")), "India").build().perform();
				
				
				
		List<WebElement> selectedcountrys= driver.findElements(By.xpath("//*[contains(@class,'ta-results')]"));
		
		for (WebElement selectedcountry: selectedcountrys) {
			
			if (selectedcountry.getText().contains("India"))
			{
				driver.findElement(By.xpath("(//*[contains(@class,'ta-item')])[2]")).click();
				
				
				
		     	}
			
			
	      	}
   // WebElement	placeholder =    driver.findElement(By.cssSelector(".action__submit"));
//	a.moveToElement(placeholder).click().perform();
	
	//	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("arguments[0].scrollIntoView()", placeholder);
	//	placeholder.click();

		// jse.executeScript("scroll(0, 250)"); 
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".action__submit")));
		
      driver.findElement(By.xpath("//*[contains(@class,'action__submit')]")).click();
          
          String ConfirmationMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
          Assert.assertTrue(ConfirmationMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
	      driver.close();
	}

}
