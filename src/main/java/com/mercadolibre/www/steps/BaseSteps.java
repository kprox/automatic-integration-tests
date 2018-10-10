package com.mercadolibre.www.steps;

import com.mercadolibre.www.pages.BasePage;
import com.mercadolibre.www.utils.Config;

/**
 * Created by kprox
 */
public class BaseSteps<T extends BasePage> {

    protected final T page;
    protected final Config config;

    /**
     * Public constructor
     *
     * @param page
     * @param config
     */
    public BaseSteps(T page, Config config) {
        this.page = page;
        this.config = config;
    }
}
