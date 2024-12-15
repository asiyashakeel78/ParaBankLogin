package com.testRun;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class MenuBar {
	public static void main(String[] args) {
		//For costco	
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.costco.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//List<String> myList = new ArrayList<String>();
		//List<WebElement> mylist = driver.findElements(By.xpath("//*[@class='MuiBox-root mui-1nzpdry']//a"));
		//System.out.println(mylist.size());
		
		//for(WebElement e: mylist) {
			//myList.add(e.getText());
			
		//}
		//System.out.println(myList);
		
		//For bestbuy
		
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		
		List<String> myList2 = new ArrayList<String>();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> myList3 = driver.findElements(By.xpath("//*[@class='bottom-nav-left-wrapper']//a"));
		//List<WebElement> myList3 = driver.findElements(By.xpath("//*[@class='bottom-fluid-container']//a"));
		System.out.println(myList3.size());
		
		for(WebElement f: myList3) {
			System.out.println(f.getText());
			myList2.add(f.getText());
			
		}
		System.out.println(myList2);
		
		
		
		/*driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		List<String> myList4 = new ArrayList<String>();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> myList5 = driver.findElements(By.xpath("//*[@class='nav-fill']//a"));
		
		System.out.println(myList5.size());
		
		for(WebElement f: myList5) {
			System.out.println(f.getText());
			myList4.add(f.getText());
			
		}
		System.out.println(myList4); 
		
		SoftAssert sf = new SoftAssert();
		//sf.assertTrue(myList2.contains("Pharmacy"));
		sf.assertTrue(myList2.contains("Gift Cards"));
		
		sf.assertAll();*/
		driver.quit();
		
	
		
	}

}
