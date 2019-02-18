package ru.rt.client;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {


  @Test
  public void testGroupCreation() {
    navToGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupDate("groupName", "header test", " group footer"));
    submitGroupCreation();
  }
}