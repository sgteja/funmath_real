package com.example.funmath_real;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Quiz1Activity
	extends Activity
	implements OnClickListener
{
    private funmath_real application;
    
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    public TextView summary;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        application = (funmath_real) this.getApplication();
       button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
       
        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        
        
    }

    @Override
    public void onResume()
    {
	super.onResume();
    }

   

    @Override
    public void onClick(View arg0)
    {
	
	if ( arg0 == button0 ) {
	    startActivity(new Intent(this, com.example.funmath_real.NumericQuestion.class));
	}
	if ( arg0 == button1 ) {
	    startActivity(new Intent(this, com.example.funmath_real.NumericQuestion1.class));
	}
	if ( arg0 == button2 ) {
	    startActivity(new Intent(this, com.example.funmath_real.NumericQuestion2.class));
	}
	if ( arg0 == button3 ) {
	    startActivity(new Intent(this, com.example.funmath_real.NumericQuestion3.class));
	}
	if ( arg0 == button4 ) {
	    startActivity(new Intent(this, com.example.funmath_real.NumericQuestion4.class));
	}
	
    }

}
