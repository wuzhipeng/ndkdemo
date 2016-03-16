//
// Created by freeman on 2016/3/15.
//

#include <freeman_ndk_NDKUtils.h>

/*
 * Class:     freeman_ndk_NDKUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_freeman_ndk_NDKUtils_getCLanguageString
        (JNIEnv *env, jclass jclass){
    return (*env)->NewStringUTF(env, "NDK真特么蛋疼");
}

/*
 * Class:     freeman_ndk_NDKUtils
 * Method:    getCLanguageInt
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_freeman_ndk_NDKUtils_getCLanguageInt
        (JNIEnv *env, jobject obj, jint i){
    return i * i;
}