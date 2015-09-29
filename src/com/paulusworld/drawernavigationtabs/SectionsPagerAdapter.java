package com.paulusworld.drawernavigationtabs;

import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to one
 * of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		this.mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
		Fragment fragment;
		switch (position) {
		case 0:
			fragment = new AllInvoicesSectionFragment();
			break;
		case 1:
			fragment = new OutstandingInvoicesSectionFragment();
			break;
		case 2:
			fragment = new PaidSectionFragment();
			break;

		default:
			fragment = new AllInvoicesSectionFragment();
			break;
		}
		Bundle args = new Bundle();
		args.putInt(AllInvoicesSectionFragment.ARG_SECTION_NUMBER, position + 1);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_tab_all).toUpperCase(l);
		case 1:
			return mContext.getString(R.string.title_tab_outstanding).toUpperCase(l);
		case 2:
			return mContext.getString(R.string.title_tab_paid).toUpperCase(l);
		}
		return null;
	}
}