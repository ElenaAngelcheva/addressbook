package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.CompanyDate;
import ru.rt.client.model.Name;
import ru.rt.client.model.PhoneNumber;

public class ContactTest extends TestBase {


    @Test
    public void testContact() throws Exception {
        app.getContactHelper().nevContact();
        app.getContactHelper().fillContact(new Name("Ivan", "Ivanovich", "Ivanov", "Vano"), new CompanyDate("Ivanov-and-K", "Moscow"), new PhoneNumber("8(861)334-33-33", "8(927)333-33-33", "8(861)444-44-44", "8(861)444-44-45"), "vano@bk.ru");
        app.getContactHelper().submitContact();
    }
}
