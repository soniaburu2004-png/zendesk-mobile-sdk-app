
package com.atcltd.zendeskapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import zendesk.messaging.android.MessagingActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MessagingActivity.builder()
            .withChannelKey("YOUR_CHANNEL_KEY_HERE")
            .show(this)
        finish()
    }
}
