package ru.rt.client.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.navToGroupsPage();
        app.selectGroup();
        app.clickDeleteBtn();
    }
}