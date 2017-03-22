package com.boyka.ndktest;

public class MyNative {
    static {
        System.loadLibrary("hello-jni");
    }
    public static native String helloJNI();
}
