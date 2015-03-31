package com.sas.lmrc;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	
	ImageView route , stationinfo;
	TextView r1, s1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		 route= (ImageView) findViewById(R.id.route1);
		 stationinfo=  (ImageView) findViewById(R.id.station);
		  
		 r1= (TextView) findViewById(R.id.route);
		 s1= (TextView) findViewById(R.id.stationinfo);
		 
		 r1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, RouteCalculator.class);
				
				startActivity(intent);
					
			}
		});
		
		

		
		}
	}

