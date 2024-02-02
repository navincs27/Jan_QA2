package com.Limeroad_Bug_Finders.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Bug_Finders.base.BaseClass;

public class CartPageImpl extends BaseClass implements CartPage {
	
	public CartPageImpl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = mom_and_baby_tab_xpath)
	private WebElement momAndBaby_tab;
	
	@FindBy(xpath = mom_and_baby_tab_xpath)
	private WebElement momBaby_tab;
	
}
