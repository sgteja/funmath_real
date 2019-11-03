package com.example.funmath_real;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class matmain
	extends Activity
	implements OnClickListener
{
    
    
    private Button button0;
    private Button button1;
    private Button button2;
    
    

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matmain);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        
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
	    startActivity(new Intent(this, com.example.funmath_real.Quiz1Activity.class));
	}
	if ( arg0 == button1 ) {
	    startActivity(new Intent(this, com.example.funmath_real.quiz.class));
	}
	if ( arg0 == button2 ) {
	    startActivity(new Intent(this, com.example.funmath_real.score.class));
	}
	
    }

}
