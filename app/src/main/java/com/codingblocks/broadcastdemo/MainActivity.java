package com.codingblocks.broadcastdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    SMSReceiver sr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("here", "here");
        Button b = (Button)findViewById(R.id.button);

        MyReceiver1 r1 = new MyReceiver1();
        IntentFilter filter = new IntentFilter("our-intent");
        filter.setPriority(10);
        registerReceiver(r1, filter);

        MyReceiver2 r2 = new MyReceiver2();
        IntentFilter filter2 = new IntentFilter("our-intent");
        filter2.setPriority(100);
        registerReceiver(r2, filter2);
        MyReceiver3 r3 = new MyReceiver3();
        IntentFilter filter3 = new IntentFilter("our-intent");
        filter3.setPriority(15);
        registerReceiver(r3, filter3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction("our-intent");
                sendOrderedBroadcast(i, "my.app.PERMISSION1");
            }
        });
       //SMSReceiver sr = new SMSReceiver();
       // IntentFilter i = new IntentFilter(Intent.);

    }


    @Override
    protected void onDestroy() {
        unregisterReceiver(sr);
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
