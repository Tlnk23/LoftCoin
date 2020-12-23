package com.tlnk.loftcoin.ui.wallets;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.tlnk.loftcoin.data.CurrencyRepo;
import com.tlnk.loftcoin.data.Wallet;
import com.tlnk.loftcoin.data.WalletsRepo;
import com.tlnk.loftcoin.util.RxSchedulers;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

class WalletsViewModel extends ViewModel {

    private final Observable<List<Wallet>> wallets;

    private final RxSchedulers schedulers;

    @Inject
    WalletsViewModel(WalletsRepo walletsRepo, CurrencyRepo currencyRepo, RxSchedulers schedulers) {
        wallets = currencyRepo.currency().switchMap(walletsRepo::wallets);
        this.schedulers = schedulers;
    }

    @NonNull
    Observable<List<Wallet>> wallets() {
        return wallets.observeOn(schedulers.main());
    }

}