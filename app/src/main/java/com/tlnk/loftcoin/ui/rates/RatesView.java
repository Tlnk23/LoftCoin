package com.tlnk.loftcoin.ui.rates;

import androidx.annotation.NonNull;

import com.tlnk.loftcoin.data.Coin;

import java.util.List;

public interface RatesView {

    void showCoins(@NonNull List<? extends Coin>);

    void showError(@NonNull String error);

}
