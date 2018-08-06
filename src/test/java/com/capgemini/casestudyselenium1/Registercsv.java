package com.capgemini.casestudyselenium1;

import static org.junit.Assert.assertEquals;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.opencsv.CSVReader;

public class Registercsv {

	public static void main(String[] args) throws IOException {
		

 WebDriver driver;
String csv="D:\\BDD\\testdata.csv";
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	
	CSVReader reader=new CSVReader(new java.io.FileReader(csv));
	String[] cell;
	while((cell=reader.readNext())!=null)
	{
		driver = new ChromeDriver();
		driver.get("D:/BDD/register.html");
		driver.findElement(By.name("fname")).sendKeys(cell[0]);
		driver.findElement(By.name("lname")).sendKeys(cell[1]);
		driver.findElement(By.name("email")).sendKeys(cell[2]);
		driver.findElement(By.name("mobile")).sendKeys(cell[3]);
		driver.findElement(By.name("address")).sendKeys(cell[4]);
		driver.findElement(By.name("city")).sendKeys(cell[5]);
		Select dropdown= new Select(driver.findElement(By.name("state")));
		dropdown.selectByVisibleText(cell[6]);
		driver.findElement(By.name("submit")).click();
		driver.get("D:/BDD/projectdetails.html");
		driver.findElement(By.name("pname")).sendKeys(cell[7]);
		driver.findElement(By.name("cname")).sendKeys(cell[8]);
		driver.findElement(By.name("tsize")).sendKeys(cell[9]);
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 assertEquals("Registered Successfully",alert.getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	reader.close();
}
	
}
