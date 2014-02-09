package com.example.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	final long timeToWait=3000;
	
	/*//@SuppressLint("HandlerLeak")
	@SuppressLint("HandlerLeak")
	Handler handlerForSplash=new Handler(){
    	
    	public void handleMessage(Message msg)
    	{
    		Intent goToAllRecipe= new Intent(MainActivity.this,ChutiyCTIVITY.class);
    		startActivity(goToAllRecipe);
    	}
    	
    };*/
	@SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
       /* Runnable newRubbanleObj= new Runnable()
        {	@Override
			public void run() {
        	
        	
			synchronized (this) {
				try {
					wait(timeToWait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
        	
        	
				handlerForSplash.sendEmptyMessage(0);
			}
			
        };
        Thread threadforSplash=new Thread(newRubbanleObj);
        threadforSplash.start(); 
        */
        
        
        
        
        
        // Your code

        final MainActivity main = this;
        
        new Thread(new Runnable()
        {
        	public void run() 
        	{
        		try
        		{
        			//synchronized(this)
        			{
            			Thread.sleep(timeToWait);
            		}
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        		
        		finish();
        		
        		//handlerForSplash
        		Intent goToAllRecipe= new Intent(main, AllRecipesScreen.class);//AllRecipe.class);
        		//EditText editText = (EditText) findViewById(R.id.edit_message);
            	//String message = editText.getText().toString();
            	//intent.putExtra(EXTRA_MESSAGE, message);
        		startActivity(goToAllRecipe);
        		
        	}
        }).start();
        
        
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
    }
    
    


	
    
}
