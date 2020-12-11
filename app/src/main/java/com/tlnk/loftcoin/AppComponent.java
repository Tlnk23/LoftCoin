package com.tlnk.loftcoin;

import android.app.Application;

import com.tlnk.loftcoin.data.DataModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                DataModule.class
        }
)
abstract class AppComponent implements BaseComponent {

    @Component.Builder
    static abstract class Builder {
        @BindsInstance
        abstract Builder application(Application app);

        abstract AppComponent build();
    }

}