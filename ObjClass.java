package POMProject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ObjClass {
	@FindBy(className="closeghana")
	public static WebElement alert;
	@FindBy(css="a.desktopdropdowninit")
	public static WebElement Books;
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[9]/ul/li[1]/a")
	public static WebElement ArtFilmAndPhotography;
	@FindBy(id = "7")
	public static WebElement ArtForm;
	@FindBy(id = "ddlSort")
	public static WebElement BestSeller;
	@FindBy(id ="27")
	public static WebElement Decorative;
	@FindBy(linkText ="The Beauty of Everyday Things")
	public static WebElement BeautyOfEverydayBook;
	@FindBy(xpath="//*[@id=\\\"bookdetail\\\"]/div[2]")
	public static WebElement RequestABook;
	@FindBy(id ="ctl00_imglogo")
	public static WebElement BookswagonLOGO;
	@FindBy(id="inputbar")
	public static WebElement SearchBar;
	@FindBy(linkText="Java for Dummies")
	public static WebElement JavaDummiesBook;
	//@FindBy(id ="ctl00_imglogo")
	//public static WebElement BookswagonLOGO;
 
}

