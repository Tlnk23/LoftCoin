package com.tlnk.loftcoin.ui.currency;

import androidx.lifecycle.ViewModelProvider;

import com.tlnk.loftcoin.BaseComponent;
import com.tlnk.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        CurrencyModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class CurrencyComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

}
