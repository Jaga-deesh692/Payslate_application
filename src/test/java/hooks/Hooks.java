package hooks;

import BaseTest.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void launchApp() throws Exception {
        BaseClass.setUp();
    }

    @After
    public void closeApp() {
        BaseClass.tearDown();
    }
}