package Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sum.R;

public class Hept extends AppCompatActivity {
    EditText txt1, txt2, txt3;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hept);
        txt1=findViewById(R.id.T3tv1);
        txt2=findViewById(R.id.T3tv2);
        txt3=findViewById(R.id.T3tv3);
        btn1=findViewById(R.id.T3btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Hept.this,Hept2.class);
                intent.putExtra("a",txt1.getText().toString());
                intent.putExtra("b",txt2.getText().toString());
                intent.putExtra("c",txt3.getText().toString());
                startActivity(intent);
            }
        });
    }
}