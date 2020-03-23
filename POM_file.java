package POM_file;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class POM_file
{
	WebDriver driver;
	public POM_file(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@FindBy(how = How.ID, using = "userName")
	private WebElement username;
	@FindBy(how = How.ID, using = "usrPwd")
	private WebElement password;
	@FindBy(how = How.ID, using = "cnfUsrPwd")
	private WebElement confirmpassword;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ng-tns-c10-4')] //div[contains(@class,'ui-dropdown-trigger')] //span[contains(@class,'ui-dropdown-trigger-icon')]")
	private WebElement securityQues;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='secAns']")
	private WebElement securityAns;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ng-tns-c10-5')] //div[contains(@class,'ui-dropdown-trigger')] //span[contains(@class,'ui-dropdown-trigger-icon')]")
	private WebElement preferredLang;
	@FindBy(how = How.XPATH, using = "//input[@id='firstName']")
	private WebElement firstname;
	@FindBy(how = How.XPATH, using = "//input[@id='middleName']")
	private WebElement middlename;
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']")
	private WebElement lastname;
	@FindBy(how = How.ID, using = "M")
	private WebElement gender;
	@FindBy(how = How.XPATH, using = "//input[contains(@class,'ng-tns-c11-6')]")
	private WebElement DOB;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ng-tns-c10-7')] //div[contains(@class,'ui-dropdown-trigger')] //span[contains(@class,'ui-dropdown-trigger-icon')]")
	private WebElement occupation;
	@FindBy(how = How.XPATH, using = "//input[@value='U']")
	private WebElement maritalstatus;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname=\"resCountry\"]")
	private WebElement country;
	@FindBy(how = How.ID, using = "email")
	private WebElement email;
	@FindBy(how = How.ID, using = "mobile")
	private WebElement mobile;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname=\"nationality\"]")
	private WebElement nationality;
	@FindBy(how = How.XPATH, using = "//textarea[@id='resAddress1']")
	private WebElement flatno;
	@FindBy(how = How.XPATH, using = "//textarea[@id='resAddress2']")
	private WebElement street;
	@FindBy(how = How.XPATH, using = "//textarea[@id='resAddress3']")
	private WebElement locality;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='resPinCode']")
	private WebElement pincode;
	@FindBy(how = How.ID, using = "resState")
	private WebElement state;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='resCity']")
	private WebElement city;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='resPostOff']")
	private WebElement postoffice;
	@FindBy(how = How.ID, using = "resPhone")
	private WebElement phone;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='officeSameAsRes']")
	private WebElement copyaddress;
	@FindBy(how = How.XPATH, using = "//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[21]/div/input")
	private WebElement termscheckbox;
	
	

    public void enterUserName(String Username)
    {
        username.sendKeys(Username);
    }
     public void enterPassword(String Password)
     {
         password.sendKeys(Password);
     }
     public void enterConfirmPassword(String ConfirmPassword)
     {
    	 confirmpassword.sendKeys(ConfirmPassword);
     }
    public void selectQuestion() throws AWTException
    {
    	securityQues.click();
    	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void enterAnswer(String SecurityAnswer)
    {
    	securityAns.sendKeys(SecurityAnswer);
    }
    public void selectLang() throws AWTException
    {
    	preferredLang.click();
    	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
     public void enterFirstName(String FirstName)
     {
    	 firstname.sendKeys(FirstName);
     }
     public void enterMiddleName(String MiddleName)
     {
    	 middlename.sendKeys(MiddleName);
     }
     public void enterLastName(String LastName)
     {
    	 lastname.sendKeys(LastName);
     }
     public void selectGender()
     {
    	 gender.click();
     }
     public void selectDateOfBirth()
     {
    	 DOB.click();
    	 Select s = new Select(driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/div/div/div/select[1]")));
    	 s.selectByVisibleText("June");
    	 Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/div/div/div/select[2]")));
    	 s1.selectByVisibleText("1997");
    	 driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/div/table/tbody/tr[2]/td[7]/a")).click();
    	 
     }
     public void selectOccupation() throws AWTException
     {
     	occupation.click();
     	Robot robot = new Robot();
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
     	robot.keyPress(KeyEvent.VK_ENTER);
     	robot.keyRelease(KeyEvent.VK_ENTER);
     }
     public void selectmaritalStatus()
     {
    	 maritalstatus.click();
     }
     public void selectCountry()
     {
    	Select s = new Select(country);
    	s.selectByVisibleText("India");
     }
     public void enterEmail(String Email)
     {
    	 email.sendKeys(Email);
     }
     public void enterMobile(String Mobile)
     {
    	 mobile.sendKeys(Mobile);
     }
     public void selectNationality()
     {
    	Select s = new Select(nationality);
    	s.selectByVisibleText("India");
     }
     public void enterFlatNo(String FlatNo)
     {
    	 flatno.sendKeys(FlatNo);
     }
     public void enterStreet(String Street)
     {
    	 street.sendKeys(Street);
     }
     public void enterLocality(String Locality)
     {
    	 locality.sendKeys(Locality);
     }
     public void enterPincode(String Pincode)
     {
    	 pincode.sendKeys(Pincode);
     }
     public void enterState()
     {
    	 state.click();
     }
     public void selectCity()
     {
    	Select s = new Select(city);
    	s.selectByIndex(1);
     }
     public void selectPost()
     {
    	 Select s = new Select(postoffice);
    	 s.selectByIndex(1);
     }
     public void enterPhone(String Phone)
     {
    	 phone.sendKeys(Phone);
     }
     public void selectCopyAddress()
     {
    	 copyaddress.click();
     }
     public void selectTermscheckbox()
     {
    	 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	 executor.executeScript("arguments[0].click();", termscheckbox);
     }
}
