package com.paulusworld.drawernavigationtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A dummy fragment representing a section of the app, but that simply displays
 * dummy text.
 */
public class AllInvoicesSectionFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	public AllInvoicesSectionFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_tabbed_all_invoices, container, false);
		ListView invoicesListView = (ListView) rootView.findViewById(R.id.invoices_list);
		final String[] MOBILE_OS = new String[] { "Android", "iOS", "WindowsMobile", "Blackberry" };

		invoicesListView.setAdapter(new MobileArrayAdapter(getActivity(), MOBILE_OS));
		return rootView;
	}

	public void onClickAddBtn(View view) {
		startActivity(new Intent(getActivity(), AddNewInvoices.class));
	}
}