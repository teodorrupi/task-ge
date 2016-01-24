package com.ge.automation.definitions;

import com.ge.components.TestInit;
import org.jbehave.core.annotations.Given;

/**
 * @author trupi
 */
public class NavigationTestDefinitions extends TestInit {

    @Given("user opens home page")
    public void givenUserOpensHomePage() {
        user.openHomePage();
    }
}
