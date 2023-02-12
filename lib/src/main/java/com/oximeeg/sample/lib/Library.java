package com.oximeeg.sample.lib;

import com.oximeeg.sample.core.Core;

public class Library {
    public String echo() {
        return new Core().echo("Hello World");
    }
}
