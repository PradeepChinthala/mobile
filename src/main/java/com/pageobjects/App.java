package com.pageobjects;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
        System.out.println( "Hello World!" );
        
        File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apk/");
		File app = new File(appDir, "com.kpcu.mobile_442-3406_apkplz.net.apk");
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noreset", "true");
        capabilities.setCapability("fullreset", "false");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appWaitPackage", "com.kpcu.mobile");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
        
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4");        
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        @SuppressWarnings("rawtypes")
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000); 
        driver.findElementByXPath("//android.widget.EditText[@resource-id='com.kpcu.mobile:id/login']").sendKeys("appltest3");
    	driver.findElementByXPath("//android.widget.EditText[@resource-id='com.kpcu.mobile:id/password']").sendKeys("Welcome2kpcu!");
    	driver.findElementByXPath("//android.widget.Button[@resource-id='com.kpcu.mobile:id/doLogin']").click();
   	
    	Thread.sleep(5000); 
    	String ss = driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/message']").getText();
    	System.out.println(ss);
    	
    	Thread.sleep(5000); 
    	driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").click();
        
    	try{
        	
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
         driver.quit();
    }
}
