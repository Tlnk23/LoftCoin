package com.tlnk.loftcoin.ui.rates;

import androidx.lifecycle.ViewModelProvider;

import com.tlnk.loftcoin.BaseComponent;
import com.tlnk.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        RatesModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class RatesComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

}
