package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;


public class GroupEditTest extends  TestBase {


    @Test
    public void testGroupEdit() throws Exception {
        app.getNavigationHelper().navToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupEdit();
        app.getGroupHelper().fillGroupForm(new GroupDate("1", "2", " 3"));
        app.getGroupHelper().submitGroupEdit();
        app.getGroupHelper().returnGroupPage();

    }
}
