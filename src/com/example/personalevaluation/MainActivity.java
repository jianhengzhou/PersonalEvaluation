package com.example.personalevaluation;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView dateTv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initialLayout();
		
		initialControl();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void initialLayout(){
		dateTv = (TextView) findViewById(R.id.date_tv);
	}

	private void initialControl(){
		
		if(dateTv!=null){
			//获取当前时间
			Date date = new Date();
			dateTv.setText(date.toLocaleString().split(" ")[0]);
		}
		
	}
}
