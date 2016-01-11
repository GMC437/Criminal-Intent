package com.wrightcontrol.criminalintent.app.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastAlert {

    public static void showLongToast(Context context, int messageID) {
        Toast toast = Toast.makeText(context, messageID, Toast.LENGTH_LONG);
        toast.show();
    }

    public static void showShortToast(Context context, String messageID) {
        Toast toast = Toast.makeText(context, messageID, Toast.LENGTH_SHORT);
        toast.show();
    }
}
