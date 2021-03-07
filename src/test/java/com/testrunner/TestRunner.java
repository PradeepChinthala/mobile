package com.testrunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" }, features = "Features", glue = {
		"com.feature.steps" }, tags = { "@lyy" }, monochrome = true, dryRun = false)
public class TestRunner extends BrowserStackSerenityTest {

	/*static AppiumDriverLocalService appiumService;
	static String appiumServiceUrl;
	static Process process;

	@BeforeClass
	public static void startUp() throws IOException, InterruptedException {

		process = Runtime.getRuntime()
				.exec("cmd.exe /c C:\\Users\\155751\\AppData\\Local\\Android\\Sdk\\emulator\\emulator -avd Pixel_4");
		Thread.sleep(20000);
		appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		appiumServiceUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service Address : - " + appiumServiceUrl);
	}

	@AfterClass
	public static void cleanup() throws IOException {
		if (appiumService != null)
			appiumService.stop();
		if (process != null) {
			Runtime.getRuntime().exec("adb -s emulator-5554 emu kill");
			process = null;
		}

	}*/
}
