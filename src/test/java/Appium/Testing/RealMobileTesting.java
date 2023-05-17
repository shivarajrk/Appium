package Appium.Testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class RealMobileTesting {
	@Test
	public void launch() throws MalformedURLException, InterruptedException {
		UiAutomator2Options Options = new UiAutomator2Options();
		Options.setDeviceName("RZ8RA19TWCL");
		Options.setCapability("appPackage", "com.mlhuillier.mlwallet");
		Options.setCapability("appActivity", "com.mlhuillier.mlwallet.MainActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Options);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='9XX XXX XXXX']")).sendKeys("9999999996");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[10]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//*[@resource-id='textInput'])")).click();
		driver.findElement(By.xpath("(//*[@resource-id='textInput'])")).sendKeys("111111");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@text='Cash In'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='My Bank Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='BDO Internet Banking']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='0.00']")).sendKeys("50");
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Next']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Next']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@text='While using the app']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@text='Complete Transaction']")).click();
		System.out.println("successfully completed");
	}
}
