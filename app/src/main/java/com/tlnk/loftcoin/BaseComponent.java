package com.tlnk.loftcoin;

import android.content.Context;

import com.tlnk.loftcoin.data.CoinsRepo;
import com.tlnk.loftcoin.data.CurrencyRepo;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
}