package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SupportActivity extends Fragment {
	
	public static final String TAG = SupportActivity.class.getSimpleName();
	
	public static SupportActivity newInstance() {
		return new SupportActivity();
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_support,
	        container, false);
	    return view;
	  }
}
