package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addcustomer {
	
	public WebDriver driver;
	
	public Addcustomer(WebDriver ldriver){
		driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}

	By username  = By.xpath(" urname");
	By password = By.xpath("psword");
	By lgnbtn = By.xpath("lognbtun");
	By drdownvalue = By.xpath("drdown");



public void sendusername(String name){
	driver.findElement(username).sendKeys(name);
}

public void clickelement(){
	driver.findElement(lgnbtn).click();
}

public void setcustmerrle(String cusrle) throws Exception{
	if(cusrle.equals("vendors")){
		driver.findElement(password).click();
		
	}
	
 }
public void selectdrvalue (String value){
	Select drp  = new Select(driver.findElement(drdownvalue));
	drp.selectByVisibleText(value);
}

}