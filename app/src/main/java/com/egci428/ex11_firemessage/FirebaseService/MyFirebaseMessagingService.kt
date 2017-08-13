package com.egci428.ex11_firemessage.FirebaseService

import android.content.Intent
import android.graphics.Bitmap
import android.support.v4.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.egci428.ex11_firemessage.Config.Config

/**
 * Created by lalita on 8/13/2017 AD.
 */
class MyFirebaseMessagingService: FirebaseMessagingService(){
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        handleNotification(remoteMessage!!.notification.body)
    }
    private fun handleNotification(body: String?){
        val pushNotification = Intent(Config.STR_PUSH)
        pushNotification.putExtra("message", body)
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification)
    }
}