package com.example.mediaawesomeapp.util.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.NavDeepLinkBuilder

/**
 * Created at 2020-02-05 by Sang
 */
class BasicNotificationManager(private val context: Context) {

    fun showNotification(
        smallIcon: Int, title: String, content: String, pendingIntent: PendingIntent? = null
    ) {
        val notification = createNotification(smallIcon, title, content, pendingIntent)
        NotificationManagerCompat.from(context).notify(BASIC_NOTIFICATION_ID, notification)
    }

    private fun createNotification(
        smallIcon: Int, title: String, content: String, contentIntent: PendingIntent?
    ): Notification {
        val builder = NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_NAME)
            .setSmallIcon(smallIcon)
            .setContentTitle(title)
            .setContentText(content)
        contentIntent?.let { builder.setContentIntent(it) }
        return builder.build()
    }

    /**
     * Create PendingIntent using deep link of Navigation component.
     */
    fun createPendingIntent(
        args: Bundle?, graphId: Int, desId: Int, clazz: Class<out AppCompatActivity>
    ): PendingIntent {
        val navDeepLinkBuilder = NavDeepLinkBuilder(context)
            .setComponentName(clazz)
            .setGraph(graphId)
            .setDestination(desId)
        args?.let { navDeepLinkBuilder.setArguments(args) }
        return navDeepLinkBuilder.createPendingIntent()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createNotificationChannel(important: Int = NotificationManager.IMPORTANCE_DEFAULT) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val channel = NotificationChannel(
            NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, important
        ).apply { description = NOTIFICATION_CHANNEL_DESCRIPTION }
        val notificationManager =
            context.applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }

    companion object {

        const val NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID"
        const val NOTIFICATION_CHANNEL_NAME = "NOTIFICATION_CHANNEL_NAME"
        const val NOTIFICATION_CHANNEL_DESCRIPTION = "Song notification"
        const val BASIC_NOTIFICATION_ID = 111
    }
}
