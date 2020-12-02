package com.tlnk.loftcoin.data;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

import java.util.List;

public interface CoinsRepo {

    @NonNull
    @WorkerThread
    List<? extends Coin> listings();

}
