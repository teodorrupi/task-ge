package com.ge.components.pages;

import com.ge.components.PATH;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * @author trupi
 */

@DefaultUrl("http://www.goeuro.com/")
public class SearchPage extends PageObject {

    /**
     *  NOTE
     *  WebElement and WebElementFacade will provide
     *  the same functionalities on different implementations.
     *  We use here WebElementFacade over WebElement since the former extends the
     *  WebElement class and WebElement is from WebDriver and not controlled from Serenity
     */

    @FindBy(name = PATH.FROM_TEXT_FIELD_NAME_ATTR)
    private WebElementFacade fromTextField;

    @FindBy(name = PATH.TO_TEXT_FIELD_NAME_ATTR)
    private WebElementFacade toTextField;

    @FindBy(css = PATH.ROUND_TRIP_BTN_CSS)
    private WebElementFacade roundTripButton;

    @FindBy(css = PATH.ONEWAY_TRIP_BTN_CSS)
    private WebElementFacade onewayTripButton;

    @FindBy(css = PATH.SEARCH_BTN_CSS)
    private WebElementFacade searchButton;

    @FindBy(css = PATH.TO_SUGGESTION_CSS)
    private WebElementFacade toSuggestion;

    @FindBy(css = PATH.FROM_SUGGESTION_CSS)
    private WebElementFacade fromSuggestion;


    public void startSearch(){
        searchButton.click();
    }

    public void inputFromDestination(String destination){
        fromTextField.type(destination);
    }

    public void inputToDestination(String destination){
        toTextField.type(destination);
    }

    public void clickToSuggestion(){
        toSuggestion.click();
    }

    public void clickFromSuggestion(){
        fromSuggestion.click();
    }

    public void chooseOneWayTrip(){
        onewayTripButton.click();
    }

    public void chooseRoundTrip(){
        roundTripButton.click();
    }

}
