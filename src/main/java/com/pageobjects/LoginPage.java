package com.pageobjects;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.kpcu.mobile:id/login']")
    WebElementFacade userName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.kpcu.mobile:id/password']")    
    WebElementFacade password;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.kpcu.mobile:id/doLogin']")    
    WebElementFacade loginBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
    WebElementFacade message;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
    WebElementFacade okBtn;
	
	public void open_KPCU_Application(){
		
	}

	
	public void enterUserNameandPassword(String userName, String password) throws InterruptedException {
		this.userName.waitUntilVisible().sendKeys(userName);
		this.password.waitUntilVisible().sendKeys(password);
		this.loginBtn.waitUntilVisible().click();
		
	}


	public void verifyMessge(String message) throws InterruptedException {
		String atualMessage = this.message.waitUntilVisible().getText();
		System.out.println(atualMessage+ "  : Message Displayed");
		okBtn.waitUntilVisible().click();
		
	}
}
