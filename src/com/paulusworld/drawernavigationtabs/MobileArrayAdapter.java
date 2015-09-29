package com.paulusworld.drawernavigationtabs;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public MobileArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_invoices, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.list_invoices, parent, false);
		TextView clientName = (TextView) rowView.findViewById(R.id.tv_client_name);
		TextView invoiceName = (TextView) rowView.findViewById(R.id.tv_invoice_name);
		TextView invoiceAmount = (TextView) rowView.findViewById(R.id.tv_amount);
		clientName.setText(values[position]);
		invoiceName.setText(values[position]);
		invoiceAmount.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		return rowView;
	}
}