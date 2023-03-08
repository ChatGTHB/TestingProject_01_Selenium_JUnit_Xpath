package TestingProject_01;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingProject_01 extends BaseDriver {
    @Test
    public void test1(){

        driver.get("https://itera-qa.azurewebsites.net/");

        MyFunc.Bekle(2);
        WebElement signUp= driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signUp.click();

        MyFunc.Bekle(2);
        WebElement firstName= driver.findElement(By.xpath("//input[@data-val-required='Please enter first name']"));
        firstName.sendKeys("Kerem");

        MyFunc.Bekle(2);
        WebElement surname= driver.findElement(By.xpath("//input[@data-val-required='Please enter surname']"));
        surname.sendKeys("Yigit");

        MyFunc.Bekle(2);
        WebElement eMail= driver.findElement(By.xpath("//input[@id='E_post']"));
        eMail.sendKeys("kyigit@kmail.com");

        MyFunc.Bekle(2);
        WebElement phoneNumber= driver.findElement(By.xpath("//input[@id='Mobile']"));
        phoneNumber.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement userName= driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys("k.yigit");

        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement submit= driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();

        List<WebElement>confirmations=driver.findElements(By.xpath("//div[@class='col-md-offset-2 col-md-2']"));
        String confirmation = null;
        for(WebElement webElement:confirmations){
            if((webElement.getText().equals("Username already exist")||
                    (webElement.getText().equals("Registration Successful")))){
                confirmation= webElement.getText();
            }
        }
         Assert.assertTrue("Registration unsuccessful", confirmation.equals("Username already exist")
                 ||confirmation.equals("Registration Successful"));

    }
    @Test
    public void test2()
    {

        driver.get("https://itera-qa.azurewebsites.net/");

        MyFunc.Bekle(2);
        WebElement login= driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        MyFunc.Bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement loginButton= driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        MyFunc.Bekle(2);
        WebElement confirmation= driver.findElement(By.xpath("//h3[text()='Welcome k.yigit']"));
        String confirmationStr="Welcome k.yigit";

        Assert.assertTrue("Login unsuccessful",confirmation.getText().equals(confirmationStr));

        MyFunc.Bekle(2);
        WebElement logoutButton= driver.findElement(By.xpath("//a[text()='Log out']"));
        logoutButton.click();

    }
    @Test
    public void test3()
    {
        driver.get("https://itera-qa.azurewebsites.net/");

        MyFunc.Bekle(2);
        WebElement login= driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        MyFunc.Bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement loginButton= driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        MyFunc.Bekle(2);
        WebElement createButton= driver.findElement(By.xpath("//a[text()='Create New']"));
        createButton.click();

        MyFunc.Bekle(2);
        WebElement name= driver.findElement(By.xpath("//input[@id='Name']"));
        name.sendKeys("Said");

        MyFunc.Bekle(2);
        WebElement company= driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Company");

        MyFunc.Bekle(2);
        WebElement adress= driver.findElement(By.xpath("//input[@id='Address']"));
        adress.sendKeys("Norway");

        MyFunc.Bekle(2);
        WebElement city= driver.findElement(By.xpath("//input[@id='City']"));
        city.sendKeys("Oslo");

        MyFunc.Bekle(2);
        WebElement phone= driver.findElement(By.xpath("//input[@id='Phone']"));
        phone.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement eMail= driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("123456@kmail.com");

        MyFunc.Bekle(2);
        WebElement createButton2= driver.findElement(By.xpath("//input[@value='Create']"));
        createButton2.click();

        BekleKapat();

    }
}
