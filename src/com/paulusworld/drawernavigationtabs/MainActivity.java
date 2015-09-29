package com.paulusworld.drawernavigationtabs;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {

	private static final String TAG = MainActivity.class.getSimpleName();

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;

	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	private String[] mDrawerItmes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTitle = mDrawerTitle = getTitle();

		mDrawerItmes = getResources().getStringArray(R.array.drawer_titles);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, mDrawerItmes));
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(mTitle);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		// Set the default content area to item 0
		// when the app opens for the first time
		if (savedInstanceState == null) {
			navigateTo(0);
		}

	}

	/*
	 * If you do not have any menus, you still need this function in order to
	 * open or close the NavigationDrawer when the user clicking the ActionBar
	 * app icon.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	/*
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()
	 */

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	private class DrawerItemClickListener implements OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			Log.v(TAG, "ponies");
			navigateTo(position);
		}
	}

	private void navigateTo(int position) {
		Log.v(TAG, "List View Item: " + position);

		switch (position) {
		case 0:
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, InvoicesActivity.newInstance(), InvoicesActivity.TAG).commit();
			break;
		case 1:
			// getSupportFragmentManager()
			// .beginTransaction()
			// .replace(R.id.content_frame,
			// WebViewFragment.newInstance(),
			// WebViewFragment.TAG).commit();

			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, ProductsActivity.newInstance(), ProductsActivity.TAG).commit();
			break;
		case 2:
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, ClientsActivity.newInstance(), ClientsActivity.TAG).commit();
			break;
		case 3:
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, BackupActivity.newInstance(), BackupActivity.TAG).commit();
			break;
		case 4:
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, SupportActivity.newInstance(), SupportActivity.TAG).commit();
			break;
		case 5:
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.content_frame, SettingsActivity.newInstance(), SettingsActivity.TAG).commit();
			break;

		}
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

}
