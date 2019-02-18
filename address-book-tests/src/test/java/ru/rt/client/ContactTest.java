package ru.rt.client;

import org.testng.annotations.Test;

public class ContactTest extends TestBase {


  @Test
  public void testContact() throws Exception {
      nevContact();
      fillContact(new Name("Ivan", "Ivanovich", "Ivanov", "Vano"), new CompanyDate("Ivanov-K", "Moscow"), new PhoneNumber("8(861)334-33-33", "8(927)333-33-33", "8(861)444-44-44", "8(861)444-44-45"), "vano@bk.ru");
      submitContact();
  }
}
