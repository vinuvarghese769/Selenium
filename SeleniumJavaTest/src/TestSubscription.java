import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;				
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSubscription {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinuv\\selenium\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();		    

        //Maximize window		
        driver.manage().window().maximize();	
        
        //Launch the SA Site.		
        driver.get("https://subscribe.stctv.com/sa-en");
        System.out.println("***SA***");
        
        //Get values form and elements
        String type = driver.findElement(By.cssSelector("div[class='packages packages Light'] h1")).getText();
        String price = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='amount']")).getText();					
        String currency = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='currency']")).getText();				
        //String period = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type);
        
        //Verify the result        
        String result = checkValues(type, "sa", price, currency);           
        System.out.println(result);
        System.out.println("\n");
        
        //Get values form and elements
        String type1 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] h1")).getText();
        String price1 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='amount']")).getText();					
        String currency1 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='currency']")).getText();				
        //String period1 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type1);
        
        //Verify the result        
        String result1 = checkValues(type1, "sa", price1, currency1);           
        System.out.println(result1);
        System.out.println("\n");
        
        //Get values form and elements
        String type2 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] h1")).getText();
        String price2 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='amount']")).getText();					
        String currency2 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='currency']")).getText();				
        //String period2 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type2);
        
        //Verify the result        
        String result2 = checkValues(type2, "sa", price2, currency2);           
        System.out.println(result2);
        System.out.println("\n");
        
        //Launch the BH Site.		
        driver.get("https://subscribe.stctv.com/bh-en");
        System.out.println("***BH***");
        
        //Get values form and elements
        String type3 = driver.findElement(By.cssSelector("div[class='packages packages Light'] h1")).getText();
        String price3 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='amount']")).getText();					
        String currency3 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='currency']")).getText();				
        //String period3 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type3);
        
        //Verify the result        
        String result3 = checkValues(type3, "bh", price3, currency3);           
        System.out.println(result3);
        System.out.println("\n");
        
        //Get values form and elements
        String type4 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] h1")).getText();
        String price4 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='amount']")).getText();					
        String currency4 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='currency']")).getText();				
        //String period4 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type4);
        
        //Verify the result        
        String result4 = checkValues(type4, "bh", price4, currency4);           
        System.out.println(result4);
        System.out.println("\n");
        
        //Get values form and elements
        String type5 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] h1")).getText();
        String price5 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='amount']")).getText();					
        String currency5 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='currency']")).getText();				
        //String period5 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type5);
        
        //Verify the result        
        String result5 = checkValues(type5, "bh", price5, currency5);           
        System.out.println(result5);
        System.out.println("\n");
        
        //Launch the KW Site.		
        driver.get("https://subscribe.stctv.com/kw-en");
        System.out.println("***KW***");
        
        //Get values form and elements
        String type6 = driver.findElement(By.cssSelector("div[class='packages packages Light'] h1")).getText();
        String price6 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='amount']")).getText();					
        String currency6 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='currency']")).getText();				
        //String period6 = driver.findElement(By.cssSelector("div[class='packages packages Light'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type6);
        
        //Verify the result        
        String result6 = checkValues(type6, "kw", price6, currency6);           
        System.out.println(result6);
        System.out.println("\n");
        
        //Get values form and elements
        String type7 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] h1")).getText();
        String price7 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='amount']")).getText();					
        String currency7 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='currency']")).getText();				
        //String period7 = driver.findElement(By.cssSelector("div[class='packages packages Classic'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type7);
        
        //Verify the result        
        String result7 = checkValues(type7, "kw", price7, currency7);           
        System.out.println(result7);    
        System.out.println("\n");       
        
        //Get values form and elements
        String type8 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] h1")).getText();
        String price8 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='amount']")).getText();					
        String currency8 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='currency']")).getText();				
        //String period8 = driver.findElement(By.cssSelector("div[class='packages packages Premium'] div[class='price'] span[class='period']")).getText();				
        
        System.out.println("type == " + type8);
        
        //Verify the result        
        String result8 = checkValues(type8, "kw", price8, currency8);           
        System.out.println(result8);
        
        //Close the browser
        driver.quit();	       		
	}
	
	static String checkValues(String type, String country, String price, String currency){		
		switch(country)
		{
		   case "sa" :			   
			   switch(type)
			   {
			      case "LITE" :
			    	  if(price.equals("15")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "CLASSIC" :
			    	  if(price.equals("25")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "PREMIUM" :
			    	  if(price.equals("60")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			   }
			   
			   if(currency.equals("SAR")) {
				   System.out.println(country+" "+type+" currency Test Success");
			   }
			   else {
				   System.out.println(country+" "+type+" currency Test Failed");
			   }
			   return country+" "+type+" Test Success";
			   
		case "kw" :			
			switch(type)
			   {
			      case "LITE" :
			    	  if(price.equals("1.2")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "CLASSIC" :
			    	  if(price.equals("2.5")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "PREMIUM" :
			    	  if(price.equals("4.8")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			   }
			
			   if(currency.equals("KWD")) {
				   System.out.println(country+" "+type+" currency Test Success");
				}
				else {
					System.out.println(country+" "+type+" currency Test Failed");
				}
			   return country+" "+type+" Test Success";
			   
		   case "bh" :			   
			   switch(type)
			   {
			      case "LITE" :
			    	  if(price.equals("2")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "CLASSIC" :
			    	  if(price.equals("3")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			    	  break;
			      case "PREMIUM" :
			    	  if(price.equals("6")) {
			    		  System.out.println(country+" "+type+" price Test Success");
					   }
					   else {
						   System.out.println(country+" "+type+" price Test Failed");
					   }
			   }
			   
			   if(currency.equals("BHD")) {
				   System.out.println(country+" "+type+" currency Test Success");
				}
				else {
					System.out.println(country+" "+type+" currency Test Failed");
				}
			   return country+" "+type+" Test Success";
			   
		   default : 
			   return country+" Test Failed";
		}
	}
}