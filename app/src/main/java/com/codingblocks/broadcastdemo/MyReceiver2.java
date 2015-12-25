package com.codingblocks.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("receiver2", getResultData() + "");
        setResultData(getResultData() + " done with receiver 2");
    }
}
