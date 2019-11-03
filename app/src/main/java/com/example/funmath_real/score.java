package com.example.funmath_real;

import android.app.Activity;

import android.os.Bundle;

import android.widget.TextView;


public class score
	extends Activity
{
    private funmath_real application;
    
    
    public TextView summary;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        application = (funmath_real) this.getApplication();
       
        
        summary = (TextView) findViewById(R.id.overall_summary);
        generateSummary();
    }

    @Override
    public void onResume()
    {
	super.onResume();
	generateSummary();
    }

    public void generateSummary()
    {
    	
    	int total,c;
    	float cp;
    	total=application.getQuestionsAttempted();
    	c=application.getQuestionsCorrect() ;
    	if(total!=0)
    	cp=(float)(c*100/total);
    	else
    		cp=0;
    	summary.setText(  "  Practice Session "+"\n"+ "  Attempted          :" + total+"\n"+ 
    			          "  Questions correct  :"+c +"\n"+ 
			              "  Percentage correct :" + cp );
    }

	

   

}
