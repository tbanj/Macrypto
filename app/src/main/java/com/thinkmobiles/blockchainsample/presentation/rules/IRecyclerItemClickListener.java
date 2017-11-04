package com.thinkmobiles.blockchainsample.presentation.rules;

/**
 * @author Alabi Temitope (Created on 4/7/2017).
 *         Company: aso-iyi
 *         Email: engr.temitope@aso-iyi.com
 */
public interface IRecyclerItemClickListener<T> {
    void selectItem(final T data, final int position);
}
