//
// Created by freeman on 2016/3/15.
//

#include <jni.h>
/*#include <string.h>
#include <android/log.h>
#define LOG_TAG "System.out"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)*/
/*
 * Class:     freeman_ndk_NDKUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
jstring Java_freeman_ndk_NDKUtils_getCLanguageString(JNIEnv *env, jclass jclass){
    return (*env)->NewStringUTF(env, "NDK真特么蛋疼");
}

/*
 * Class:     freeman_ndk_NDKUtils
 * Method:    getCLanguageInt
 * Signature: (I)I
 */
jint Java_freeman_ndk_NDKUtils_getCLanguageInt(JNIEnv *env, jobject obj, jint i){
    return i * i;
}


void Java_freeman_ndk_NDKUtils_callCCode(JNIEnv *env, jobject obj) {

    // 完整类名
    char* classname = "freeman/ndk/NDKUtils";

    // 在jni.h文件中找到 - jclass (*FindClass)(JNIEnv*, const char*);
    jclass cls = (*env)->FindClass(env, classname);


    //参数介绍 : 第二个参数是Class对象, 第三个参数是方法名,第四个参数是方法的签名, 获取到调用的method
    jmethodID methodID = (*env)->GetMethodID(env, cls, "cLanguageCallBack", "(Ljava/lang/String;)V");

    /*
     * 调用方法 void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...);
     * 参数介绍 : 后面的 ... 是可变参数, 如果该返回值void的方法有参数, 就将参数按照次序排列
     */
    (*env)->CallVoidMethod(env, obj, methodID, (*env)->NewStringUTF(env, "这是C回调Java的方法"));


    jmethodID methodID1 = (*env)->GetMethodID(env, cls, "javaMethod", "()V");

    (*env)->CallVoidMethod(env, obj, methodID1);

}