package com.ge.components.steps;

import com.ge.components.SessionValues;
import com.ge.components.StepInit;
import com.google.common.collect.Ordering;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.jetty.log.LogStream;


/**
 * @author trupi
 */
public class UserSteps extends StepInit {

    @Step
    public void openHomePage(){
        searchPage.open();
    }

    @Step
    public void inputFromDestination(String query){
        searchPage.inputFromDestination(query);
        searchPage.clickFromSuggestion();
    }

    @Step
    public void inputToDestination(String query){
        searchPage.inputToDestination(query);
        searchPage.clickToSuggestion();
    }

    @Step
    public void waitForSearchFinish(){
        searchResultsPage.waitForSearchFinish();
    }

    @Step
    public void setSortingBy(String by)
    {
        switch (by){
            case SessionValues.PRICE:
                searchResultsPage.setSortingByPrice();
                break;
            default:
                break;
        }
    }

    @Step
    public void testPriceSortingFor(String forObject){
        waitForSearchFinish();

        switch (forObject){
            case SessionValues.TRAIN:
                testCorrectSortingByPriceForTrain();
                break;
            case SessionValues.AIRPLANE:
                testCorrectSortingByPriceForAirplane();
                break;
            case SessionValues.BUS:
                testCorrectSortingByPriceForBus();
                break;
            default:
                break;
        }
    }

    @Step
    public void testCorrectSortingByPriceForBus(){
        Assert.assertTrue(Ordering.natural().isOrdered(searchResultsPage.grabAllBusTicketPrices()));
    }

    @Step
    public void testCorrectSortingByPriceForTrain(){
        Assert.assertTrue(Ordering.natural().isOrdered(searchResultsPage.grabAllTrainTicketPrices()));
    }

    @Step
    public void testCorrectSortingByPriceForAirplane(){
        Assert.assertTrue(Ordering.natural().isOrdered(searchResultsPage.grabAllAirplaneTicketPrices()));
    }

    @Step
    public void startSearch() {
        searchPage.startSearch();
    }
}
