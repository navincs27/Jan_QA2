package com.Limeroad_Bug_Finders.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Bug_Finders.base.BaseClass;

public class ProductPageImpl extends BaseClass implements ProductPage{
	
	public ProductPageImpl() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = select_gender_id)
	private WebElement men;
	public WebElement getElement() {
		return men;
	}
	
	@FindBy(xpath =men_click_Xpath )
	private WebElement menClick;
	public WebElement getMenClick() {
		return menClick;
	}

	
	@FindBy(xpath=mouse_hover_Xpath)
	private WebElement overmenoption;
	public WebElement getOvermenoption() {
		return overmenoption;
	}
	
	@FindBy(xpath = Select_TShirt)
	private WebElement TShirts;
    public WebElement getTShirts() {
		return TShirts;
	}
    
    @FindBy(id =get_product_id)
    private WebElement product;
    public WebElement getProduct() {
		return product;
	}
    
    @FindBy(id=get_product_item_id)
    private WebElement productItem;
    public WebElement getProductItem() {
		return productItem;
	}
	
    @FindBy(id=get_product_size_id)
    private WebElement productSize;
	
	public WebElement getProductSize() {
		return productSize;
	}


}
