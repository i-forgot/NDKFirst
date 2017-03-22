
#include<string.h>
#include<jni.h>

JNIEXPORT jstring JNICALL
Java_com_boyka_ndktest_MyNative_helloJNI(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "Hello from JNI !");
}

