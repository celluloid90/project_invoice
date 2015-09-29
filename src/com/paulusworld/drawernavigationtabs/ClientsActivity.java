package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ClientsActivity extends Fragment {
	
	public static final String TAG = ClientsActivity.class.getSimpleName();
	
	public static ClientsActivity newInstance() {
		return new ClientsActivity();
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_clients,
	        container, false);
	    return view;
	  }
}
