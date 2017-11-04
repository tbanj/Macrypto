package com.thinkmobiles.blockchainsample.presentation.fragments.create_wallet;

/**
 * @author Alabi Temitope (Created on 4/6/2017).
 *         Company: aso-iyi
 *         Email: engr.temitope@aso-iyi.com
 */
abstract class RegisterWalletError {

    enum Email {
        NONE, EMPTY, NOT_VALID
    }

    enum Password {
        NONE, EMPTY, NOT_VALID
    }

    enum PasswordConfirm {
        NONE, EMPTY, NOT_EQUAL
    }
}
