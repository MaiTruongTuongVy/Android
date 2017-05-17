package com.VyMai.congtrunhanchia;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends Activity {
	EditText txtA,txtB,txtC;
	RadioButton radcong,radtru,radnhan,radchia;
	TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA =(EditText)findViewById(R.id.txtA);
        txtB =(EditText)findViewById(R.id.txtB);
        txtC = (EditText) findViewById(R.id.txtkq);
        radcong = (RadioButton) findViewById(R.id.radCong);
        radtru = (RadioButton) findViewById(R.id.radTru);
        radnhan = (RadioButton) findViewById(R.id.radNhan);
        radchia = (RadioButton) findViewById(R.id.radChia);
        txtkq=(TextView) findViewById(R.id.txtkq);
        Button btn = (Button) findViewById(R.id.btnThucHien);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				doShowInformation();
			}
		});
    }
    public void doShowInformation()
    {
    	int a= Integer.parseInt(txtA.getText().toString() );
    	int b= Integer.parseInt(txtB.getText().toString() );
    	if(radcong.isChecked()){
    		
    		txtkq.setText((a+b)+"");
    	}
    	if(radtru.isChecked()){
    		
    		txtkq.setText((a-b)+"");
    	}
    	if(radnhan.isChecked()){
    		
    		txtkq.setText((a*b)+"");
    	}
    	if(radchia.isChecked())
    	{
    		txtkq.setText((a/b)+"");
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
