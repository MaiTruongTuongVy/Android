package com.VyMai.listenerinvariable;
import java.text.DecimalFormat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class DoiCF extends Activity {
	private Button btnFar,btnCel,btnClear;
	private EditText txtFar,txtCel;
	private OnClickListener myVarListener=new OnClickListener() {

		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			
				
				double C=Double.parseDouble(txtCel.getText()+"");
		    	double F=Double.parseDouble(txtFar.getText()+"");
				if(arg0==btnFar){
					double F1=C*(9/5)+32;
					DecimalFormat dcf=new DecimalFormat("#.0");
					txtFar.setText(dcf.format(F1));
				}
				else if(arg0==btnCel){
					double C1=(F-32)*(5/9);
					DecimalFormat dcf=new DecimalFormat("#.0");
					txtCel.setText(dcf.format(C1));	
				}
				else if(arg0==btnClear)
				{
				txtFar.setText("");
				txtCel.setText("");
				txtFar.requestFocus();
				}
				}
		};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doi_cf);
        txtFar=(EditText)findViewById(R.id.txtFar);
		txtCel=(EditText)findViewById(R.id.txtCel);
		btnFar=(Button)findViewById(R.id.btnFar);
		btnCel=(Button)findViewById(R.id.btnCel);
		btnClear=(Button)findViewById(R.id.btnClear);
		btnFar.setOnClickListener((android.view.View.OnClickListener) myVarListener);
		btnCel.setOnClickListener((android.view.View.OnClickListener) myVarListener);
		btnClear.setOnClickListener((android.view.View.OnClickListener) myVarListener);
		}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.doi_c, menu);
        return true;
    }
    
}
