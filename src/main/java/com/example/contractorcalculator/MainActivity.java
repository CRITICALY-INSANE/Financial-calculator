package com.example.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText la;
    private EditText mater;
    private TextView tax;
    private TextView total;
    private TextView grand_total;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mater=findViewById(R.id.mater);
        la=findViewById(R.id.bor);
        tax=findViewById(R.id.tax);
        total=findViewById(R.id.total);
        grand_total=findViewById(R.id.grand_total);
        calculate=findViewById(R.id.cal);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String labour=la.getText().toString().trim();
                String material=mater.getText().toString().trim();
                if (la.getText().toString().trim().length() == 0  ||  mater.getText().toString().trim().length()==0){
                    Toast.makeText(getApplicationContext(),"Empty input",Toast.LENGTH_SHORT).show();
                }
                else{
                    float laour = Float.parseFloat(la.getText().toString().trim());
                    float materi = Float.parseFloat(mater.getText().toString().trim());
                    float total1=laour+materi;
                    String toal= String.valueOf(total1);
                    total.setText(toal);
                    float t3= (float) (0.05* total1);
                    String t2=String.valueOf(t3);
                    tax.setText(t2);
                    float gra=t3+total1;
                    grand_total.setText(String.valueOf(gra));
                }
            }
        });
    }
    
}