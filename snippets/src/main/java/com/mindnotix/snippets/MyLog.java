package com.mindnotix.snippets;

import android.util.Log;

/**
 * Created by Intel on 13-11-2017.
 */

public class MyLog {


    private static final String TAG = MyLog.class.getSimpleName();

    public void showLog(String msg){
        Log.d(TAG, "showLog: "+ msg);
    }

}
