package ru.rt.client.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.rt.client.model.CompanyDate;
import ru.rt.client.model.Name;
import ru.rt.client.model.PhoneNumber;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {

        super(driver);
    }

    public void submitContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContact(Name name, CompanyDate companyDate, PhoneNumber phoneNumber, String email) {
        type(By.name("firstname"), name.getFirst());
        type((By.name("middlename")), name.getMiddle());
        type((By.name("lastname")), name.getLast());
        type((By.name("nickname")), name.getNick());
        type(By.name("company"), companyDate.getCompany());
        type(By.name("address"), companyDate.getAddress());
        type(By.name("home"), phoneNumber.getHome());
        type(By.name("mobile"), phoneNumber.getMobile());
        type(By.name("work"), phoneNumber.getWork());
        type(By.name("fax"), phoneNumber.getFax());
        type(By.name("email"), email);
    }

    public void nevContact() {
        click(By.linkText("add new"));
    }

    public void navTOHomePage() {
        click(By.linkText("home"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]"));
    }

    public void popupWindowDeletion() {
        driver.switchTo().alert().accept();
    }
}

