package com.example.p2pwifidirect;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import java.lang.ref.WeakReference;

public class WiFiDirectBroadcastReceiver extends BroadcastReceiver {

    private WifiP2pManager mWifiP2pManager;

    private Channel mChannel;

    private WeakReference<Activity> mActivityWeakReference;

    public WiFiDirectBroadcastReceiver(Activity activity, WifiP2pManager manager, Channel channel) {
        super();
        this.mWifiP2pManager = manager;
        this.mChannel = channel;
        this.mActivityWeakReference = new WeakReference<>(activity);
    }

    @Override
    public void onReceive(final Context context, final Intent intent) {

    }


    private Activity getActivity() {
        return mActivityWeakReference.get();
    }
}
