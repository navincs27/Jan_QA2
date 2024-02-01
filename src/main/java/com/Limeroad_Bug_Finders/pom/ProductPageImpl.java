package com.Limeroad_Bug_Finders.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Bug_Finders.base.BaseClass;

public class ProductPageImpl extends BaseClass implements ProductPage{

	public ProductPageImpl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = mom_and_baby_tab_xpath)
	private WebElement momAndBaby_tab;
	@FindBy(xpath = "//p[text()='Women']")
    private WebElement element1;
    
	@FindBy(xpath ="//a[@id='women_category']")
	private WebElement element2;
	
	@FindBy(xpath = "//a[text () = 'Palazzos & Skirts']")
	private WebElement element3;
	
	@FindBy(xpath = "//img[@id ='18016717']")
	private WebElement element4;
	
	@FindBy(xpath = "//span[@id = 'size_28306531']")
	private WebElement element5;
	
	@FindBy(xpath ="//div[text() = 'ADD TO CART']")
	private WebElement element6;
	
		public WebElement getElement1() {
		return element1;
		
	}
	public WebElement getElement2() {
		return element2;
		
	}
	public WebElement getElement3() {
		return element3;
		
	}
	
	public WebElement getElement4() {
			return element4;
			
		}	
public WebElement getElement5() {
		return element5;
		
	}
public WebElement getElement6() {
	return element6;
	
}
	}
	

}
