package POMProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class FrontPage {
	@Test
	public void FirstPage() throws InterruptedException {
	WebDriver d = new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.manage().window().maximize();
	  d.get("https://www.bookswagon.com/");
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  PageFactory.initElements(d, ObjClass.class);
	  
	  ObjClass.alert.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  ObjClass.Books.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  ObjClass.ArtFilmAndPhotography.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  ObjClass.ArtForm.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  WebElement e = ObjClass.BestSeller;
	  Select s = new Select(e);
	  s.selectByIndex(1);
	  ObjClass.Decorative.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  ObjClass.BeautyOfEverydayBook.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  Actions a = new Actions(d);
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  a.scrollByAmount(0, 1100).perform();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  a.scrollByAmount(0, -1100).perform();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  ObjClass.RequestABook.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  ObjClass.BookswagonLOGO.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  ObjClass.SearchBar.sendKeys("Java"+Keys.ENTER);
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  ObjClass.JavaDummiesBook.click();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  ObjClass.BookswagonLOGO.click();
	  
	  Thread.sleep(3000);
	  d.quit();
}
}
