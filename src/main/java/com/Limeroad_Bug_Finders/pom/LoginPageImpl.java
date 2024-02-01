package com.Limeroad_Bug_Finders.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageImpl {
	public WebDriver driver ;
	@FindBy (xpath = "clickButton_Xpath")
	private WebElement clickButton;
	 
	public LoginPageImpl()
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getClickButton () {
		return clickButton;
		
	}
	@FindBy (id="Shopmen_Id")
	private WebElement Shopmen;
	
	public WebElement getShopmen () {
		return Shopmen;

	}
	
	@FindBy (xpath ="FormalShirt_Xpath")
	private WebElement FormalShirt;
	
	public WebElement getFormalShirt () {
		return FormalShirt;
	}
	
	@FindBy (xpath = "FirstShirt_Xpath")
	private WebElement FirstShirt;
	
	public WebElement getFirstShirt () {
		return FirstShirt;
	}
	
	@FindBy (xpath = "size38_Xpath")
	private WebElement size38 ;
	
	public WebElement getSize38 () {
		return size38;
	}
	
	@FindBy (xpath = "addToCart_Xpaths")
	
	private WebElement addToCart;
	
	public WebElement getaddToCart () {
		return addToCart;
	}
}
