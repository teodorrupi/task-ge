package com.ge.automation.definitions;

import com.ge.components.SessionValues;
import com.ge.components.TestInit;
import org.jbehave.core.annotations.Then;

/**
 * @author trupi
 */
public class SortingTestDefinitions extends TestInit {

    @Then("sorting by price for airplane is correct")
    public void thenPriceSortingForAirplaneIsCorrect() {
        user.testPriceSortingFor(SessionValues.AIRPLANE);
    }

    @Then("sorting by price for train is correct")
    public void thenPriceSortingForTrainIsCorrect() {
        user.testPriceSortingFor(SessionValues.TRAIN);
    }

    @Then("sorting by price for bus is correct")
    public void thenPriceSortingForBusIsCorrect() {
        user.testPriceSortingFor(SessionValues.BUS);
    }
}
