package com.capgemini.casestudyselenium1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	@FindBy(how=How.NAME,using="fname")
	 WebElement fname;
	@FindBy(how=How.NAME,using="lname")
	 WebElement lname;
	@FindBy(how=How.NAME,using="mobile")
	 WebElement mobile;
	@FindBy(how=How.NAME,using="email")
	 WebElement email;
	@FindBy(how=How.NAME,using="city")
	 WebElement city;
	@FindBy(how=How.NAME,using="state")
	 WebElement state;
	@FindBy(how=How.NAME,using="address")
	 WebElement address;
	@FindBy(how=How.NAME,using="submit")
	 WebElement submit;

}
