package com.sas.lmrc;

import java.util.ArrayList;

import android.R.string;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class RouteCalculator extends Activity {
	EditText e1 , e2;
	Button b1;
	ListView l1;
//	CustomAdapter adapter;
	RouteListAdapter adapter;
	public RouteCalculator CustomListView=null;
//	public ArrayList<RouteList> CustomListViewValuesArr= new ArrayList<RouteList>();
	public ArrayList<RouteStation> stnList;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.actiity_route);
		
//		CustomListView = this;
		setListData();
		Resources res =getResources();
		l1= (ListView) findViewById(R.id.listView1);
			  
//		adapter = new CustomAdapter( CustomListView, CustomListViewValuesArr,res );
		stnList = new ArrayList<RouteStation>();
		
		
		//dummy
		for(int i=0; i<10; i++) {
			RouteStation stn = new RouteStation();
			stn.setName("List Item " + i);
			stn.setLine("image " + i);
			System.out.print(i + " ");
			stnList.add(stn);
		}
		
		adapter = new RouteListAdapter(RouteCalculator.this, 	stnList);
		l1.setAdapter(adapter);
		
		e1 = (EditText) findViewById(R.id.from);
		e2 = (EditText) findViewById(R.id.to);
		b1 = (Button) findViewById(R.id.findroute);
			
			
		e1.getText().toString();
			
		e2.getText().toString();
			 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(RouteCalculator.this, "DISTANCE IS 5 km", Toast.LENGTH_LONG).show();
				
			}
		});
				
}

	private void setListData() {
		// TODO Auto-generated method stub
		
	}
}