package com.ge.components.pages;

import com.ge.components.PATH;
import com.ge.components.SessionValues;
import com.ge.components.utils.JavaScriptExecutor;
import com.google.common.base.CharMatcher;
import com.jayway.awaitility.core.ConditionTimeoutException;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author trupi
 */
public class SearchResultsPage extends PageObject {

    @FindBy(css = PATH.TRAIN_TAB_LOADING_ANIMATOR_CSS)
    private WebElementFacade trainTabLoadingAnimator;

    @FindBy(css = PATH.AIRPLANE_TAB_LOADING_ANIMATOR_CSS)
    private WebElementFacade airplaneTabLoadingAnimator;

    @FindBy(css = PATH.BUST_TAB_LOADING_ANIMATOR_CSS)
    private WebElementFacade busTabLoadingAnimator;


    @FindBy(css = PATH.SORTING_BY_PRICE_OPTION_CSS)
    private WebElementFacade sortByPriceOption;

    @FindBy(css = PATH.TRAIN_TAB)
    private WebElementFacade trainTab;

    @FindBy(css = PATH.AIRPLANE_TAB)
    private WebElementFacade airplaneTab;

    @FindBy(css = PATH.BUS_TAB)
    private WebElementFacade busTab;

    JavaScriptExecutor javaScriptExecutor = new JavaScriptExecutor();


    public void waitForSearchFinish(){
        WebDriverWait wait = new WebDriverWait(getDriver(), SessionValues.TIME_OUT_IN_SECONDS);
        if(Objects.equals(trainTabLoadingAnimator.getAttribute("display"), "block")){
            wait.until(ExpectedConditions.invisibilityOfElementLocated(org.openqa.selenium.By.cssSelector("#tab_train > .animated")));
        }

        if(Objects.equals(airplaneTabLoadingAnimator.getAttribute("display"), "block")){
            wait.until(ExpectedConditions.invisibilityOfElementLocated(org.openqa.selenium.By.cssSelector("#tab_flight > .animated")));
        }

        if(Objects.equals(busTabLoadingAnimator.getAttribute("display"), "block")){
            wait.until(ExpectedConditions.invisibilityOfElementLocated(org.openqa.selenium.By.cssSelector("#tab_bus > .animated")));
        }

    }

    public void setSortingByPrice(){
        sortByPriceOption.click();
    }

    public void setTrainTab(){
        trainTab.click();
    }

    public void setAirplaneTab(){
        airplaneTab.click();
    }

    public void setBusTab(){
        busTab.click();
    }

    public List<Float> grabAllBusTicketPrices(){
        setBusTab();
        List<Float> priceList = new ArrayList<>();
        List<WebElement> results = getDriver().findElements(org.openqa.selenium.By.cssSelector(PATH.BUS_RESULT_LIST));
        for(WebElement result : results){
            priceList.add(Float.parseFloat(CharMatcher.is(',').or(CharMatcher.is('.')).or(CharMatcher.DIGIT).retainFrom(result.getText())));
        }
        return priceList;
    }

    public List<Float> grabAllAirplaneTicketPrices(){
        setAirplaneTab();
        List<Float> priceList = new ArrayList<>();
        List<WebElement> results = getDriver().findElements(org.openqa.selenium.By.cssSelector(PATH.AIRPLANE_RESULT_LIST));
        for(WebElement result : results){
            priceList.add(Float.parseFloat(CharMatcher.is(',').or(CharMatcher.is('.')).or(CharMatcher.DIGIT).retainFrom(result.getText())));
        }
        return priceList;
    }

    public List<Float> grabAllTrainTicketPrices(){
        setTrainTab();
        List<Float> priceList = new ArrayList<>();
        List<WebElement> results = getDriver().findElements(org.openqa.selenium.By.cssSelector(PATH.TRAIN_RESULT_LIST));
        for(WebElement result : results){
            priceList.add(Float.parseFloat(CharMatcher.is(',').or(CharMatcher.is('.')).or(CharMatcher.DIGIT).retainFrom(result.getText())));
        }
        return priceList;
    }
}
