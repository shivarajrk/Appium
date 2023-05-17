package Appium.Testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class Uiautomator {
	
	@Test
	public void appiumTest() throws MalformedURLException
	{
		
		//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(null)
		
				
		UiAutomator2Options Options=new UiAutomator2Options();
		Options.setDeviceName("RZ8RA19TWCL");
		Options.setCapability("appPackage", "com.mlhuillier.mlwallet");
		Options.setCapability("appActivity", "com.mlhuillier.mlwallet.MainActivity");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Options);
		
		
		/*driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.xpath("//*[@resource-id='android:id/edit']")).sendKeys("shivaraj&kiran");
		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
		//driver.quit();*/
		
		//LONGCLICK:-
		
		/*driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[2]"));
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "duration",2000));
		
		String text = driver.findElement(By.xpath("(//*[@resource-id='android:id/title'])[1]")).getText();
		
		Assert.assertEquals(text, "Sample menu");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@resource-id='android:id/title'])[1]")).isDisplayed());*/
		
		//swipe:-
		/*
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement firstimge = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[1]"));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[1]")).getAttribute("focusable"),"true");
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) firstimge).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		
WebElement firstimge1 = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[2]"));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[2]")).getAttribute("focusable"),"true");
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) firstimge1).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		
		
WebElement firstimge2 = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[3]"));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[3]")).getAttribute("focusable"),"true");
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) firstimge2).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		
WebElement firstimge3 = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[3]"));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[3]")).getAttribute("focusable"),"true");
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) firstimge3).getId(),
			    "direction", "right",
			    "percent", 0.75
			));
			*/
		
		
		//scrollgesture:-(until end)
		
		
		 /*
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		boolean canScrollMore;
		do
		{
	
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}
		while(canScrollMore );
	*/
		
		
		//scroll by google engine:-
		
		/*
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));"));
		*/
		//new method
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"See More\").instance(0))"));
		
		//drag :-
		
		/*
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement drag = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) drag).getId(),
			    "endX", 618,
			    "endY", 492
			));
		String drop = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		
		Assert.assertEquals(drop, "Dropped!");
		*/
		
		//rotation 90 :-
		
	/*	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landscape=new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.xpath("//*[@resource-id='android:id/edit']")).sendKeys("shivaraj&kiran");
		driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));*/
		
		
		
		
		
	}
	

}
