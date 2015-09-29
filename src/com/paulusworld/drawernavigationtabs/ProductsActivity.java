package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProductsActivity extends Fragment {
	
	public static final String TAG = ProductsActivity.class.getSimpleName();
	
	public static ProductsActivity newInstance() {
		return new ProductsActivity();
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_products,
	        container, false);
	    return view;
	  }
}
