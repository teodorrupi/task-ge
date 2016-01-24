package com.ge.automation.definitions;

import com.ge.components.TestInit;
import org.jbehave.core.annotations.When;

/**
 * @author trupi
 */
public class SearchTestDefinitions extends TestInit {

    @When("user inputs from destination as '$query'")
    public void whenUserInputsFromDestination(String query) {
        user.inputFromDestination(query);
    }

    @When("user inputs to destination as '$query'")
    public void whenUserInputsToDestination(String query) {
        user.inputToDestination(query);
    }

    @When("user performs search")
    public void whenUserClicksSearch() {
        user.startSearch();
    }

}
