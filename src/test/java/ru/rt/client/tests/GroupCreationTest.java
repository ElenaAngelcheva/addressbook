package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {
    app.navToGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupDate("group1", "header test", " group footer"));
    app.submitGroupCreation();
  }
}