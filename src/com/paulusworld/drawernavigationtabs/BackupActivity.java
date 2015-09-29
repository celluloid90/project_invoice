package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BackupActivity extends Fragment {
	
	public static final String TAG = BackupActivity.class.getSimpleName();
	
	public static BackupActivity newInstance() {
		return new BackupActivity();
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_backup,
	        container, false);
	    return view;
	  }
}
