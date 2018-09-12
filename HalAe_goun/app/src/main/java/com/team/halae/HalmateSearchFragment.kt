package com.team.halae

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import android.widget.TextView




class HalmateSearchFragment() : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var searchResult: ArrayList<SearchItem>
    lateinit var searchAdapter: SearchAdapter

    var locationSpinner : Spinner? = null
    var genderSpinner : Spinner? = null
    var interestSpinner : Spinner? = null

    lateinit var location : String
    lateinit var gender : String
    lateinit var interest : String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_halmate_search,container,false)

        searchResult = ArrayList()
        searchResult.add(SearchItem(R.drawable.sample, "최서정 할머니", 78,"서울시 성북구 길음동", "#사진#독서"))
        searchResult.add(SearchItem(R.drawable.sample, "최고운 할머니", 78,"서울시 성북구 길음동", "#춤추기#노래부르기"))
        searchResult.add(SearchItem(R.drawable.sample, "양시연 할머니", 78,"서울시 성북구 길음동", "#사진#독서"))
        searchResult.add(SearchItem(R.drawable.sample, "신예지 할머니", 78,"서울시 성북구 길음동", "#사진#독서"))
        searchResult.add(SearchItem(R.drawable.sample, "최윤호 할아버지", 78,"서울시 성북구 길음동", "#사진#독서"))

        searchAdapter = SearchAdapter(searchResult)
        var recyclerView : RecyclerView = v.findViewById(R.id.halmate_search_list)
        recyclerView!!.layoutManager = GridLayoutManager(this.context, 2)
        recyclerView!!.adapter = searchAdapter

        //-----------------스피너----------------
        locationSpinner = v.findViewById(R.id.search_spinner_location)
        genderSpinner = v.findViewById(R.id.search_spinner_gender)
        interestSpinner = v.findViewById(R.id.search_spinner_interest)


        var locationAdapter = ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, resources.getStringArray(R.array.위치))
        locationSpinner!!.adapter = locationAdapter
        locationSpinner!!.setSelection(0)

        var genderAdapter = ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, resources.getStringArray(R.array.성별))
        genderSpinner!!.adapter = genderAdapter
        genderSpinner!!.setSelection(0)

        var interestAdapter = ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, resources.getStringArray(R.array.관심분야))
        interestSpinner!!.adapter = interestAdapter
        interestSpinner!!.setSelection(0)

        locationSpinner!!.setOnItemSelectedListener(this)
        genderSpinner!!.setOnItemSelectedListener(this)
        interestSpinner!!.setOnItemSelectedListener(this)


       return v

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        when(p0){
            locationSpinner -> {
                Log.v("sylee", "location spinner test")
                Toast.makeText(context, "location",Toast.LENGTH_LONG).show()
                location = locationSpinner!!.selectedItem.toString()

//                if (locationSpinner!!.getChildCount() > 0) {
//                    Log.v("sylee", p2.toString())
//                    Log.v("sylee",locationSpinner!!.selectedItem.toString())
//                }
            }
            genderSpinner -> {
                Log.v("sylee", "gender spinner test")
                Toast.makeText(context, "gender" + p2, Toast.LENGTH_LONG).show()
                gender = genderSpinner!!.selectedItem.toString()
            }
            interestSpinner ->{
                Log.v("sylee", "interest spinner test")
                Toast.makeText(context, "interest" + p2, Toast.LENGTH_LONG).show()
                interest = interestSpinner!!.selectedItem.toString()
            }
        }
    }


}