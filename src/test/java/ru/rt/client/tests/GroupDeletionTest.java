package ru.rt.client.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().navToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickDeleteBtn();
    }
}