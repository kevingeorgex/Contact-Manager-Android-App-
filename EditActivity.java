package com.example.contactmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Edit1Activity extends ActionBarActivity {

	public static int position;
	public static EditText firstname;
	public static EditText lastname;
	public static EditText phonenumber;
	public static EditText email;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit1);
		firstname   = (EditText)findViewById(R.id.fname);		
		lastname    = (EditText)findViewById(R.id.lname);		 
		phonenumber = (EditText)findViewById(R.id.pnumber);		
		email       = (EditText)findViewById(R.id.mailid);		
		Intent intent = getIntent();							
		position = intent.getIntExtra("position",0);			
		extra.display(this);									

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.edit1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	//*******************************************************************************
   //Calling the edit function of extra class
  //*******************************************************************************
	public void edit1(View view)
	{
		extra.edit1(this);			
	}
}


