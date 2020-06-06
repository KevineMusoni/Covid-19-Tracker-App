package com.kevine.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Country> {
    private Context context;
    private List<Country> countryList;
    private List<Country> countryListFiltered;

    public CustomAdapter(Context context, List<Country> countryList) {
        super(context, R.layout.list_custom_item,countryList);

        this.context = context;
        this.countryList = countryList;
        this.countryListFiltered = countryList;
    }
}
