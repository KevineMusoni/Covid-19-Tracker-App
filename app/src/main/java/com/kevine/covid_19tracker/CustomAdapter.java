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

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Country> {

    private Context context;
    private List<Country> countryList;
    private List<Country> countryFiltered;

    public CustomAdapter(@NonNull Context context, List<Country> countryList) {
        super(context, resource);
    }
}
