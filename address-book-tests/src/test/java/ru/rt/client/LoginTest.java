package ru.rt.client;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {


  @Test
  public void testGroupCreation() {
    navToGroupsPage();
    initGroupCreation();
      fillGroupForm(new GroupDate("group1", "header test", " group footer"));
    submitGroupCreation();
  }
}