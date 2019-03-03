package ru.rt.client.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.rt.client.appManager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
