package com.hodamohammadi.conveyor.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hodamohammadi.conveyor.R
import com.hodamohammadi.conveyor.fragments.ChatsListFragment
import com.hodamohammadi.conveyor.utils.FirebaseHelper

/**
 * Main activity for chat screens.
 */
class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_activity)

        if (FirebaseHelper.isUserAuthenticated()) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.chat_container, ChatsListFragment())
                    .commit()
        }
    }
}