package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SendMessage(view : View){
        val textMessage = findViewById<EditText>(R.id.TextMassage)
    // val Message = findViewById<TextView>(R.id.Message)
       // Message.text=textMessage.text
        // Essas linhas mostram o valor de display message na propria activity.

        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{ putExtra( EXTRA_MESSAGE, message) }
        startActivity(intent)

    }
}