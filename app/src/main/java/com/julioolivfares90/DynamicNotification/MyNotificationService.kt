package com.julioolivfares90.DynamicNotification

import android.annotation.SuppressLint
import android.content.Context
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class MyNotificationService : NotificationListenerService() {
    lateinit var context: Context

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
    }

    @SuppressLint("LongLogTag")
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        for (sbm in this@MyNotificationService.activeNotifications) {

            Log.d("CATEGORY",sbm.notification.category)
            val package_name = sbm.packageName
            Log.v("Notification title is:", sbm.notification.extras.getString("android.title") ?:"")
            Log.v("Notification text is:", sbm.notification.extras.getString("android.text") ?: "")
            Log.d("NotificationPackage Nameis:", package_name)
        }
    }
}