package com.hodamohammadi.chatapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Main activity for chat screens.
 */
class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_activity)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.chat_container, SingleChatFragment.newInstance())
                    .commit()
        }
    }
}