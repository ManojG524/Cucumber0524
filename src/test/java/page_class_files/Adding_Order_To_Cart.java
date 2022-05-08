package page_class_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Adding_Order_To_Cart {
	
	WebDriver driver;
	
	private WebElement Title=driver.findElement(By.xpath("//span[@class='title']"));
	private WebElement button=driver.findElement(By.xpath("btn btn_primary btn_small btn_inventory"));
	private WebElement cartbutton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	private WebElement Checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
	
	
	public void Verify_the_Title()
	{
		String tt=Title.getText();
		String Name="Products";
		
		Assert.assertEquals(tt, Name);
		
	}
	   public void select_Card(String titlename)
	   {
		   List<WebElement> Cardsname=driver.findElements(By.xpath("//div[@class='inventory_list']//following::div[@class='inventory_item_name']"));
	   
		   for(WebElement CDN:Cardsname)
		   	{
			   String nam= CDN.getText();
			   if(nam.equals(titlename))
			   {
				   button.click();
			   }
		   	}
	   
	   }
   
   		public void click_on_Add_cart()
		   {
			   cartbutton.click();
		   }
   
		   public void Verify_Iteam_in_the_Card(String IteamNameinCard)
		   {
			   List<WebElement> title_matches=driver.findElements(By.xpath("//div[@class='cart_item']//following::div[@class='inventory_item_name']"));
		   
			   for(WebElement CardTitle:title_matches)
			   {
				   String Crdname=CardTitle.getText();
				   
				   if(Crdname.equals(IteamNameinCard))
				   {
					   System.out.println("Iteam Name In the card is Correct");
					   
					   break;
				   }
				   
			   }
			   
		    }
		  
		   public void checkout_button()
		   {
			   Checkout.click();
		   }
		   
   
}
