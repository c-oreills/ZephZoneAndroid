package uk.co.oreills.zephzone;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("AlarmReceiver", "Unsetting DND due to timeout");

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_ALL);
    }
}
