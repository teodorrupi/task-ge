package com.ge.utils;

import com.ge.utils.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;

/**
 * @author trupi
 *      Initial class, base class for all steps injections,
 *      Before and After (Story, Scenario).
 */
public class TestInit {

    @Steps
    protected EndUserSteps endUser;
}
