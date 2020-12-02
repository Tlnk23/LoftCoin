package com.tlnk.loftcoin.data;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
public abstract class Listings {

    abstract List<Coin> data();
}
