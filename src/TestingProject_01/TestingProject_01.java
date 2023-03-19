package TestingProject_01;

import utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestingProject_01 extends BaseDriver {

    @Test
    public void test01() {

        driver.get("https://itera-qa.azurewebsites.net/");

        String emailRandom="testing"+(int)(Math.random()*10000)+"@testing.com";
        String usernameRandom="tester"+(int)(Math.random()*10000);

        WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signUp.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@data-val-required='Please enter first name']"));
        firstName.sendKeys("Kerem");

        WebElement surname = driver.findElement(By.xpath("//input[@data-val-required='Please enter surname']"));
        surname.sendKeys("Yigit");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='E_post']"));
        eMail.sendKeys(emailRandom);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='Mobile']"));
        phoneNumber.sendKeys("123456");

        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys(usernameRandom);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");

        WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();

        WebElement confirmationMessage = driver.findElement(By.xpath("//label[text()='Registration Successful']"));

        Assert.assertEquals(confirmationMessage.getText(), "Registration Successful");
    }

    @Test
    public void test02() {

        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        WebElement confirmation = driver.findElement(By.xpath("//h3[text()='Welcome k.yigit']"));

        Assert.assertEquals("Login unsuccessful", confirmation.getText(), "Welcome k.yigit");

        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
        logoutButton.click();
    }

    @Test
    public void test03() {

        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        WebElement createButton = driver.findElement(By.xpath("//a[text()='Create New']"));
        createButton.click();

        WebElement name = driver.findElement(By.xpath("//input[@id='Name']"));
        name.sendKeys("Said");

        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Company");

        WebElement adress = driver.findElement(By.xpath("//input[@id='Address']"));
        adress.sendKeys("Norway");

        WebElement city = driver.findElement(By.xpath("//input[@id='City']"));
        city.sendKeys("Oslo");

        WebElement phone = driver.findElement(By.xpath("//input[@id='Phone']"));
        phone.sendKeys("123456");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("123456@kmail.com");

        WebElement createButton2 = driver.findElement(By.xpath("//input[@value='Create']"));
        createButton2.click();

        waitAndClose();
    }
}
