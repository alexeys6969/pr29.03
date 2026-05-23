package com.example.myapplication.presentations;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.domains.models.Day;

import java.util.Date;
import java.util.List;

public class BindingAdapters {
    @BindingAdapter("app:days")
    public static void setDays(RecyclerView rw, List<Day> days) {
        if(rw.getAdapter() instanceof DayAdapter) {
            DayAdapter adapter = (DayAdapter) rw.getAdapter();
            adapter.setDays(days);
        }
    }
}
