package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsActivity extends Fragment {
	
	public static final String TAG = SettingsActivity.class.getSimpleName();
	
	public static SettingsActivity newInstance() {
		return new SettingsActivity();
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_settings,
	        container, false);
	    return view;
	  }
}
