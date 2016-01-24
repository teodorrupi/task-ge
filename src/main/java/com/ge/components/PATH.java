package com.ge.components;

/**
 * @author trupi
 */
public interface PATH {

    /**
     * Search Page Definitions
     */

    String FROM_TEXT_FIELD_NAME_ATTR = "from_filter";

    String TO_TEXT_FIELD_NAME_ATTR = "to_filter";

    String ROUND_TRIP_BTN_CSS = "#trip_type_1 > .analytics-round-trip-btn";

    String ONEWAY_TRIP_BTN_CSS = "#trip_type_2 > .analytics-round-trip-btn";

    String SEARCH_BTN_CSS = "#search-form__submit-btn";

    String TO_SUGGESTION_CSS = "#ui-id-2.ui-autocomplete  > .ui-menu-item:nth-child(2)";

    String FROM_SUGGESTION_CSS = "#ui-id-1.ui-autocomplete  > .ui-menu-item:nth-child(2)";


    /**
     * Search Results Page Definition
     */

    String TRAIN_TAB_LOADING_ANIMATOR_CSS = "#tab_train > .animated";

    String AIRPLANE_TAB_LOADING_ANIMATOR_CSS = "#tab_flight > .animated";

    String BUST_TAB_LOADING_ANIMATOR_CSS = "#tab_bus > .animated";

    String SORTING_BY_PRICE_OPTION_CSS = "#sortby-price";

    String AIRPLANE_TAB = "#tab_flight";

    String BUS_TAB = "#tab_bus";

    String TRAIN_TAB = "#tab_train";

    String AIRPLANE_RESULT_LIST = "#results-flight > .custom > .result.has-arr > .result-content > .row > .three.columns > .result-grid";

    String BUS_RESULT_LIST = "#results-bus > .custom > .result > .result-content > .row > .three.columns > .result-grid";

    String TRAIN_RESULT_LIST = "#results-train > .custom > .result.has-arr > .result-content > .row > .three.columns > .result-grid";

}
