package com.app;

import hello.Hello;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by hatajoe on 2018/02/15.
 */

public class HelloModule extends ReactContextBaseJavaModule {
    public HelloModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Core";
    }

    @ReactMethod
    public void Hello() {
        Hello.hello();
    }
}
