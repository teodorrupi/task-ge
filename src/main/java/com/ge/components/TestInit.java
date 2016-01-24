package com.ge.components;

import com.ge.components.steps.UserSteps;
import net.thucydides.core.annotations.Steps;

/**
 * @author trupi
 *      Initial class, base class for all steps injections,
 *      Before and After (Story, Scenario).
 */
public class TestInit {

    @Steps
    protected UserSteps user;
}
