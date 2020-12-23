package com.tlnk.loftcoin.ui.wallets;

import androidx.lifecycle.ViewModelProvider;

import com.tlnk.loftcoin.BaseComponent;
import com.tlnk.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        WalletsModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class WalletsComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

    abstract WalletsAdapter walletsAdapter();

    abstract TransactionsAdapter transactionsAdapter();

}