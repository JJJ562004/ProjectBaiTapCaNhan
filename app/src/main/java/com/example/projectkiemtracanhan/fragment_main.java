package com.example.projectkiemtracanhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class fragment_main extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_navigation);

        loadFragment(new home());

        bottomNavigationView.setOnNavigationItemSelectedListener(
                item -> {
                    Fragment selectedFragment = null;

                    if(item.getItemId() == R.id.nav_home){
                        selectedFragment = new home();
                    }
                    if(item.getItemId() == R.id.nav_profile){
                        selectedFragment = new profile();
                    }

                    if (selectedFragment != null) {
                        loadFragment(selectedFragment);
                    }
                    return true;
                }
        );

        return view;
    }

    private void loadFragment(Fragment fragment) {
        FragmentActivity fa = new FragmentActivity();
        fa.getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}