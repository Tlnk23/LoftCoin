package com.tlnk.loftcoin.ui.converter;

import androidx.lifecycle.ViewModelProvider;

import com.tlnk.loftcoin.BaseComponent;
import com.tlnk.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ConverterModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class ConverterComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

}