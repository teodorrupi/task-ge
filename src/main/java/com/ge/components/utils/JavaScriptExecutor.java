package com.ge.components.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * @author trupi
 */
public class JavaScriptExecutor extends PageObject{

    /**
     *  NOTE
     *  Based on experience with a few projects, is always
     *  needed to find a second way in order to make a few operations
     *  which could be too complex to use web driver calls.
     *
     *  Here we do calls via javascript, limited to a small amount of
     *  actions, to facilitate work flow.
     */

    public void sendClickEventToAnchorTag(String selector) {
        evaluateJavascript("$( '" + selector + "' )[0].click ();");
    }

    public String getTextExclusivelyinHTMLTree(WebElement element) {
        return (String) evaluateJavascript("return arguments[0].text()", element);
    }

}
