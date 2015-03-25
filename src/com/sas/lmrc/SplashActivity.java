package com.sas.lmrc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_splash);
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					//
				} finally {
					Intent intent = new Intent("com.sas.lmrc.MAIN");
					startActivity(intent);
					finish();
				}				
			}
		};
		
		thread.start();
	}
	
	

}

