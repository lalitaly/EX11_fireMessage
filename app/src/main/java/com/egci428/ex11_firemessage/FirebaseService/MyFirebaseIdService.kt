package com.egci428.ex11_firemessage.FirebaseService

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Created by lalita on 8/13/2017 AD.
 */
class MyFirebaseIdService :FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val refreshedToken = FirebaseInstanceId.getInstance().token
        sendRegistrationToServer(refreshedToken!!)
    }

    private fun sendRegistrationToServer(refreshedToken: String){
        Log.d("DEBUG", refreshedToken)
    }
}