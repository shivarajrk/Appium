package Appium.Testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class SeeMore {
public	AndroidDriver driver;

	@Test
	public void launch() throws MalformedURLException, InterruptedException {
		
		
		UiAutomator2Options Options = new UiAutomator2Options();
		Options.setDeviceName("RZ8RA19TWCL");
		Options.setAutomationName("uiAutomator2");
		Options.setCapability("appPackage", "com.mlhuillier.mlwallet");
		Options.setCapability("appActivity", "com.mlhuillier.mlwallet.MainActivity");

		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@text='9XX XXX XXXX']")).sendKeys("9999999994");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[10]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//*[@resource-id='textInput'])")).click();
		driver.findElement(By.xpath("(//*[@resource-id='textInput'])")).sendKeys("111111");
		Thread.sleep(2000);
		
		
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"See More\").instance(0))"));
		
		driver.findElement(By.xpath("//*[@text='See More']")).click();
		Thread.sleep(20000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@text='Cash In' or @text='Cash Out']"));
		List<WebElement> ele1=driver.findElements(By.xpath("//*[@text='Cash In' or @text='Cash Out']/following-sibling::android.widget.TextView[contains(@text, 'Php')]"));
		int count=ele.size();
		int count1 = ele1.size();
		for( int i=0;i<count;i++)
		{
			
			String text=ele.get(i).getText();
			//System.out.println(text);
		
				for(int j=0;j<count1;j++)
				{
					String text1 = ele1.get(j).getText();
					//System.out.println(text1);
			
					System.out.println(text+" "+text1);
				}
		}
		
	 //   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"See More\").instance(0))");
		
	    
//		MobileElement radioGroup = (MobileElement) wd
//
//				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//
//				+ ".resourceId(\"<listview_id>\")).scrollIntoView("
//
//				+ "new UiSelector().text(\"Feature\"));");
		
//		boolean canScrollMore;
//		do
//		{
//	
//		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 200, "height", 200,
//			    "direction", "down",
//			    "percent", 3.0
//			));
//		}
//		while(canScrollMore );
		driver.findElement(By.xpath("//*[@text='Cash In']"));
		
		
		
	}
	
}
