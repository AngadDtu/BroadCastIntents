package com.codingblocks.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("receiver1", getResultData() + "");
        setResultData(getResultData() + " done with receiver 1");
    }
}
