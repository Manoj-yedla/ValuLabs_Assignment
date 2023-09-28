package ManojYedla.Subscription_Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class subscription_Sanity extends LaunchPageLocators{

	
	@Test
	public void TestCase01ValidatingCountryKsa() throws InterruptedException {
		WebElement translationButton = driver.findElement(By.xpath("//a[@id='translation-btn']"));
		translationButton.click();
		Thread.sleep(3000);
	
		//By default KSA country will be selected
		
		WebElement planSection = driver.findElement(By.xpath("//*[@id='main']/div/div[1]"));
		planSection.isDisplayed();		
		WebElement chooseYourPlanRow = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div[1]/div/h2/b"));
		chooseYourPlanRow.isDisplayed();
		
		//package Name Validation
		PackageNameValidation();
		
		//PackageAmountValidation
		 boolean isValid = LaunchPageLocators.packageAmountValidation(driver);
		 if (isValid) {
	            System.out.println("Validation successful!");
	        } else {
	            System.out.println("Validation failed!");
	        }
	}
	
	@Test
	public void TestCase02ValidatingCountryBahrain() throws InterruptedException {
		
		WebElement translationButton = driver.findElement(By.xpath("//a[@id='translation-btn']"));
		translationButton.click();
		
		WebElement changeCountrybutton = driver.findElement(By.xpath("//*[@id='arrow']"));
		changeCountrybutton.click();
		
		Thread.sleep(3000);
		
		WebElement changeCountryToBahrain = driver.findElement(By.xpath("//*[@id='bh-contry-lable']"));
		changeCountryToBahrain.isDisplayed();
		changeCountryToBahrain.click();
		Thread.sleep(4000);
		
		WebElement planSection = driver.findElement(By.xpath("//*[@id='main']/div/div[1]"));
		planSection.isDisplayed();		
		WebElement chooseYourPlanRow = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div[1]/div/h2/b"));
		chooseYourPlanRow.isDisplayed();
		
		//package Name Validation
		PackageNameValidation();
		
		//PackageAmountValidation
		 boolean isValid = LaunchPageLocators.packageAmountValidation(driver);
		 if (isValid) {
	            System.out.println("Validation successful!");
	        } else {
	            System.out.println("Validation failed!");
	        }
		
	}
	
	@Test
	public void TestCase03ValidatingCountryKuwait() throws InterruptedException {
		
		WebElement translationButton = driver.findElement(By.xpath("//a[@id='translation-btn']"));
		translationButton.click();
		
		WebElement changeCountrybutton = driver.findElement(By.xpath("//*[@id='arrow']"));
		changeCountrybutton.click();
		
		Thread.sleep(3000);
		
		WebElement changeCountryToKuwait = driver.findElement(By.xpath("//*[@id='kw-contry-lable']"));
		changeCountryToKuwait.isDisplayed();
		changeCountryToKuwait.click();
		Thread.sleep(4000);
		
		WebElement planSection = driver.findElement(By.xpath("//*[@id='main']/div/div[1]"));
		planSection.isDisplayed();		
		WebElement chooseYourPlanRow = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div[1]/div/h2/b"));
		chooseYourPlanRow.isDisplayed();
		
		//package Name Validation
		PackageNameValidation();
		
		//PackageAmountValidation
		 boolean isValid = LaunchPageLocators.packageAmountValidation(driver);
		 if (isValid) {
	            System.out.println("Validation successful!");
	        } else {
	            System.out.println("Validation failed!");
	        }
		
	}
	
}
