package com.ee.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GpPackages extends Activity{
	Button gprs,rd,sd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gppackages);
		
		gprs= (Button) findViewById(R.id.button3);
		rd= (Button) findViewById(R.id.button1);
		sd= (Button) findViewById(R.id.button2);
		
		
			gprs.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(GpPackages.this,Gp.class);
			startActivity(i);
			
		}
	});
	
     rd.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(GpPackages.this,FiveKbps.class);
			startActivity(i);
		}
	});

   sd.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
//TODO Auto-generated method stub
Intent i=new Intent(GpPackages.this,OneMbps.class);
startActivity(i);
}
});

		
	}

}
