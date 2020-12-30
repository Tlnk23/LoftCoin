package com.tlnk.loftcoin;

import android.content.Context;

import com.tlnk.loftcoin.data.CoinsRepo;
import com.tlnk.loftcoin.data.CurrencyRepo;
import com.tlnk.loftcoin.util.ImageLoader;
import com.tlnk.loftcoin.data.WalletsRepo;
import com.tlnk.loftcoin.util.Notifier;
import com.tlnk.loftcoin.util.RxSchedulers;

public interface BaseComponent {
    Context context();

    CoinsRepo coinsRepo();

    CurrencyRepo currencyRepo();

    ImageLoader imageLoader();

    WalletsRepo walletsRepo();

    RxSchedulers schedulers();

    Notifier notifier();
}