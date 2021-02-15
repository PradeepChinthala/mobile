package com.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountsPage extends PageObject {

	@AndroidFindBy(id = "greeting_name")
    @iOSXCUITFindBy(accessibility = "Test")
    private WebElementFacade userLbl;
    @AndroidFindBy(id = "header_title")
    @iOSXCUITFindBy(accessibility = "ACCOUNTS")
    private WebElementFacade titleTxt;
    @AndroidFindBy(id = "avatar_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"accountsPage\"`]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    private WebElementFacade avatarImg;
    @AndroidFindBy(id = "account_logout_button")
    @iOSXCUITFindBy(accessibility = "logout")
    private WebElementFacade logoutBtn;
    @AndroidFindBy(id = "header_account_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"+ Open a New Account\"`]")
    private WebElementFacade openNewAcctBtn;
    @AndroidFindBy(id = "title")
    private WebElementFacade acctTitleTxt;
    @AndroidFindBy(id = "dollars")
    private WebElementFacade dollarsTxt;
    @AndroidFindBy(id = "cents")
    private WebElementFacade centsTxt;
    @AndroidFindBy(id = "account_info_value")
    private WebElementFacade availBalanceLnk;
    @AndroidFindBy(id = "btnShortcut")
    private WebElementFacade btnShortcutImg;
    @AndroidFindBy(id = "body")
    @iOSXCUITFindBy(accessibility = "checkingAccount")
    private WebElementFacade checkingAcctBox;
    @AndroidFindBy(id = "body")
    @iOSXCUITFindBy(accessibility = "savingsAccount")
    private WebElementFacade savingsAcctBox;
    @AndroidFindBy(id = "accounts_list_view")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[`name == \"accounts\"`]")
    private WebElementFacade accountsListViewImg;
    @AndroidFindBy(accessibility = "Accounts")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Accounts\"`]")
    private WebElementFacade accountsIcon;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Accounts\"]/android.widget.ImageView")
    private WebElementFacade accountsIconImg;
    @AndroidFindBy(id = "largeLabel")
    private WebElementFacade accountsIconTxt;
    @AndroidFindBy(accessibility = "Deposit")
    @iOSXCUITFindBy(accessibility = "rdc")
    private WebElementFacade depositIcon;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Deposit\"]/android.widget.ImageView")
    private WebElementFacade depositIconImg;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Deposit\"]/android.view.ViewGroup")
    private WebElementFacade depositIconTxt;
    @AndroidFindBy(accessibility = "Move Money")
    @iOSXCUITFindBy(accessibility = "moveMoney")
    private WebElementFacade moveMoneyIcon;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Move Money\"]/android.widget.ImageView")
    private WebElementFacade moveMoneyImg;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Move Money\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade moveMoneyTxt;
    @AndroidFindBy(id = "bottombaritem_more")
    @iOSXCUITFindBy(accessibility = "more")
    private WebElementFacade moreIcon;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
    private WebElementFacade moreImg;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"More\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade moreTxt;


    public String getUserLbl() {
        return userLbl.waitUntilVisible().getText();
    }

    public String getTitleTxt() { return titleTxt.waitUntilVisible().getText(); }

    public void clickMoveMoneyIcon(){
        moveMoneyIcon.waitUntilVisible().click();
    }

    public void clickCheckingAcctBox(){
        checkingAcctBox.waitUntilVisible().click();
    }

    public void clickSavingsAcctBox(){
        checkingAcctBox.waitUntilVisible().click();
    }
}
