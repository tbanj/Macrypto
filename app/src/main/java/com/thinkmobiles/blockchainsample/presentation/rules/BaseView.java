package com.thinkmobiles.blockchainsample.presentation.rules;

/**
 * @author Alabi Temitope (Created on 4/6/2017).
 *         Company: aso-iyi
 *         Email: engr.temitope@aso-iyi.com
 */
public interface BaseView<P extends BasePresenter> {
    void setPresenter(final P presenter);
}
