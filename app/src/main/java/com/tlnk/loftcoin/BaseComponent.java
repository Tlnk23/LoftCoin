package com.tlnk.loftcoin;

import android.content.Context;

import com.tlnk.loftcoin.data.CoinsRepo;
import com.tlnk.loftcoin.data.CurrencyRepo;
import com.tlnk.loftcoin.util.ImageLoader;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}