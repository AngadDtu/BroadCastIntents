package com.codingblocks.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver3 extends BroadcastReceiver {
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("receiver3", getResultData() + "");


        setResultData(getResultData() + " done with receiver 3");
        abortBroadcast();
    }
}
