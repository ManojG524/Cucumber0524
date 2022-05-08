package page_class_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout_Overview {

	WebDriver driver;
	
	private WebElement Paymentinformaation=driver.findElement(By.className("summary_info_label"));
	private WebElement saucecard=driver.findElement(By.className("summary_value_label"));
	private WebElement ShippingInformation=driver.findElement(By.className("summary_info_label"));
	private WebElement Delivery_By_Partner_info=driver.findElement(By.className("summary_value_label"));
	private WebElement Iteamtotal=driver.findElement(By.className("summary_subtotal_label"));
	private WebElement Tax=driver.findElement(By.className("summary_tax_label"));
	private WebElement Total_Bill=driver.findElement(By.className("summary_total_label"));
	private WebElement Finish_Button=driver.findElement(By.xpath("//button[@id='finish']"));
	
	
	public void verifying_the_title_of_item(String finalcardname)
	{
		List<WebElement> titlecard=driver.findElements(By.xpath("//div[@class='cart_item_label']//following::div[@class='inventory_item_name']"));
		
		for(WebElement TTCD:titlecard)
		{
			String TName=TTCD.getText();
			
			if(TName.equals(finalcardname))
			{
		
			System.out.println("Name of the Ieam:"+TName);
			
			}
			else
			{
				System.out.println("Title not matched");
			}
			
		}
	}
	public void PaymentInfo()
	{
		String PayInfo=Paymentinformaation.getText();
		if(PayInfo.equals("Payment Information:"))
		{
			System.out.println("Payment Information:-"+saucecard.getText());
		}
	}
	
	public void Shippment()
	{
		String Shipping=ShippingInformation.getText();
		if(Shipping.equals("Shipping Information:"))
		{
			System.out.println("Shipping Information:"+Delivery_By_Partner_info.getText());
		}
	}

	public void Final_Amout_of_Iteam()
	{
		String IT=Iteamtotal.getText();
		String[] iteamprice=IT.split(":");
		System.out.println("ProductPrice"+iteamprice[1]);
	}
	
	public void Tax_Amount()
	{
		String Tax_A=Tax.getText();
		String[] Total_TAX=Tax_A.split(":");
		System.out.println("TAX_For_Product"+Total_TAX[1]);
	}
	
	public void Total_Amount_Billed()
	{
		String TAB=Total_Bill.getText();
		String[] Total_TAB=TAB.split(":");
		System.out.println("Total_Amount_Including_TAX"+Total_TAB[1]);
	}
	
	public void Click_Finish_Button()
	{
		Finish_Button.click();
	}
}
