
package org.stepdefinition;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//browser launch
 public static WebDriver driver;
 public static void browserLaunch(String browser) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	} else if(browser.equals("edge")){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	}
     //load Url
 public static void loadUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
 }
    //Locators Methods
 public static WebElement findElement(String locator,String value) {
	 	if(locator.equals("id")){
	 		WebElement element = driver.findElement(By.id(value));
	 		return element;
   		}else if(locator.equals("name")) {
   			WebElement element = driver.findElement(By.name(value));
		   return element;
	    }else if(locator.equals("classname")) {
		   WebElement element = driver.findElement(By.name(value));
		   return element;
	    }else if(locator.equals("tagname")) {
	    	WebElement element = driver.findElement(By.tagName(value));
	    	return element;
	    }else if(locator.equals("linkText")) {
	    	WebElement element = driver.findElement(By.linkText(value));
	    	return element;
	    }else if(locator.equals("partialLinkText")) {
	    	WebElement element = driver.findElement(By.partialLinkText(value));
	    	return element;
	    }else if(locator.equals("xpath")) {
	    	WebElement element = driver.findElement(By.xpath(value));
	    	return element;
	    }else if(locator.equals("css Selector")) {
	    	WebElement element = driver.findElement(By.cssSelector(value));
	    	return element;
	    }
	    else {
	    	return null;
	    }
 }
	 	
	 	//WebElement Methods
	 	public void sendvalue(WebElement element,String value) {
	 		element.sendKeys(value);
	 		}
	 	public static void clickvalue(WebElement element) {
	 		element.click();
	 	    }
	    public void getText(WebElement element) {
	    	element.getText();
	        }
	 	public void getAttribute(WebElement element,String value) {
	 		element.getAttribute(value);
	 	    }
	 	public void getTagname(WebElement element) {
	 		element.getTagName();
	 	    }
	 	public void getSize(WebElement element) {
	 		element.getSize();
	 	}
         
	 	
         //takeScreenShot
	 	public void takeScreenshot(File file) throws IOException { 
	 	TakesScreenshot screenshot = (TakesScreenshot) driver;
	 	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(screenshotAs, file);
	 	}
	 	
	 	//DropDown Methods
	 	public static void selectByIndex(WebElement element,int index) {
	 		Select select = new Select(element);
	 		select.selectByIndex(index);
	 		}
	 	public static void selectByvalue(WebElement element,String value) {
	 		Select select = new Select(element);
	 		select.selectByValue(value);
	 	    }
	 	public static void selectByText(WebElement element,String Text) {
	 		Select select = new Select(element);
	 		select.selectByVisibleText(Text);
	    	}

	 	//Scroll up/scroll down
		public static void scrollBy(int a,int b) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("windows.scrollBy("+a+","+b+")");
			executor.executeScript("windows.scrollBy('"+a+"','"+b+"')");
	    	}
		
	 	public static String excelValue(String locator,int row,int cell) throws IOException {
	 		File file = new File(locator);
	 		FileInputStream inputstream=new FileInputStream(file);
	 		Workbook wb =new XSSFWorkbook(inputstream);
	 	    Sheet sheet = wb.getSheet("sheet1");
	 	    Row row1 = sheet.getRow(row);
	 	    Cell cell1 = row1.getCell(cell);
	 	    String stringCellValue = cell1.getStringCellValue();
	 		return stringCellValue;
	 	}
	 	public void navigateUrl(String url) {
	 		driver.navigate().to(url);
	 	 }
	 	 public void navigation(String action) {
	 		if(action.equals("forward")) {
	 			driver.navigate().forward();
	 		}else if(action.equals("back")) {
	 			driver.navigate().back();
	 		}else if(action.equals("refresh")) {
	 			driver.navigate().refresh();
	 		}

	 	}
	 	// [Windows Handling]			
	 	public static WebDriver switchWindow() {			
	 		String parentWindow = driver.getWindowHandle();		
	 		Set<String> allWindows = driver.getWindowHandles();		
	 		for (String window : allWindows) {		
	 			if (!window.equals(parentWindow)) {	
	 				WebDriver newWindow = driver.switchTo().window(window);
	 				return newWindow;
	 			}	
	 		}		
	 		return null;		
	 	}			
	 	 	
}
