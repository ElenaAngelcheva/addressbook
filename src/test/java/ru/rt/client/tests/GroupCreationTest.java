package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().navToGroupsPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupDate("group1", "header test", " group footer"));
    app.getGroupHelper().submitGroupCreation();
  }
}