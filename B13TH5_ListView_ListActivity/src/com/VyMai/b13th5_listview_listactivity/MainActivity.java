package com.VyMai.b13th5_listview_listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	TextView selection;
	String arr[]={"Intel","SamSung","Nokia","Simen","AMD","KIC","ECD"};
	ArrayAdapter<String>adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Thiet lap Data Source 
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        //Gan Adapter vao ListView
        setListAdapter(adapter);
        selection=(TextView) findViewById(R.id.selection);
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
    	super.onListItemClick(l, v, position, id);
    	String txt="position="+position + "; value = " + arr[position];
    	selection.setText(txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
