package com.example.projectkiemtracanhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.projectkiemtracanhan.Adapter.ListviewAdapter;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // ListView
        ListView listView = view.findViewById(R.id.list_view);
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.ic_launcher_background, "Bear", "Good", 3));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Fish", "Good", 4));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Fish", "Good", 4));
        itemList.add(new Item(R.drawable.ic_launcher_background, "Fish", "Good", 4));
        ListviewAdapter lva = new ListviewAdapter(this.getContext(), itemList);
        listView.setAdapter(lva);
        //End ListView

        return view;
    }
}