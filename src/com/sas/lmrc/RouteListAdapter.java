package com.sas.lmrc;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RouteListAdapter extends ArrayAdapter<RouteStation> {

	List<RouteStation> stnList;	
	Context context;
	public RouteListAdapter(Context context, List<RouteStation> stations) {

		super(context, R.layout.route_rowactivity, stations);
		this.stnList = stations;
		this.context = context;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View rowView = convertView;
		Log.v("RLA",stnList.get(position).getName() );
		if(rowView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.route_rowactivity, null);
			
			ViewHolder holder = new ViewHolder();
			
			holder.routeName = (TextView) rowView.findViewById(R.id.tv_route_stn);
			holder.line = (ImageView) rowView.findViewById(R.id.iv_route_line);
			
			rowView.setTag(holder);
			
		}
		
		ViewHolder holder = (ViewHolder) rowView.getTag();
		
		holder.routeName.setText(stnList.get(position).getName());
		holder.line.setBackgroundResource(R.drawable.red);
		
		return rowView;
	}	
	
	static class ViewHolder {
		TextView routeName;
		ImageView line;
	}
}
