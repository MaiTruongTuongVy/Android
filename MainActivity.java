package com.VyMai.chuyendoinam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDoi=(Button) findViewById(R.id.button1);
        btnDoi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stud
				
					EditText editnamduonglich=(EditText)
							findViewById(R.id.editnamduonglich);
					int n=Integer.parseInt(editnamduonglich.getText()+"");
					String can=null ,chi=null;
					switch(n%10){
					case 0: can="Canh";break;
					case 1: can="Tân";break;
					case 2: can="Nhâm";break;
					case 3: can="Quý";break;
					case 4: can="Giáp";break;
					case 5: can="Ất";break;
					case 6: can="Bính";break;
					case 7: can="Đinh";break;
					case 8: can="Mậu";break;
					case 9: can="Kỳ";break;
					}
					switch(n%12){
					case 0: can="Thân";break;
					case 1: can="Dậu";break;
					case 2: can="Tuất";break;
					case 3: can="Hợi";break;
					case 4: can="Tý";break;
					case 5: can="Sửu";break;
					case 6: can="Dần";break;
					case 7: can="Mẹo";break;
					case 8: can="Thìn";break;
					case 9: can="Tỵ";break;
					case 10: can="Ngọ";break;
					case 11: can="Mùi";break;
				
					}
				TextView txtkq=(TextView)findViewById(R.id.textView4);
				txtkq.setText(can+""+chi);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
