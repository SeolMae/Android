package com.team.halae

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.text.SimpleDateFormat
import java.util.*


class HalmateMessageActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halmate_message)

        val c : Calendar = Calendar.getInstance()
        val df : SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val currentTime : String = df.format(c.time)

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("chats").child(currentTime)

        val chat : Hashtable<String, String> = Hashtable()
        chat.put("name","최고운")

        myRef.setValue(chat)

    }
}