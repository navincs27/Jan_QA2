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
	
<<<<<<< HEAD
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


=======
	
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
	
>>>>>>> 8b413f460d3c81e85609fe6f332ee3bc8ad308e8
}
	}
	


