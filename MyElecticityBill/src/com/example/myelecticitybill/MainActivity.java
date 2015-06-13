package com.example.myelecticitybill;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemSelectedListener{

	TextView customer_name,current_unit,previous_unit,water_bill,djb_bill,maintainence_bill;
	Button reset,submit;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		String name[]={"Dewendra Singh","Sekhar Roy","Rahul Kumar","Sumit kaushik","Pankaj Singh","Munna Singh","Ramdhani Singh","Mahendra"};
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		customer_name=(TextView)findViewById(R.id.name);
		current_unit=(TextView)findViewById(R.id.current_Unit_field);
		previous_unit=(TextView)findViewById(R.id.previous_unit_field);
		water_bill=(TextView)findViewById(R.id.water_bill_field);
		djb_bill=(TextView)findViewById(R.id.djb_bill_field);
		reset=(Button)findViewById(R.id.reset);
		submit=(Button)findViewById(R.id.submit);
		
		//Getting the instance of Spinner and applying OnItemSelectedListener on it
		Spinner spinner=(Spinner)findViewById(R.id.spinnerSelection);
		spinner.setOnItemSelectedListener(this);
		
		//Creating the ArrayAdapter instance having the country list 
		ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,name);  
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        
		spinner.setAdapter(aa);
		
		
		

		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
			long id) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
