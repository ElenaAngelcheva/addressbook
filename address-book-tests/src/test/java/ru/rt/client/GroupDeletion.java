package ru.rt.client;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        navToGroupsPage();
        selectGroup();
        clickDeleteBtn();
    }
}