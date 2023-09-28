package ManojYedla.Subscription_Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaunchPageLocators extends BaseClass{
	
	public void PackageNameValidation() {
		Boolean liteHeaderFound = false;
	    Boolean classicHeaderFound = false;
	    Boolean premiumHeaderFound = false;
	    Boolean mostPopularHeaderFound = false;
		try {
		List<WebElement> packageNames = driver.findElements(By.xpath("//*[@id='main']/div/div[1]/div[2]/div//div"));
		
		for (WebElement packageName : packageNames){
            String text = packageName.getText();
            if (text.contains("LITE") && text.contains("Start your trial")) {
                liteHeaderFound = true;
            } else if (text.contains("CLASSIC")&& text.contains("Start your trial")) {
                classicHeaderFound = true;
            } 
            else if (text.contains("MOST POPULAR")) {
            	mostPopularHeaderFound = true;
            }else if (text.contains("PREMIUM")&& text.contains("Start your trial")) {
                premiumHeaderFound = true;
            }
        }
		if (liteHeaderFound == true && classicHeaderFound == true && premiumHeaderFound == true  && mostPopularHeaderFound == true ) {
            System.out.println("Validation Passed: All required headers found.");
        } else {
            System.out.println("Validation Failed: Not all required headers found.");
        }
	
	}catch (Exception e) {
		System.out.println("Validation Failed" + e.getMessage());
	}
		
	}
	
	public static boolean packageAmountValidation(WebDriver driver) {
		try {
			 WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div[1]"));
			 
			 // Check if the table contains the desired values
	            boolean is15SARPresent = isValuePresentInTable(table, "15 SAR/month");
	            boolean is25SARPresent = isValuePresentInTable(table, "25 SAR/month");
	            boolean is60SARPresent = isValuePresentInTable(table, "60 SAR/month");
	            
	            // Perform validation
	            return is15SARPresent && is25SARPresent && is60SARPresent;
			
		}catch (Exception e) {
		}System.out.println("Validation failed");
		return false;
		
	}

	private static boolean isValuePresentInTable(WebElement table, String string) {
		try {
            // Locate the table rows
            java.util.List<WebElement> rows = table.findElements(By.xpath("//*[@id='main']/div/div[1]/div[3]/div[2]/div"));

            // Iterate through the rows
            for (WebElement row : rows) {
                // Locate the cell containing the value
                WebElement cell = row.findElement(By.xpath("//*[starts-with(@id,'currency')]"));

                // If the cell containing the value is found, return true
                if (cell != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

		return false;
	}
	

}
