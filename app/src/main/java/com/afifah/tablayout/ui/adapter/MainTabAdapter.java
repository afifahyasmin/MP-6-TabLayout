package com.afifah.tablayout.ui.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.afifah.tablayout.ui.main.AlertFragment;
import com.afifah.tablayout.ui.main.ListFragment;
import com.afifah.tablayout.ui.main.LoginFragment;

public class MainTabAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MainTabAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AlertFragment alertFragment  = new AlertFragment();
                return alertFragment;
            case 1:
                ListFragment listFragment = new ListFragment();
                return listFragment;
            case 2:
                LoginFragment loginFragment = new LoginFragment();
                return loginFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}

