package com.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {

	@AndroidFindBy(id = "login")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`name == \"login\"`]")
	private WebElementFacade userName;

	@AndroidFindBy(id = "password")
	@iOSXCUITFindBy(accessibility = "password")
	private WebElementFacade password;

	@AndroidFindBy(id = "doLogin")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"LOG IN\"`]")
	private WebElementFacade loginBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private WebElementFacade message;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private WebElementFacade okBtn;	
	
    @AndroidFindBy(id = "forgotPassword")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Forgot Password?\"`]")
    private WebElementFacade forgotPasswordLnk;
    
    @AndroidFindBy(id = "imgShowPassword")
    @iOSXCUITFindBy(accessibility = "showPassword")
    private WebElementFacade showPasswordImg;
    
    @AndroidFindBy(id = "rememberUserId")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSwitch[`value == \"0\"`]")
    private WebElementFacade rememberUserIdSliderIcon;
    
    @AndroidFindBy(id = "rememberUserId")
    @iOSXCUITFindBy(accessibility = "Remember my User ID")
    private WebElementFacade rememberUserIdSliderTxt;
    
    @AndroidFindBy(id = "logo")
    @iOSXCUITFindBy(accessibility = "kpcu-login-logo")
    private WebElementFacade logoImg;
    
    @AndroidFindBy(id = "card")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"loginPage\"`]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElementFacade centerCardBoxArea;
    
    @AndroidFindBy(id = "middleArea")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"loginPage\"`]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]")
    private WebElementFacade middleAreaImg;
    
    @AndroidFindBy(id = "atm_locator")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"ATM/Branches\"`]")
    private WebElementFacade atmLocatorArea;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/atm_locator\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginAtmBranchesIcon")
    private WebElementFacade atmLocatorImg;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/atm_locator\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"ATM/Branches\"`]")
    private WebElementFacade atmLocatorTxt;
    
    @AndroidFindBy(id = "fastBalance")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Fast Balances\"`]")
    private WebElementFacade fastBalanceArea;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/fast_balance\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Fast Balances\"`]")
    private WebElementFacade fastBalancesTxt;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/fast_balance\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginFastBalanceIcon")
    private WebElementFacade fastBalancesImg;
    
    @AndroidFindBy(id = "contactUs")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Contact Us\"`]")
    private WebElementFacade contactUsArea;
    
    @AndroidFindBy(className = "//*[@classchain=\"com.kpcu.mobile.uat:id/contact_us\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginContactusIcon")
    private WebElementFacade contactUsImg;
    
    @AndroidFindBy(className = "//*[@resource-id=\"com.kpcu.mobile.uat:id/contact_us\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Contact Us\"`]")
    private WebElementFacade contactUsTxt;
    
    @AndroidFindBy(id = "register")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Register\"`]")
    private WebElementFacade registerLnk;
    
    @AndroidFindBy(id = "disclaimer")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Disclaimer\"`]")
    private WebElementFacade disclaimerLnk;  
    
    @AndroidFindBy(id = "privacy")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Privacy/Legal\"`]")
    private WebElementFacade privacyLnk;

	@Step("Open Application using apk")
	public void open_KPCU_Application() {

	}

	@Step("Enter User name and Password")
	public void enterUserNameandPassword(String userName, String password) throws InterruptedException {
		this.userName.waitUntilVisible().sendKeys(userName);
		this.password.waitUntilVisible().sendKeys(password);
		this.loginBtn.waitUntilVisible().click();
	}

	@Step("Verify Message")
	public void verifyMessge(String message) throws InterruptedException {
		String atualMessage = this.message.waitUntilVisible().getText();
		System.out.println(atualMessage + "  : Message Displayed");
		okBtn.waitUntilVisible().click();

	}
}
