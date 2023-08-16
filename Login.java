package week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//Load the URL
	driver.get("http://leaftaps.com/opentaps/control/logout");
	
	//Maximize the URL
	driver.manage().window().maximize();
	
	//FindElement enter the username
	
   driver.findElement(By.id("username")).sendKeys("demosalesmanager");
   
	//FindElement Enter the password
   
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   
   //FindElement Click Login
   
  driver.findElement(By.className("decorativeSubmit")).click();
  
  //Get Title Of the page
  String title = driver.getTitle();
  System.out.println("title");
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Create Lead")).click();
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prashanth");
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prashanth.s125@gmail.com");
  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8072389679");
 driver.findElement(By.className("smallSubmit")).click();
  String text = driver.findElement(By.id("createLeadForm_companyName")).getText();
  System.out.println("text");
}
}

