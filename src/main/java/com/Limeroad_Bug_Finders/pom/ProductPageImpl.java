package com.Limeroad_Bug_Finders.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Bug_Finders.base.BaseClass;

public class ProductPageImpl extends BaseClass implements ProductPage{

	public ProductPageImpl() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath =  women_xpath)
    private WebElement element1;
    
	@FindBy(xpath = womencategory_xpath)
    private WebElement element2;
	
	@FindBy(xpath = palazzos_xpath)
	private WebElement element3;
	
	@FindBy(xpath = pant_xpath )
	private WebElement element4;
	
	@FindBy(xpath = size_xpath )
	private WebElement element5;
	
	@FindBy(xpath = Add_To_Cart)
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
	


