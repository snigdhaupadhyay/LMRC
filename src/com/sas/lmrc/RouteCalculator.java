package com.sas.lmrc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RouteCalculator extends Activity {
	EditText e1 , e2;
	Button b1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.route);
		
		e1= (EditText) findViewById(R.id.from);
		e2=(EditText) findViewById(R.id.to);
		b1= (Button) findViewById(R.id.findroute);
		 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		

}
}