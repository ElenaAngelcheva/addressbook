package ru.rt.client.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testUntitledTestCase() throws Exception {
        app.getContactHelper().navTOHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().popupWindowDeletion();


    }
}