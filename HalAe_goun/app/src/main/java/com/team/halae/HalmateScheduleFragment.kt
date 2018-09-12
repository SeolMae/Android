package com.team.halae

import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.CalendarDay.from
import com.prolificinteractive.materialcalendarview.CalendarMode

class HalmateScheduleFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_halmate_schedule,container,false)

        val materialCalendarView : CalendarView = v.findViewById(R.id.calendarView)
        materialCalendarView?.setOnDateChangeListener{view, year, month, dayOfMonth ->
            startActivity(Intent(context, HalmateScheduleSelectActivity::class.java))
        }


        return v
    }
}