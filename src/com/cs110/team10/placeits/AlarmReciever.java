package com.cs110.team10.placeits;

import java.util.Calendar;
import java.util.TimeZone;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.MenuItem;

public class AlarmReciever extends BroadcastReceiver {
    private static final String DEBUG_TAG = "AlarmReceiver";
    
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(DEBUG_TAG, "Recurring alarm; requesting download service.");
        // start the download
        
        //TODO: Change the below line?
        Intent downloader = new Intent(context, Database.class);
        
        //TODO: Change the below line        
        downloader.setData(Uri
                .parse("http://feeds.feedburner.com/MobileTuts?format=xml"));
        context.startService(downloader);
    }
    
}
