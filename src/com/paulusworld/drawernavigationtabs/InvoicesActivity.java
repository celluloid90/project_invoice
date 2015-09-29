package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InvoicesActivity extends Fragment {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	public static final String TAG = InvoicesActivity.class.getSimpleName();

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	public static InvoicesActivity newInstance() {
		return new InvoicesActivity();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_invoices, container, false);
		mSectionsPagerAdapter = new SectionsPagerAdapter(getActivity(), getChildFragmentManager());

		mViewPager = (ViewPager) v.findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		return v;
	}
}
