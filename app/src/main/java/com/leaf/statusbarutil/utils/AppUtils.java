package com.leaf.statusbarutil.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ArrayRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

import java.util.Locale;

/**
 * @author：created by Son
 * Desc:
 */
public class AppUtils {

    private AppUtils() {
    }

    private static Context mContext;
    private static Thread mUiThread;

    private static Handler sHandler = new Handler(Looper.getMainLooper());

    public static void init(Context context) { //Application
        mContext = context;
        mUiThread = Thread.currentThread();
    }

    public static Context getAppContext() {
        return mContext;
    }

    public static AssetManager getAssets() {
        return mContext.getAssets();
    }

    public static float getDimension(int id) {
        return getResource().getDimension(id);
    }

    public static Resources getResource() {
        return mContext.getResources();
    }

    public static Drawable getDrawable(int resId) {
        return ContextCompat.getDrawable(mContext, resId);
    }

    public static int getColor(int resId) {
        return ContextCompat.getColor(mContext, resId);
    }

    public static String getString(@StringRes int resId) {
        return mContext.getResources().getString(resId);
    }

    public static String[] getStringArray(@ArrayRes int resId) {
        return mContext.getResources().getStringArray(resId);
    }

    public static boolean isUIThread() {
        return Thread.currentThread() == mUiThread;
    }

    public static void runOnUI(Runnable r) {
        sHandler.post(r);
    }

    public static void runOnUIDelayed(Runnable r, long delayMills) {
        sHandler.postDelayed(r, delayMills);
    }


    /**
     *
     *
     * @return
     */
    public static String getSystemLanguage() {
        return Locale.getDefault().getLanguage();
    }

    /**
     *
     *
     * @return
     */
    public static String getSystemVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     *
     *
     * @return
     */
    public static String getSystemModel() {
        return android.os.Build.MODEL;
    }

    /**
     *
     *
     * @return
     */
    public static String getDeviceBrand() {
        return android.os.Build.BRAND;
    }

}