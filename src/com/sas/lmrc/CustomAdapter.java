package com.sas.lmrc;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter implements OnClickListener {
	   private Activity activity;
//       private ArrayList data;
       private static LayoutInflater inflater;
       public Resources res;
      RouteList tempValues=null;
       int i=0;

	public CustomAdapter(RouteCalculator customListView,
			ArrayList<RouteList> customListViewValuesArr, Resources res2) {
		// TODO Auto-generated constructor stub
		 inflater = ( LayoutInflater )activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub\	
	}
}
