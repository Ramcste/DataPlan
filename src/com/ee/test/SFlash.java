package com.ee.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SFlash extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	 setContentView(R.layout.sflashlayout);
	 
	 
	 Thread tr=new Thread(){
		 
			public void run() {
		
				try{
				    sleep(2000);	
			       } catch (InterruptedException e) {
				// TODO: handle exception
			               e.printStackTrace();
			               }
				           finally{
				                  Intent i=new Intent(SFlash.this,MainActivity.class);
			                      startActivity(i);
			}
			
			}
			
		
		
		};
		tr.start();
		

		}
		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			finish();
	 
	}

}
