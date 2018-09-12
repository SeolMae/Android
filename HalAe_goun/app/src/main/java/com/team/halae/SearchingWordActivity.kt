package com.team.halae

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText

class SearchingWordActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var searchword : EditText
    lateinit var canclebtn : Button
    lateinit var deleterecordbtn : Button

    lateinit var searchedrecord: ArrayList<RecordItem>
    lateinit var recordAdapter: RecordAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halmate_searching_view)

        searchword = findViewById(R.id.searching_edittext)
        canclebtn = findViewById(R.id.searching_cancle_button)
        deleterecordbtn = findViewById(R.id.record_delete_button)

        searchedrecord = ArrayList()
        searchedrecord.add(RecordItem("최윤호"))
        searchedrecord.add(RecordItem("그림"))
        searchedrecord.add(RecordItem("양시연 할머니"))
        searchedrecord.add(RecordItem("신당동"))

        recordAdapter = RecordAdapter(searchedrecord)
        var recyclerView : RecyclerView = findViewById(R.id.halmate_searcch_record)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = recordAdapter

        canclebtn!!.setOnClickListener(this)
        deleterecordbtn!!.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(p0) {
            canclebtn-> {

            }deleterecordbtn -> {

            }

        }

    }




}