package com.capgemini.casestudyselenium1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectPage {


	@FindBy(how=How.NAME,using="pname")
	 WebElement pname;
	@FindBy(how=How.NAME,using="cname")
	 WebElement cname;
	@FindBy(how=How.NAME,using="tsize")
	 WebElement tsize;
	@FindBy(how=How.NAME,using="submit")
	 WebElement submit;
}
