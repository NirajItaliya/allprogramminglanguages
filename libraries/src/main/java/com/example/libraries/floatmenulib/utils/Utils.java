package com.example.libraries.floatmenulib.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
/* hi iam niraj*/
import androidx.annotation.IdRes;

public class Utils {
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static int getImageSize(Context context, @IdRes int resId) {
        int size = 0;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            BitmapFactory.decodeResource(context.getResources(), resId, options);
            size = Math.max(options.outWidth, options.outHeight);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return size;
    }
}
