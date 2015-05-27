package com.ee.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button gp,banglalink,robi,airtel,gprs,rd,sd,me;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gp= (Button) findViewById(R.id.gpButton);
		banglalink=(Button) findViewById(R.id.BanglalinkButton);
		airtel= (Button) findViewById(R.id.airtelbutton);
		robi= (Button) findViewById(R.id.robiButton);
		me=(Button) findViewById(R.id.aboutmebutton);
		
		/*
		 * rd denotes 512Kbps
		 * sd denotes 1Mbps
		 * 
		 * */
		gp.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,GpPackages.class);
				startActivity(i);
				
			
			}
		});
	
		
        banglalink.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,Banglalink.class);
				startActivity(i);
			}
		});
        
        airtel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,Airtel.class);
				startActivity(i);
				
			}
		});
        
       robi.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,Robi.class);
				startActivity(i);
				
			}
		});
	

       me.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			Intent intent=new Intent(MainActivity.this,Aboutme.class);
			startActivity(intent);
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
